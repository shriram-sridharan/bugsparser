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
#include "ModelClasses/LogicalNodeStatement.hpp"
#include "ModelClasses/ForStatement.hpp"

#include "ModelClasses/UnivariateNode.hpp"
#include "ModelClasses/MultivariateNode.hpp"
#include "ModelClasses/LinkFunctionNode.hpp"

#include "ModelClasses/UnivariateDistribution.hpp"
#include "ModelClasses/MultivariateDistribution.hpp"
#include "ModelClasses/MVDParameters.hpp"

#include "ModelClasses/Expression.hpp"
#include "ModelClasses/MultiDimExpression.hpp"
#include "ModelClasses/LogicalNodeExpression.hpp"

#include "ModelClasses/ScalarFunction.hpp"
}

/* Parser Rules*/
prog returns [Program program]
	: MODEL OPENBRACE statements CLOSEBRACE {$program.statements = $statements.stat;}
	;

statements returns [list<IStatement* > stat]:  
	((uvNode TILDE) => ste1=stochasticNodeExpr {$stat.push_back($ste1.stochasticNodeStatement);}
	| (mvNode TILDE) => ste2=stochasticNodeExpr {$stat.push_back($ste2.stochasticNodeStatement);}
	| (uvNode LEFTPOINTER) => lne1=logicalNodeExpr {$stat.push_back($lne1.logicalNodeStatement);}
	| (mvNode LEFTPOINTER) => lne2=logicalNodeExpr 
	| (linkFunction LEFTPOINTER) =>  lne3=logicalNodeExpr  {$stat.push_back($lne3.logicalNodeStatement);}
	| sf=startFor stats=statements endFor
	{
	ForStatement* forstat = new ForStatement();
	forstat->loopvariable = $sf.loopvariable;
	forstat->loopbegin = $sf.loopbegin;
	forstat->loopend = $sf.loopend;
	forstat->begintype = $sf.begintype;
	forstat->endtype=$sf.endtype;
	forstat->statements = $stats.stat;
	$stat.push_back(forstat);
	}
	)+
	;

stochasticNodeExpr returns [StochasticNodeStatement* stochasticNodeStatement = new StochasticNodeStatement()]
	: (uvNode) => uvsne=uvStochasticNodeExpr (censor | truncation)? 
	{$stochasticNodeStatement->node = $uvsne.uvnode; $stochasticNodeStatement->distribution = $uvsne.uvdistribution;}
	| mvsne=mvStochasticNodeExpr  
	{$stochasticNodeStatement->node = $mvsne.mvnode; $stochasticNodeStatement->distribution = $mvsne.mvdistribution;}
	;

uvStochasticNodeExpr returns[UnivariateNode* uvnode, UnivariateDistribution* uvdistribution]
	:uvNode {$uvnode = $uvNode.uvnode;} 
	TILDE 
	uvDistribution  {$uvdistribution = $uvDistribution.distribution;}
	;
mvStochasticNodeExpr returns[MultivariateNode* mvnode, MultivariateDistribution* mvdistribution]
	:mvNode {$mvnode = $mvNode.mvnode;} 
	TILDE 
	mvDistribution {$mvdistribution = $mvDistribution.distribution;}
	;
	
censor
	 : (CENSORBEGINWITHC|CENSORBEGINWITHI) 
	 ( (uvNode|CONSTANTVALUE) =>lowerWithOptionalUpper  | upperWithOptionalLower )  CLOSEBRACKET
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

logicalNodeExpr returns [LogicalNodeStatement* logicalNodeStatement = new LogicalNodeStatement()]
	: (uvNode | linkFunction) => 
	(uvNode {$logicalNodeStatement->logicalNode = $uvNode.uvnode;}
	| linkFunction {$logicalNodeStatement->logicalNode = $linkFunction.linkfunction;}) 
	LEFTPOINTER ex1=exprWithNodesFunctions {$logicalNodeStatement->logicalnodeexp= $ex1.exp;}
	|  mvNode LEFTPOINTER exprWithNodesFunctions  
	;

linkFunction returns [LinkFunctionNode* linkfunction = new LinkFunctionNode()]
	: LOGOPENBRACKET uvNode CLOSEBRACKET  {$linkfunction->linkfunction = "LOG"; $linkfunction->uvnode=$uvNode.uvnode;}
	| LOGITOPENBRACKET uvNode CLOSEBRACKET {$linkfunction->linkfunction = "LOGIT"; $linkfunction->uvnode=$uvNode.uvnode;}
	| CLOGLOGOPENBRACKET uvNode CLOSEBRACKET {$linkfunction->linkfunction = "CLOGLOG"; $linkfunction->uvnode=$uvNode.uvnode;}
	| PROBITOPENBRACKET uvNode CLOSEBRACKET {$linkfunction->linkfunction = "PROBIT"; $linkfunction->uvnode=$uvNode.uvnode;}
	;

exprWithNodesFunctions returns [LogicalNodeExpression* exp = new LogicalNodeExpression()]
	: (ue1=unaryExpression {$exp->expvalue = $ue1.uexpvalue; $exp->type=LCONSTANT;}
	| uvNode {$exp->uvnode = $uvNode.uvnode;  $exp->type=LNODE;}
	| OPENBRACKET MINUS ue2=unaryExpression  CLOSEBRACKET {$exp->expvalue = -$ue1.uexpvalue; $exp->type=LCONSTANT;}
	| scalarFunctions {$exp->function = $scalarFunctions.function; $exp->type=LFUNCTION;}
	| vectorFunctions 
	| OPENBRACKET ex1=exprWithNodesFunctions CLOSEBRACKET {$exp->exp = $ex1.exp; $exp->type=LEXPRESSION;})
	((PLUS {$exp->op ='+';} 
	|MINUS {$exp->op ='-';}
	| MULT {$exp->op ='*';}
	|DIV {$exp->op ='/';}) 
	ex2=exprWithNodesFunctions {$exp->children.push_back($ex2.exp);})?
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
mvNode returns [MultivariateNode* mvnode = new MultivariateNode()]
	: NODENAME OPENSQUAREBRACKET mi=multiIndices CLOSESQUAREBRACKET
	{$mvnode->nodeid = $NODENAME.text; $mvnode->indices=$mi.indices;}
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
multiIndices returns [vector<MultiDimExpression* > indices]
	: me1=multiDimExpression {$indices.push_back($me1.exp);}
	 (COMMA me2=multiDimExpression {$indices.push_back($me2.exp);})*
	;
	
multiDimExpression returns[MultiDimExpression* exp = new MultiDimExpression()]
	: (OPENBRACKET expression COLON) => OPENBRACKET ex1=expression COLON ex2=expression CLOSEBRACKET
	{$exp->colon=true; $exp->expbeforecolon=$ex1.exp; $exp->expaftercolon=$ex2.exp;}
	| ex3=expression {$exp->colon=false; $exp->expbeforecolon=$ex3.exp;}
	(COLON ex4=expression {$exp->colon=true; $exp->expaftercolon=$ex4.exp;})? 
	;

startFor returns [string loopvariable, LoopParam loopbegin, LoopParamType begintype, LoopParam loopend, LoopParamType endtype]
	: FORSTART OPENBRACKET loopVariable IN loopBegin COLON loopEnd CLOSEBRACKET OPENBRACE 
	{$loopvariable = $loopVariable.text; 
	$loopbegin = $loopBegin.loopbegin;
	$loopend = $loopEnd.loopend;
	$begintype = $loopBegin.type;
	$endtype = $loopEnd.type;}
	;

endFor 
	: CLOSEBRACE
	;

loopVariable 
	: NODENAME
	;
/*uvNode cannot be stochastic. It should be from the data only*/
loopBegin returns [LoopParam loopbegin, LoopParamType type]
	: uvNode {$loopbegin.uvnode = $uvNode.uvnode; $type=LOOPNODE;}
	| CONSTANTINT {$loopbegin.constant = ::atoi($CONSTANTINT.text.c_str()); $type=LOOPINT;}
	;

loopEnd  returns [LoopParam loopend, LoopParamType type]
	: uvNode  {$loopend.uvnode = $uvNode.uvnode; $type=LOOPNODE;}
	| CONSTANTINT {$loopend.constant = ::atoi($CONSTANTINT.text.c_str()); $type=LOOPINT;}
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

scalarFunctions returns [ScalarFunction* function = new ScalarFunction()]
	: ABSOPENBRACKET ex1=exprWithNodesFunctions CLOSEBRACKET {$function->name="ABS"; $function->parameter=$ex1.exp;}
	;

vectorFunctions 
	: INVERSEOPENBRACKET mvNode CLOSEBRACKET
	;
	
uvDistribution returns [UnivariateDistribution* distribution = new UnivariateDistribution()]
	: discreteUnivariate {$distribution->name = $discreteUnivariate.name; $distribution->distributionParameters = $discreteUnivariate.parameters;}
	| continuousUnivariate {$distribution->name = $continuousUnivariate.name; $distribution->distributionParameters = $continuousUnivariate.parameters;}
	;

mvDistribution returns [MultivariateDistribution* distribution = new MultivariateDistribution()]
	: discreteMultivariate {$distribution->name = $discreteMultivariate.name; $distribution->distributionParameters = $discreteMultivariate.parameters;}
	| continuousMultivariate {$distribution->name = $continuousMultivariate.name; $distribution->distributionParameters = $continuousMultivariate.parameters;}
	;

discreteUnivariate returns [string name, vector<Expression* > parameters]
	: bernoulli {$name="BERNOULLI"; $parameters=$bernoulli.parameters;}
	;

continuousUnivariate returns [std::string name, vector<Expression* > parameters]
	: beta {$name="BETA"; $parameters=$beta.parameters;}
	;

discreteMultivariate returns [string name, vector<MVDParameters* > parameters]
	: multinomial {$name="MULTINOMIAL"; $parameters=$multinomial.parameters;}
	;

continuousMultivariate returns [string name, vector<MVDParameters* > parameters]
	: dirichlet {$name="DIRICHLET"; $parameters=$dirichlet.parameters;}
	;
	
distributionParameter returns [Expression* exp = new Expression()]
	: uvNode {$exp->uvnode=$uvNode.uvnode; $exp->type=NODE;}
	| unaryExpression {$exp->expvalue=$unaryExpression.uexpvalue; $exp->type=CONSTANT;}
	;
	
bernoulli returns [vector<Expression* > parameters]
	: BERNOULLIOPENBRACKET distributionParameter CLOSEBRACKET {$parameters.push_back($distributionParameter.exp);}
	;

beta returns [vector<Expression* > parameters]
	: BETAOPENBRACKET dp1=distributionParameter  COMMA dp2=distributionParameter CLOSEBRACKET {$parameters.push_back($dp1.exp); $parameters.push_back($dp2.exp);}
	;

multinomial returns [vector<MVDParameters* > parameters]
	: MUTLTINOMIALOPENBRACKET dp1=mvNode COMMA 
	dp2=distributionParameter CLOSEBRACKET
	{MVDParameters* param1 = new MVDParameters(); param1->type=MVNODE; param1->mvnode = $dp1.mvnode; $parameters.push_back(param1);
	MVDParameters* param2  = new MVDParameters(); param2->type=MVDEXPRESSION; param1->exp = $dp2.exp; $parameters.push_back(param2);}
	;

dirichlet returns [vector<MVDParameters* > parameters]
	: DIRICHLETOPENBRACKET dp1=mvNode CLOSEBRACKET 
	{MVDParameters* param1 = new MVDParameters(); param1->type=MVNODE; param1->mvnode = $dp1.mvnode; $parameters.push_back(param1);}
	;
