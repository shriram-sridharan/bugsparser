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
	EQUALTO='=';
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
#include "ModelClasses/StochasticNodeStatement.hpp"
#include "ModelClasses/UnivariateNode.hpp"
#include "ModelClasses/Expression.hpp"
}

/* Parser Rules*/
prog returns [Program program]
	: MODEL OPENBRACE statements CLOSEBRACE {$program.statements = $statements.stat;}
	;

statements returns [list<IStatement* > stat]:  
	((uvNode TILDE) => ste1=stochasticNodeExpr {$stat.push_back($ste1.stochasticNodeStatement);}
	| (mvNode TILDE) => ste2=stochasticNodeExpr {$stat.push_back($ste2.stochasticNodeStatement);}
	| (uvNode LEFTPOINTER) => lne1=logicalNodeExpr 
	| (mvNode LEFTPOINTER) => lne2=logicalNodeExpr 
	| (linkFunction LEFTPOINTER) =>  lne3=logicalNodeExpr 
	| sf=startFor statements endFor)+
	;

stochasticNodeExpr returns [StochasticNodeStatement* stochasticNodeStatement = new StochasticNodeStatement()]
	: (uvNode) => uvsne=uvStochasticNodeExpr (censor | truncation)? {$stochasticNodeStatement->node = $uvsne.univariateNode;}
	| mvsne=mvStochasticNodeExpr 
	;

uvStochasticNodeExpr returns[UnivariateNode* univariateNode = new UnivariateNode()]
	:uvNode {$univariateNode->nodeid = $uvNode.nodeid; $univariateNode->indices = $uvNode.indices;} 
	TILDE 
	uvDistribution  
	;
mvStochasticNodeExpr
	:mvNode TILDE mvDistribution 
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
	: (uvNode | linkFunction) => 
	(uvNode | linkFunction ) 
	LEFTPOINTER exprWithNodesFunctions
	|  mvNode LEFTPOINTER exprWithNodesFunctions  
	;

linkFunction
	: LOGOPENBRACKET uvNode CLOSEBRACKET  
	| LOGITOPENBRACKET uvNode CLOSEBRACKET 
	| CLOGLOGOPENBRACKET uvNode CLOSEBRACKET 
	| PROBITOPENBRACKET uvNode CLOSEBRACKET 
	;

exprWithNodesFunctions
	: (ue1=unaryExpression
	| uvNode 
	| OPENBRACKET MINUS ue2=unaryExpression  CLOSEBRACKET 
	| scalarFunctions
	| vectorFunctions 
	| OPENBRACKET ex1=exprWithNodesFunctions CLOSEBRACKET)
	((PLUS |MINUS | MULT |DIV) ex2=exprWithNodesFunctions)?
	;

uvNode returns [std::string nodeid, vector<Expression*> indices]
	: NODENAME {$nodeid = $NODENAME.text;}
	(
	OPENSQUAREBRACKET exp1=expression {$indices.push_back($exp1.exp);} 
	(
	COMMA exp2=expression {$indices.push_back($exp2.exp);}
	)* 
	 CLOSESQUAREBRACKET
	 )?
	;
mvNode 
	: NODENAME OPENSQUAREBRACKET multiIndices CLOSESQUAREBRACKET
	;

expression returns [Expression* exp = new Expression()]
	: (unaryExpression {$exp->expvalue=$unaryExpression.uexpvalue; $exp->type=CONSTANT;} 
	| uvNode {UnivariateNode* uvnode = new UnivariateNode(); uvnode->nodeid = $uvNode.nodeid; uvnode->indices = $uvNode.indices; $exp->uvnode=uvnode; $exp->type=NODE;}
	| OPENBRACKET e5=expression CLOSEBRACKET {$exp->exp = $e5.exp; $exp->type=EXPRESSION;})
	(PLUS e1=expression {$exp->op ='+'; $exp->children.push_back($e1.exp);}
	|MINUS e2=expression {$exp->op ='-'; $exp->children.push_back($e2.exp);}
	|MULT e3=expression {$exp->op ='*'; $exp->children.push_back($e3.exp);}
	|DIV e4=expression {$exp->op ='/'; $exp->children.push_back($e4.exp);})?
	;

unaryExpression returns [float uexpvalue]
	: CONSTANTINT  {$uexpvalue = ::atoi($CONSTANTINT.text.c_str());}
	| CONSTANTVALUE {$uexpvalue = ::atof($CONSTANTVALUE.text.c_str());}
	;
multiIndices 
	: multiDimExpression (COMMA multiDimExpression)*
	;
	
multiDimExpression
	: (OPENBRACKET expression COLON) => OPENBRACKET expression COLON expression CLOSEBRACKET
	| expression (COLON expression)?
	;

startFor returns [std::string loopvariable, int loopbegin, int loopend]
	: FORSTART OPENBRACKET loopVariable IN loopBegin COLON loopEnd CLOSEBRACKET OPENBRACE 
	{$loopvariable = $loopVariable.text; $loopbegin = $loopBegin.value; $loopend = $loopEnd.value;}
	;

endFor 
	: CLOSEBRACE
	;

loopVariable 
	: NODENAME
	;
/*uvNode cannot be stochastic. It should be from the data only*/
loopBegin returns [int value]
	: uvNode
	| CONSTANTINT {$value = ::atoi($CONSTANTINT.text.c_str());}
	;

loopEnd returns [int value]
	: uvNode  
	| CONSTANTINT {$value = ::atoi($CONSTANTINT.text.c_str());}
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

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| ';' | '\u000C' )+    { $channel = HIDDEN; skip();} ;

scalarFunctions 
	: ABSOPENBRACKET exprWithNodesFunctions CLOSEBRACKET
	;

vectorFunctions 
	: INVERSEOPENBRACKET mvNode CLOSEBRACKET
	;
	
uvDistribution 
	: discreteUnivariate
	| continuousUnivariate
	;

mvDistribution
	: discreteMultivariate 
	| continuousMultivariate 
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
