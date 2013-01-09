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
#include <sstream>
#include "BUGSLexer.hpp"
#include "ModelClasses/Program.hpp"
#include "DataClasses/IData.hpp"
}

@parser::members {
IData* data;
bool calculateNodeValue = true;
}
/* Parser Rules*/
prog [IData* inputdata] returns [Program program]
@init{
	data = $inputdata;
}
	: MODEL OPENBRACE statements CLOSEBRACE {$program.nodes = $statements.nodes;}
	;

statements returns [vector<Node* > nodes]:  
	((uvNode TILDE) => ste1=stochasticNodeExpr {$nodes.push_back($ste1.stochasticNode);}
	| (mvNode TILDE) => ste2=stochasticNodeExpr {$nodes.push_back($ste2.stochasticNode);}
	| (uvNode LEFTPOINTER) => lne1=logicalNodeExpr {$nodes.push_back($lne1.logicalNode);}
	| (mvNode LEFTPOINTER) => lne2=logicalNodeExpr {$nodes.push_back($lne2.logicalNode);}
	| (linkFunction LEFTPOINTER) =>  lne3=logicalNodeExpr {$nodes.push_back($lne3.logicalNode);}
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

logicalNodeExpr returns [LogicalNode* logicalNode = new LogicalNode()]
@init{
calculateNodeValue=false; 
}
@after{
calculateNodeValue=true;
}
	: (uvNode | linkFunction) => 
	(uvNode {$logicalNode->nodename = $uvNode.text; } 
	| linkFunction { $logicalNode->nodename = $linkFunction.nodename; $logicalNode->functionname = $linkFunction.fname;}) 
	LEFTPOINTER exprWithNodesFunctions { $logicalNode->expressionnodes = $exprWithNodesFunctions.enodes;}
	|  mvNode LEFTPOINTER exprWithNodesFunctions  {$logicalNode->nodename = $mvNode.text; } 
	;

linkFunction returns[std::string fname, std::string nodename]
	: LOGOPENBRACKET uvNode CLOSEBRACKET  {$nodename = $uvNode.text; $fname = "LOG";}
	| LOGITOPENBRACKET uvNode CLOSEBRACKET {$nodename = $uvNode.text; $fname = "LOGIT";}
	| CLOGLOGOPENBRACKET uvNode CLOSEBRACKET {$nodename = $uvNode.text; $fname = "CLOGLOG";}
	| PROBITOPENBRACKET uvNode CLOSEBRACKET {$nodename = $uvNode.text; $fname = "PROBIT";}
	;

exprWithNodesFunctions returns [std::vector<ExpressionNode*>  enodes]
	: (ue1=unaryExpression {stringstream ss (stringstream::in | stringstream::out); ss<< $ue1.uexpvalue; $enodes.push_back(new ExpressionNode(ss.str(), NUMBER));}
	| uvNode {$enodes.push_back(new ExpressionNode($uvNode.text, NODE));}
	| OPENBRACKET MINUS ue2=unaryExpression  CLOSEBRACKET {stringstream ss (stringstream::in | stringstream::out); ss<< -$ue2.uexpvalue; $enodes.push_back(new ExpressionNode(ss.str(), NUMBER));}
	| scalarFunctions {$enodes.push_back(new ExpressionNode($scalarFunctions.text, FUNCTION));}
	| vectorFunctions {$enodes.push_back(new ExpressionNode($vectorFunctions.text, FUNCTION));}
	| OPENBRACKET ex1=exprWithNodesFunctions CLOSEBRACKET {$enodes.insert($enodes.end(),$ex1.enodes.begin(), $ex1.enodes.end());} ) 
	((PLUS {$enodes.push_back(new ExpressionNode("+", OPERATOR));}|MINUS {$enodes.push_back(new ExpressionNode("-", OPERATOR));}
	| MULT {$enodes.push_back(new ExpressionNode("*", OPERATOR));} |DIV {$enodes.push_back(new ExpressionNode("/", OPERATOR));}) 
	ex2=exprWithNodesFunctions {$enodes.insert($enodes.end(), $ex2.enodes.begin(), $ex2.enodes.end());}
	)?
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
	: (unaryExpression {$expvalue=$unaryExpression.uexpvalue;} 
	| uvNode {if(calculateNodeValue) $expvalue = data->getData($uvNode.name, $uvNode.parameters);}
	| OPENBRACKET e5=expression CLOSEBRACKET {$expvalue = $e5.expvalue;})
	(PLUS e1=expression {$expvalue+=$e1.expvalue;}
	|MINUS e2=expression {$expvalue-=$e2.expvalue;}
	|MULT e3=expression {$expvalue*=$e3.expvalue;}
	|DIV e4=expression {$expvalue/=$e4.expvalue;})?
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
