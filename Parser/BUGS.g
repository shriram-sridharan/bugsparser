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
#include "ModelClasses/UnivariateDistribution.hpp"
#include "ModelClasses/Expression.hpp"
}

/* Parser Rules*/
prog returns [Program program]
	: MODEL OPENBRACE statements CLOSEBRACE {$program.statements = $statements.stat;}
	;

statements returns [list<IStatement* > stat]:  
	((uvNode TILDE) => ste1=stochasticNodeExpr {$stat.push_back($ste1.stochasticNodeStatement);}
	| (mvNode TILDE) => ste2=stochasticNodeExpr 
	| (uvNode LEFTPOINTER) => lne1=logicalNodeExpr 
	| (mvNode LEFTPOINTER) => lne2=logicalNodeExpr 
	| (linkFunction LEFTPOINTER) =>  lne3=logicalNodeExpr 
	| sf=startFor statements endFor)+
	;

stochasticNodeExpr returns [StochasticNodeStatement* stochasticNodeStatement = new StochasticNodeStatement()]
	: (uvNode) => uvsne=uvStochasticNodeExpr (censor | truncation)? {$stochasticNodeStatement->node = $uvsne.uvnode; $stochasticNodeStatement->distribution = $uvsne.uvdistribution;}
	| mvsne=mvStochasticNodeExpr 
	;

uvStochasticNodeExpr returns[UnivariateNode* uvnode, UnivariateDistribution* uvdistribution]
	:uvNode {$uvnode = $uvNode.uvnode;} 
	TILDE 
	uvDistribution  {$uvdistribution = $uvDistribution.distribution;}
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

uvNode returns [UnivariateNode* uvnode = new UnivariateNode()]
	: NODENAME {$uvnode->nodeid = $NODENAME.text;}
	(
	OPENSQUAREBRACKET exp1=expression {$uvnode->indices.push_back($exp1.exp);} 
	(
	COMMA exp2=expression {$uvnode->indices.push_back($exp2.exp);}
	)* 
	 CLOSESQUAREBRACKET
	 )?
	;
mvNode 
	: NODENAME OPENSQUAREBRACKET multiIndices CLOSESQUAREBRACKET
	;

expression returns [Expression* exp = new Expression()]
	: (unaryExpression {$exp->expvalue=$unaryExpression.uexpvalue; $exp->type=CONSTANT;} 
	| uvNode {$exp->uvnode=$uvNode.uvnode; $exp->type=NODE;}
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
	
uvDistribution returns [UnivariateDistribution* distribution = new UnivariateDistribution()]
	: discreteUnivariate {$distribution->name = $discreteUnivariate.name; $distribution->distributionParameters = $discreteUnivariate.parameters;}
	| continuousUnivariate {$distribution->name = $continuousUnivariate.name; $distribution->distributionParameters = $continuousUnivariate.parameters;}
	;

mvDistribution
	: discreteMultivariate 
	| continuousMultivariate 
	;

discreteUnivariate returns [string name, vector<Expression* > parameters]
	: bernoulli {$name="BERNOULLI"; $parameters=$bernoulli.parameters;}
	;

continuousUnivariate returns [std::string name, vector<Expression* > parameters]
	: beta {$name="BETA"; $parameters=$beta.parameters;}
	;

discreteMultivariate 
	: multinomial 
	;

continuousMultivariate 
	: dirichlet
	;
	
distributionParameter returns [Expression* exp = new Expression()]
	: uvNode {$exp->uvnode=$uvNode.uvnode; $exp->type=NODE;}| unaryExpression {$exp->expvalue=$unaryExpression.uexpvalue; $exp->type=CONSTANT;}
	;
	
bernoulli returns [vector<Expression* > parameters]
	: BERNOULLIOPENBRACKET distributionParameter CLOSEBRACKET {$parameters.push_back($distributionParameter.exp);}
	;

beta returns [vector<Expression* > parameters]
	: BETAOPENBRACKET dp1=distributionParameter  COMMA dp2=distributionParameter CLOSEBRACKET {$parameters.push_back($dp1.exp); $parameters.push_back($dp2.exp);}
	;

multinomial 
	: MUTLTINOMIALOPENBRACKET dp1=mvNode COMMA 
	dp2=distributionParameter CLOSEBRACKET
	;

dirichlet 
	: DIRICHLETOPENBRACKET mvNode CLOSEBRACKET 
	;
