grammar BUGS ;

options {language = Cpp;}

tokens {
	MODEL = 'model';
	LOGOPENBRACKET = 'log(';
	LOGITOPENBRACKET = 'logit(';
	CLOGLOGOPENBRACKET = 'cloglog(';
	PROBITOPENBRACKET = 'probit(';
	ABSOPENBRACKET = 'abs(';
	INVERSEOPENBRACKET = 'inverse(';

	BERNOULLIOPENBRACKET = 'dbern(';
	BETAOPENBRACKET = 'dbeta(';
	MUTLTINOMIALOPENBRACKET = 'dmulti(';
	DIRICHLETOPENBRACKET = 'ddirich(';

	FORSTART = 'for';
	IN = 'in';

	OPENBRACE = '{';
	CLOSEBRACE = '}';
	TILDE = '~';
	CENSORBEGINWITHC = 'C(';
	CENSORBEGINWITHI = 'I(';
	TRUNCATIONBEGIN = 'T(';
	OPENBRACKET = '(';
	CLOSEBRACKET = ')';
	COMMA =  ',';
	OPENSQUAREBRACKET = '[';
	CLOSESQUAREBRACKET = ']';
	LEFTPOINTER = '<-';
	PLUS = '+';
	MINUS = '-';
	MULT = '*';
	DIV = '/';
	COLON = ':';	
	DOT='.';
}

@lexer::namespace {BUGS}
@parser::namespace {BUGS}
@lexer::traits {

     class BUGSLexer; class BUGSParser;

     typedef antlr3::Traits< BUGSLexer, BUGSParser > BUGSLexerTraits;

     typedef BUGSLexerTraits BUGSParserTraits;

}
@lexer::includes{
#include <iostream>
using namespace std;
}
@parser::includes{
#include "BUGSLexer.hpp"
#include "ModelClasses/Program.hpp"
#include "DataClasses/IData.hpp"
}

@parser::members {
IData* data;
}
/* Parser Rules*/
prog [IData* inputdata] returns [Program program]
@init{
	data = $inputdata;
}
	: MODEL OPENBRACE statements CLOSEBRACE {$program.nodes = $statements.nodes;}
	;

statements returns [list<Node* > nodes]:  
	((uvNode TILDE) => ste1=stochasticNodeExpr {$nodes.push_back($ste1.stochasticNode);}
	| (mvNode TILDE) => ste2=stochasticNodeExpr {$nodes.push_back($ste2.stochasticNode);}
	| (uvNode LEFTPOINTER) => logicalNodeExpr 
	| (mvNode LEFTPOINTER) => logicalNodeExpr 
	| (linkFunction LEFTPOINTER) => logicalNodeExpr 
	| (startFor statements endFor) 
	)+
	;

stochasticNodeExpr returns [StochasticNode* stochasticNode]
	: (uvNode) => uvsne=uvStochasticNodeExpr (censor | truncation)? {$stochasticNode= $uvsne.univariateNode;}
	| mvsne=mvStochasticNodeExpr {$stochasticNode= $mvsne.multivariateNode;}
	;

uvStochasticNodeExpr returns[UnivariateNode* univariateNode = new UnivariateNode()]
	:uvNode {$univariateNode->nodename = $uvNode.name; $univariateNode->parameters = $uvNode.parameters;} 
	TILDE 
	uvDistribution  {$univariateNode->distribution = $uvDistribution.uvdis;}
	;
mvStochasticNodeExpr returns[MultivariateNode* multivariateNode = new MultivariateNode()]
	:mvNode {$multivariateNode->nodename = $mvNode.text;} TILDE mvDistribution {$multivariateNode->distribution = $mvDistribution.mvdis;}
	;
	
censor
	 : (CENSORBEGINWITHC|CENSORBEGINWITHI) ( (uvNode|CONSTANTVALUE) =>lowerWithOptionalUpper  | upperWithOptionalLower )  CLOSEBRACKET
	 ;
truncation 
	: TRUNCATIONBEGIN (  (uvNode|CONSTANTVALUE) => lowerWithOptionalUpper | upperWithOptionalLower )  CLOSEBRACKET
	;
	
lowerWithOptionalUpper 
	:  (uvNode|CONSTANTVALUE) COMMA (uvNode|CONSTANTVALUE)?
	;
	
upperWithOptionalLower 
	:  (uvNode|CONSTANTVALUE)? COMMA (uvNode|CONSTANTVALUE)
	;

logicalNodeExpr 
	: (uvNode | linkFunction) => (uvNode | linkFunction) LEFTPOINTER exprWithNodesFunctions
	|  mvNode LEFTPOINTER exprWithNodesFunctions
	;

linkFunction 
	: LOGOPENBRACKET uvNode CLOSEBRACKET 
	| LOGITOPENBRACKET uvNode CLOSEBRACKET
	| CLOGLOGOPENBRACKET uvNode CLOSEBRACKET
	| PROBITOPENBRACKET uvNode CLOSEBRACKET
	;

exprWithNodesFunctions 
	: (unaryExpression | OPENBRACKET MINUS unaryExpression  CLOSEBRACKET 
	| MINUS unaryExpression | scalarFunctions | vectorFunctions ) 
	((PLUS|MINUS|MULT|DIV) exprWithNodesFunctions)?
	;

uvNode returns [std::string name, vector<int> parameters]
	: NODENAME {$name = $NODENAME.text;}
	(
	OPENSQUAREBRACKET exp1=expression {$parameters.push_back(int ($exp1.expvalue));} 
	(
	COMMA exp2=expression {$parameters.push_back(int ($exp2.expvalue));}
	)* 
	 CLOSESQUAREBRACKET
	 )?
	;
mvNode 
	: NODENAME OPENSQUAREBRACKET multiIndices CLOSESQUAREBRACKET
	;

expression returns [float expvalue]
	: unaryExpression {$expvalue=$unaryExpression.uexpvalue;} 
	(PLUS e1=expression {$expvalue+=$e1.expvalue;}
	|MINUS e2=expression {$expvalue-=$e2.expvalue;}
	|MULT e3=expression {$expvalue*=$e3.expvalue;}
	|DIV e4=expression {$expvalue/=$e4.expvalue;})?
	;

unaryExpression returns [float uexpvalue]
	: CONSTANTINT  {$uexpvalue = ::atoi($CONSTANTINT.text.c_str());}
	| CONSTANTVALUE {$uexpvalue = ::atof($CONSTANTVALUE.text.c_str());}
	| uvNode {$uexpvalue = data->getData($uvNode.name, $uvNode.parameters);}
	| OPENBRACKET expression CLOSEBRACKET {$uexpvalue = $expression.expvalue;}
	;

multiIndices 
	: multiDimExpression (COMMA multiDimExpression)*
	;
	
multiDimExpression
	: (OPENBRACKET expression COLON) => OPENBRACKET expression COLON expression CLOSEBRACKET
	| expression (COLON expression)?
	;

startFor 
	: FORSTART OPENBRACKET loopVariable IN loopBegin COLON loopEnd CLOSEBRACKET OPENBRACE 
	;

endFor 
	: CLOSEBRACE
	;

loopVariable 
	: NODENAME
	;

loopBegin 
	: uvNode 
	| CONSTANTINT
	;

loopEnd 
	: uvNode 
	| CONSTANTINT
	;

CONSTANTINT
	: ('0'..'9')+ 
	;
	
NODENAME 
	:('a'..'z'| 'A'..'Z') ('a'..'z'| 'A'..'Z'| '0'..'9'| '.')* 
	;

CONSTANTVALUE 
	: ('0'..'9')+(DOT('0'..'9')+)?('E'(PLUS|MINUS)?('0'..'9')+)? 
	| OPENBRACKET (PLUS|MINUS) ('0'..'9')+ CLOSEBRACKET (DOT('0'..'9')+)?('E'(PLUS|MINUS)?('0'..'9')+)? 
	;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| ';' | '\u000C' )+    { $channel = HIDDEN; } ;

scalarFunctions 
	: ABSOPENBRACKET exprWithNodesFunctions CLOSEBRACKET
	;

vectorFunctions 
	: INVERSEOPENBRACKET mvNode CLOSEBRACKET
	;
	
uvDistribution returns [UnivariateDistribution* uvdis = new UnivariateDistribution()]
	: discreteUnivariate {$uvdis->name = $discreteUnivariate.name; $uvdis->parameters = $discreteUnivariate.parameters;}
	| continuousUnivariate {$uvdis->name = $continuousUnivariate.name; $uvdis->parameters = $continuousUnivariate.parameters;}
	;

mvDistribution returns [MultivariateDistribution* mvdis = new MultivariateDistribution()]
	: discreteMultivariate {$mvdis->name = $discreteMultivariate.name; $mvdis->parameters = $discreteMultivariate.parameters;}
	| continuousMultivariate {$mvdis->name = $continuousMultivariate.name; $mvdis->parameters = $continuousMultivariate.parameters;}
	;

discreteUnivariate returns [std::string name, std::list<string> parameters]
	: bernoulli {$name="BERNOULLI"; $parameters=$bernoulli.parameters;}
	;

continuousUnivariate returns [std::string name, std::list<string> parameters]
	: beta {$name="BETA"; $parameters=$beta.parameters;}
	;

discreteMultivariate returns [std::string name, std::list<string> parameters]
	: multinomial {$name="MULTINOMIAL"; $parameters=$multinomial.parameters;}
	;

continuousMultivariate  returns [std::string name, std::list<string> parameters]
	: dirichlet{$name="DIRICHLET"; $parameters=$dirichlet.parameters;}
	;
	
distributionParameter 
	: uvNode | CONSTANTINT | CONSTANTVALUE
	;
	
bernoulli returns [std::list<string> parameters]
	: BERNOULLIOPENBRACKET distributionParameter CLOSEBRACKET {$parameters.push_back($distributionParameter.text);}
	;

beta returns [std::list<string> parameters]
	: BETAOPENBRACKET dp1=distributionParameter  COMMA dp2=distributionParameter CLOSEBRACKET {$parameters.push_back($dp1.text); $parameters.push_back($dp2.text);}
	;

multinomial returns [std::list<string> parameters]
	: MUTLTINOMIALOPENBRACKET dp1=mvNode COMMA 
	dp2=distributionParameter CLOSEBRACKET {$parameters.push_back($dp1.text); $parameters.push_back($dp2.text);}
	;

dirichlet returns [std::list<string> parameters]
	: DIRICHLETOPENBRACKET mvNode CLOSEBRACKET {$parameters.push_back($mvNode.text);}
	;
