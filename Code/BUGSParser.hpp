/** \file
 *  This C++ header file was generated by $ANTLR version 3.5-rc-2
 *
 *     -  From the grammar source file : /u/s/h/shrirams/bugsparser/Parser/BUGS.g
 *     -                            On : 2013-01-09 18:08:46
 *     -                for the parser : BUGSParserParser
 *
 * Editing it, at least manually, is not wise.
 *
 * C++ language generator and runtime by Gokulakannan Somasundaram ( heavy lifting from C Run-time by Jim Idle )
 *
 *
 * The parser 
BUGSParser

has the callable functions (rules) shown below,
 * which will invoke the code for the associated rule in the source grammar
 * assuming that the input stream is pointing to a token/text stream that could begin
 * this rule.
 *
 * For instance if you call the first (topmost) rule in a parser grammar, you will
 * get the results of a full parse, but calling a rule half way through the grammar will
 * allow you to pass part of a full token stream to the parser, such as for syntax checking
 * in editors and so on.
 *
 */
// [The "BSD license"]
// Copyright (c) 2005-2009 Gokulakannan Somasundaram. 
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
// 3. The name of the author may not be used to endorse or promote products
//    derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
// IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
// OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
// IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
// NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
// THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

#ifndef	_BUGSParser_H
#define _BUGSParser_H
/* =============================================================================
 * Standard antlr3 C++ runtime definitions
 */
#include    <antlr3.hpp>

/* End of standard antlr 3 runtime definitions
 * =============================================================================
 */


#include <sstream>
#include "BUGSLexer.hpp"
#include "ModelClasses/Program.hpp"
#include "DataClasses/IData.hpp"




#ifdef	WIN32
// Disable: Unreferenced parameter,							- Rules with parameters that are not used
//          constant conditional,							- ANTLR realizes that a prediction is always true (synpred usually)
//          initialized but unused variable					- tree rewrite variables declared but not needed
//          Unreferenced local variable						- lexer rule declares but does not always use _type
//          potentially unitialized variable used			- retval always returned from a rule
//			unreferenced local function has been removed	- susually getTokenNames or freeScope, they can go without warnigns
//
// These are only really displayed at warning level /W4 but that is the code ideal I am aiming at
// and the codegen must generate some of these warnings by necessity, apart from 4100, which is
// usually generated when a parser rule is given a parameter that it does not use. Mostly though
// this is a matter of orthogonality hence I disable that one.
//
#pragma warning( disable : 4100 )
#pragma warning( disable : 4101 )
#pragma warning( disable : 4127 )
#pragma warning( disable : 4189 )
#pragma warning( disable : 4505 )
#pragma warning( disable : 4701 )
#endif

/* ========================
 * BACKTRACKING IS ENABLED
 * ========================
 */

	namespace BUGS {


typedef BUGSParserTraits BUGSParserImplTraits;

 struct synpred1_BUGS {}; 
 struct synpred2_BUGS {}; 
 struct synpred3_BUGS {}; 
 struct synpred4_BUGS {}; 
 struct synpred5_BUGS {}; 
 struct synpred6_BUGS {}; 
 struct synpred7_BUGS {}; 
 struct synpred8_BUGS {}; 
 struct synpred9_BUGS {}; 
 struct synpred10_BUGS {}; 

struct BUGSParser_linkFunction_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string fname;
    std::string nodename;

    
    BUGSParser_linkFunction_return()
    {
    }

    BUGSParser_linkFunction_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_linkFunction_return( const BUGSParser_linkFunction_return& n )
    : BaseType(n)
    , fname(n.fname) ,nodename(n.nodename) 
    {
    }

    BUGSParser_linkFunction_return&
    operator=( const BUGSParser_linkFunction_return& n )
    {
    	BaseType::operator=( n );
    	fname = n.fname; 
    	nodename = n.nodename; 
    	return *this;
    }

};





struct BUGSParser_uvNode_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string name;
    vector<int> parameters;

    
    BUGSParser_uvNode_return()
    {
    }

    BUGSParser_uvNode_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_uvNode_return( const BUGSParser_uvNode_return& n )
    : BaseType(n)
    , name(n.name) ,parameters(n.parameters) 
    {
    }

    BUGSParser_uvNode_return&
    operator=( const BUGSParser_uvNode_return& n )
    {
    	BaseType::operator=( n );
    	name = n.name; 
    	parameters = n.parameters; 
    	return *this;
    }

};





struct BUGSParser_mvNode_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;

    
    BUGSParser_mvNode_return()
    {
    }

    BUGSParser_mvNode_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_mvNode_return( const BUGSParser_mvNode_return& n )
    : BaseType(n)
    {
    }

    BUGSParser_mvNode_return&
    operator=( const BUGSParser_mvNode_return& n )
    {
    	BaseType::operator=( n );
    	return *this;
    }

};





struct BUGSParser_startFor_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string loopvariable;
    int loopbegin;
    int loopend;

    
    BUGSParser_startFor_return()
    {
    }

    BUGSParser_startFor_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_startFor_return( const BUGSParser_startFor_return& n )
    : BaseType(n)
    , loopvariable(n.loopvariable) ,loopbegin(n.loopbegin) ,loopend(n.loopend) 
    {
    }

    BUGSParser_startFor_return&
    operator=( const BUGSParser_startFor_return& n )
    {
    	BaseType::operator=( n );
    	loopvariable = n.loopvariable; 
    	loopbegin = n.loopbegin; 
    	loopend = n.loopend; 
    	return *this;
    }

};





struct BUGSParser_loopVariable_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;

    
    BUGSParser_loopVariable_return()
    {
    }

    BUGSParser_loopVariable_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_loopVariable_return( const BUGSParser_loopVariable_return& n )
    : BaseType(n)
    {
    }

    BUGSParser_loopVariable_return&
    operator=( const BUGSParser_loopVariable_return& n )
    {
    	BaseType::operator=( n );
    	return *this;
    }

};





struct BUGSParser_scalarFunctions_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;

    
    BUGSParser_scalarFunctions_return()
    {
    }

    BUGSParser_scalarFunctions_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_scalarFunctions_return( const BUGSParser_scalarFunctions_return& n )
    : BaseType(n)
    {
    }

    BUGSParser_scalarFunctions_return&
    operator=( const BUGSParser_scalarFunctions_return& n )
    {
    	BaseType::operator=( n );
    	return *this;
    }

};





struct BUGSParser_vectorFunctions_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;

    
    BUGSParser_vectorFunctions_return()
    {
    }

    BUGSParser_vectorFunctions_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_vectorFunctions_return( const BUGSParser_vectorFunctions_return& n )
    : BaseType(n)
    {
    }

    BUGSParser_vectorFunctions_return&
    operator=( const BUGSParser_vectorFunctions_return& n )
    {
    	BaseType::operator=( n );
    	return *this;
    }

};





struct BUGSParser_discreteUnivariate_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string name;
    std::list<string> parameters;

    
    BUGSParser_discreteUnivariate_return()
    {
    }

    BUGSParser_discreteUnivariate_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_discreteUnivariate_return( const BUGSParser_discreteUnivariate_return& n )
    : BaseType(n)
    , name(n.name) ,parameters(n.parameters) 
    {
    }

    BUGSParser_discreteUnivariate_return&
    operator=( const BUGSParser_discreteUnivariate_return& n )
    {
    	BaseType::operator=( n );
    	name = n.name; 
    	parameters = n.parameters; 
    	return *this;
    }

};





struct BUGSParser_continuousUnivariate_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string name;
    std::list<string> parameters;

    
    BUGSParser_continuousUnivariate_return()
    {
    }

    BUGSParser_continuousUnivariate_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_continuousUnivariate_return( const BUGSParser_continuousUnivariate_return& n )
    : BaseType(n)
    , name(n.name) ,parameters(n.parameters) 
    {
    }

    BUGSParser_continuousUnivariate_return&
    operator=( const BUGSParser_continuousUnivariate_return& n )
    {
    	BaseType::operator=( n );
    	name = n.name; 
    	parameters = n.parameters; 
    	return *this;
    }

};





struct BUGSParser_discreteMultivariate_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string name;
    std::list<string> parameters;

    
    BUGSParser_discreteMultivariate_return()
    {
    }

    BUGSParser_discreteMultivariate_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_discreteMultivariate_return( const BUGSParser_discreteMultivariate_return& n )
    : BaseType(n)
    , name(n.name) ,parameters(n.parameters) 
    {
    }

    BUGSParser_discreteMultivariate_return&
    operator=( const BUGSParser_discreteMultivariate_return& n )
    {
    	BaseType::operator=( n );
    	name = n.name; 
    	parameters = n.parameters; 
    	return *this;
    }

};





struct BUGSParser_continuousMultivariate_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;
    std::string name;
    std::list<string> parameters;

    
    BUGSParser_continuousMultivariate_return()
    {
    }

    BUGSParser_continuousMultivariate_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_continuousMultivariate_return( const BUGSParser_continuousMultivariate_return& n )
    : BaseType(n)
    , name(n.name) ,parameters(n.parameters) 
    {
    }

    BUGSParser_continuousMultivariate_return&
    operator=( const BUGSParser_continuousMultivariate_return& n )
    {
    	BaseType::operator=( n );
    	name = n.name; 
    	parameters = n.parameters; 
    	return *this;
    }

};





struct BUGSParser_distributionParameter_return : public BUGSParserImplTraits::RuleReturnValueType
{
public:
	typedef BUGSParserImplTraits::RuleReturnValueType BaseType;

    
    BUGSParser_distributionParameter_return()
    {
    }

    BUGSParser_distributionParameter_return( BaseParserType* parser )
        : BaseType(parser)
    {
    }

    BUGSParser_distributionParameter_return( const BUGSParser_distributionParameter_return& n )
    : BaseType(n)
    {
    }

    BUGSParser_distributionParameter_return&
    operator=( const BUGSParser_distributionParameter_return& n )
    {
    	BaseType::operator=( n );
    	return *this;
    }

};






class BUGSParserTokens
{
public:
	/** Symbolic definitions of all the tokens that the 
parser
 will work with.
	 * \{
	 *
	 * Antlr will define EOF, but we can't use that as it it is too common in
	 * in C header files and that would be confusing. There is no way to filter this out at the moment
	 * so we just undef it here for now. That isn't the value we get back from C recognizers
	 * anyway. We are looking for ANTLR_TOKEN_EOF.
	 */
	enum Tokens 
	{
		EOF_TOKEN = BUGSParserImplTraits::CommonTokenType::TOKEN_EOF
		, ABSOPENBRACKET = 4 
		, BERNOULLIOPENBRACKET = 5 
		, BETAOPENBRACKET = 6 
		, CENSORBEGINWITHC = 7 
		, CENSORBEGINWITHI = 8 
		, CLOGLOGOPENBRACKET = 9 
		, CLOSEBRACE = 10 
		, CLOSEBRACKET = 11 
		, CLOSESQUAREBRACKET = 12 
		, COLON = 13 
		, COMMA = 14 
		, CONSTANTINT = 15 
		, CONSTANTVALUE = 16 
		, DIRICHLETOPENBRACKET = 17 
		, DIV = 18 
		, DOT = 19 
		, EQUALTO = 20 
		, FORSTART = 21 
		, IN = 22 
		, INVERSEOPENBRACKET = 23 
		, LEFTPOINTER = 24 
		, LOGITOPENBRACKET = 25 
		, LOGOPENBRACKET = 26 
		, MINUS = 27 
		, MODEL = 28 
		, MULT = 29 
		, MUTLTINOMIALOPENBRACKET = 30 
		, NODENAME = 31 
		, OPENBRACE = 32 
		, OPENBRACKET = 33 
		, OPENSQUAREBRACKET = 34 
		, PLUS = 35 
		, PROBITOPENBRACKET = 36 
		, TILDE = 37 
		, TRUNCATIONBEGIN = 38 
		, WHITESPACE = 39 
	};

};

/** Context tracking structure for 
BUGSParser

 */
class BUGSParser : public 
BUGSParserImplTraits::BaseParserType
, public BUGSParserTokens
{
public:
	typedef BUGSParserImplTraits ImplTraits;
	typedef BUGSParser ComponentType;
	typedef ComponentType::StreamType StreamType;
	typedef 
BUGSParserImplTraits::BaseParserType
 BaseType;
	typedef ImplTraits::RecognizerSharedStateType<StreamType> RecognizerSharedStateType;
	typedef StreamType InputType;
	static const bool IsFiltered = false;


private:	
public:
    BUGSParser(InputType* instream);
    BUGSParser(InputType* instream, RecognizerSharedStateType* state);

    void init(InputType* instream  );

     
     Program
     prog (IData* inputdata); 
     
     vector<Node* >
     statements (); 
     
     StochasticNode*
     stochasticNodeExpr (); 
     
     UnivariateNode*
     uvStochasticNodeExpr (); 
     
     MultivariateNode*
     mvStochasticNodeExpr (); 
     
     void
     censor (); 
     
     void
     truncation (); 
     
     void
     lowerWithOptionalUpper (); 
     
     void
     upperWithOptionalLower (); 
     
     LogicalNode*
     logicalNodeExpr (); 
     
     BUGSParser_linkFunction_return
     linkFunction (); 
     
     std::vector<ExpressionNode*>
     exprWithNodesFunctions (); 
     
     BUGSParser_uvNode_return
     uvNode (); 
     
     BUGSParser_mvNode_return
     mvNode (); 
     
     float
     expression (); 
     
     float
     unaryExpression (); 
     
     void
     multiIndices (); 
     
     void
     multiDimExpression (); 
     
     BUGSParser_startFor_return
     startFor (); 
     
     void
     endFor (); 
     
     BUGSParser_loopVariable_return
     loopVariable (); 
     
     int
     loopBegin (); 
     
     int
     loopEnd (); 
     
     BUGSParser_scalarFunctions_return
     scalarFunctions (); 
     
     BUGSParser_vectorFunctions_return
     vectorFunctions (); 
     
     UnivariateDistribution*
     uvDistribution (); 
     
     MultivariateDistribution*
     mvDistribution (); 
     
     BUGSParser_discreteUnivariate_return
     discreteUnivariate (); 
     
     BUGSParser_continuousUnivariate_return
     continuousUnivariate (); 
     
     BUGSParser_discreteMultivariate_return
     discreteMultivariate (); 
     
     BUGSParser_continuousMultivariate_return
     continuousMultivariate (); 
     
     BUGSParser_distributionParameter_return
     distributionParameter (); 
     
     std::list<string>
     bernoulli (); 
     
     std::list<string>
     beta (); 
     
     std::list<string>
     multinomial (); 
     
     std::list<string>
     dirichlet (); 










      
     bool
     msynpred( antlr3::ClassForwarder< synpred1_BUGS > );
        void msynpred1_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred2_BUGS > );
        void msynpred2_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred3_BUGS > );
        void msynpred3_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred4_BUGS > );
        void msynpred4_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred5_BUGS > );
        void msynpred5_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred6_BUGS > );
        void msynpred6_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred7_BUGS > );
        void msynpred7_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred8_BUGS > );
        void msynpred8_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred9_BUGS > );
        void msynpred9_BUGS_fragment ();
      
     bool
     msynpred( antlr3::ClassForwarder< synpred10_BUGS > );
        void msynpred10_BUGS_fragment ();
    // Delegated rules

    const char *    getGrammarFileName();
    void            reset();
    ~BUGSParser();

};

// Function protoypes for the constructor functions that external translation units
// such as delegators and delegates may wish to call.
//

/* End of token definitions for BUGSParser
 * =============================================================================
 */
/** } */

	}


#endif

/* END - Note:Keep extra line feed to satisfy UNIX systems */
