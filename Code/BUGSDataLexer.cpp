/** \file
 *  This C++ source file was generated by $ANTLR version 3.5-rc-2
 *
 *     -  From the grammar source file : /u/s/h/shrirams/bugsparser/Parser/BUGSData.g
 *     -                            On : 2013-01-07 18:13:02
 *     -                 for the lexer : BUGSDataLexerLexer
 *
 * Editing it, at least manually, is not wise.
 *
 * C++ language generator and runtime by Gokulakannan Somasundaram ( heavy lifting from C Run-time by Jim Idle )
 *
 *
*/
// [The "BSD license"]
// Copyright (c) 2005-2009 Gokulakannan Somasundaram, ElectronDB
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

/* -----------------------------------------
 * Include the ANTLR3 generated header file.
 */
#include    "BUGSDataLexer.hpp"
/* ----------------------------------------- */



	namespace BUGSData {


/** String literals used by BUGSDataLexer that we must do things like MATCHS() with.
 *  C will normally just lay down 8 bit characters, and you can use L"xxx" to
 *  get wchar_t, but wchar_t is 16 bits on Windows, which is not UTF32 and so
 *  we perform this little trick of defining the literals as arrays of UINT32
 *  and passing in the address of these.
 */
static ANTLR_UCHAR	lit_1[]  = { 0x2E, 0x44, 0x61, 0x74, 0x61,  antlr3::ANTLR_STRING_TERMINATOR};
static ANTLR_UCHAR	lit_2[]  = { 0x2E, 0x44, 0x69, 0x6D,  antlr3::ANTLR_STRING_TERMINATOR};
static ANTLR_UCHAR	lit_3[]  = { 0x6C, 0x69, 0x73, 0x74, 0x28,  antlr3::ANTLR_STRING_TERMINATOR};
static ANTLR_UCHAR	lit_4[]  = { 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x75, 0x72, 0x65, 0x28,  antlr3::ANTLR_STRING_TERMINATOR};
static ANTLR_UCHAR	lit_5[]  = { 0x63, 0x28,  antlr3::ANTLR_STRING_TERMINATOR};

	}



/* ============================================================================= */

/* =============================================================================
 * Start of recognizer
 */

using namespace antlr3;

	namespace BUGSData {


/* =========================================================================
 * Lexer matching rules end.
 * =========================================================================
 */



BUGSDataLexer::~BUGSDataLexer()
{
}

void
BUGSDataLexer::reset()
{
    this->get_rec()->reset();
}

/** \brief Name of the grammar file that generated this code
 */
static const char fileName[] = "/u/s/h/shrirams/bugsparser/Parser/BUGSData.g";

/** \brief Return the name of the grammar file that generated this code.
 */
const char* BUGSDataLexer::getGrammarFileName()
{
	return fileName;
}

/** \brief Create a new lexer called BUGSDataLexer
 *
 * \param[in]    instream Pointer to an initialized input stream
 * \return
 *     - Success pBUGSDataLexer initialized for the lex start
 *     - Fail NULL
 */
BUGSDataLexer::BUGSDataLexer(StreamType* instream)
:BUGSDataLexerImplTraits::BaseLexerType(ANTLR_SIZE_HINT, instream, NULL)
{
	// See if we can create a new lexer with the standard constructor
	//
	this->init(instream );
}

/** \brief Create a new lexer called BUGSDataLexer
 *
 * \param[in]    instream Pointer to an initialized input stream
 * \param[state] state Previously created shared recognizer stat
 * \return
 *     - Success pBUGSDataLexer initialized for the lex start
 *     - Fail NULL
 */
BUGSDataLexer::BUGSDataLexer(StreamType* instream, RecognizerSharedStateType* state)
:BUGSDataLexerImplTraits::BaseLexerType(ANTLR_SIZE_HINT, instream, state)
{
	this->init(instream );
}

void BUGSDataLexer::init(StreamType* instream)
{
    /* -------------------------------------------------------------------
     * Memory for basic structure is allocated, now to fill in
     * in base ANTLR3 structures. We initialize the function pointers
     * for the standard ANTLR3 lexer function set, but upon return
     * from here, the programmer may set the pointers to provide custom
     * implementations of each function.
     *
     * We don't use the macros defined in BUGSDataLexer.h here so you can get a sense
     * of what goes where.
     */

}

/* =========================================================================
 * Functions to match the lexer grammar defined tokens from the input stream
 */

//   Comes from: 22:14: ( ')' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start CLOSEBRACKET
 *
 * Looks to match the characters the constitute the token CLOSEBRACKET
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mCLOSEBRACKET()
{
    ANTLR_UINT32	_type;
      


    _type	    = CLOSEBRACKET;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:22:14: ( ')' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:22:16: ')'
    {
         this->matchc(')');
        if  (this->hasException())
        {
            goto ruleCLOSEBRACKETEx;
        }


    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleCLOSEBRACKETEx; /* Prevent compiler warnings */
    ruleCLOSEBRACKETEx: ;

}
// $ANTLR end CLOSEBRACKET

//   Comes from: 23:7: ( ',' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start COMMA
 *
 * Looks to match the characters the constitute the token COMMA
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mCOMMA()
{
    ANTLR_UINT32	_type;
      


    _type	    = COMMA;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:23:7: ( ',' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:23:9: ','
    {
         this->matchc(',');
        if  (this->hasException())
        {
            goto ruleCOMMAEx;
        }


    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleCOMMAEx; /* Prevent compiler warnings */
    ruleCOMMAEx: ;

}
// $ANTLR end COMMA

//   Comes from: 24:9: ( '.Data' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start DOTDATA
 *
 * Looks to match the characters the constitute the token DOTDATA
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mDOTDATA()
{
    ANTLR_UINT32	_type;
      


    _type	    = DOTDATA;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:24:9: ( '.Data' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:24:11: '.Data'
    {
        this->matchs(lit_1);
        if  (this->hasException())
        {
            goto ruleDOTDATAEx;
        }




    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleDOTDATAEx; /* Prevent compiler warnings */
    ruleDOTDATAEx: ;

}
// $ANTLR end DOTDATA

//   Comes from: 25:8: ( '.Dim' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start DOTDIM
 *
 * Looks to match the characters the constitute the token DOTDIM
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mDOTDIM()
{
    ANTLR_UINT32	_type;
      


    _type	    = DOTDIM;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:25:8: ( '.Dim' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:25:10: '.Dim'
    {
        this->matchs(lit_2);
        if  (this->hasException())
        {
            goto ruleDOTDIMEx;
        }




    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleDOTDIMEx; /* Prevent compiler warnings */
    ruleDOTDIMEx: ;

}
// $ANTLR end DOTDIM

//   Comes from: 26:9: ( '=' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start EQUALTO
 *
 * Looks to match the characters the constitute the token EQUALTO
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mEQUALTO()
{
    ANTLR_UINT32	_type;
      


    _type	    = EQUALTO;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:26:9: ( '=' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:26:11: '='
    {
         this->matchc('=');
        if  (this->hasException())
        {
            goto ruleEQUALTOEx;
        }


    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleEQUALTOEx; /* Prevent compiler warnings */
    ruleEQUALTOEx: ;

}
// $ANTLR end EQUALTO

//   Comes from: 27:6: ( 'list(' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start LIST
 *
 * Looks to match the characters the constitute the token LIST
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mLIST()
{
    ANTLR_UINT32	_type;
      


    _type	    = LIST;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:27:6: ( 'list(' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:27:8: 'list('
    {
        this->matchs(lit_3);
        if  (this->hasException())
        {
            goto ruleLISTEx;
        }




    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleLISTEx; /* Prevent compiler warnings */
    ruleLISTEx: ;

}
// $ANTLR end LIST

//   Comes from: 28:16: ( 'structure(' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start STRUCTUREBEGIN
 *
 * Looks to match the characters the constitute the token STRUCTUREBEGIN
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mSTRUCTUREBEGIN()
{
    ANTLR_UINT32	_type;
      


    _type	    = STRUCTUREBEGIN;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:28:16: ( 'structure(' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:28:18: 'structure('
    {
        this->matchs(lit_4);
        if  (this->hasException())
        {
            goto ruleSTRUCTUREBEGINEx;
        }




    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleSTRUCTUREBEGINEx; /* Prevent compiler warnings */
    ruleSTRUCTUREBEGINEx: ;

}
// $ANTLR end STRUCTUREBEGIN

//   Comes from: 29:13: ( 'c(' )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start VECTORBEGIN
 *
 * Looks to match the characters the constitute the token VECTORBEGIN
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mVECTORBEGIN()
{
    ANTLR_UINT32	_type;
      


    _type	    = VECTORBEGIN;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:29:13: ( 'c(' )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:29:15: 'c('
    {
        this->matchs(lit_5);
        if  (this->hasException())
        {
            goto ruleVECTORBEGINEx;
        }




    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleVECTORBEGINEx; /* Prevent compiler warnings */
    ruleVECTORBEGINEx: ;

}
// $ANTLR end VECTORBEGIN

//   Comes from: 69:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )* )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start NODENAME
 *
 * Looks to match the characters the constitute the token NODENAME
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mNODENAME()
{
    ANTLR_UINT32	_type;
      


    _type	    = NODENAME;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:69:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )* )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:69:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )*
    {
        if ( ((this->LA(1) >= 'A') && (this->LA(1) <= 'Z')) || ((this->LA(1) >= 'a') && (this->LA(1) <= 'z')) )
        {
            this->consume();
        }
        else
        {
            new ANTLR_Exception< BUGSDataLexerImplTraits, MISMATCHED_SET_EXCEPTION, StreamType>( this->get_rec(), "" );

            this->recover();
            goto ruleNODENAMEEx;
        }


        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:69:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )*

        for (;;)
        {
            int alt1=2;
            switch ( this->LA(1) )
            {
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            	{
            		alt1=1;
            	}
                break;

            }

            switch (alt1)
            {
        	case 1:
        	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:
        	    {
        	        if ( this->LA(1) == '.' || ((this->LA(1) >= '0') && (this->LA(1) <= '9')) || ((this->LA(1) >= 'A') && (this->LA(1) <= 'Z')) || ((this->LA(1) >= 'a') && (this->LA(1) <= 'z')) )
        	        {
        	            this->consume();
        	        }
        	        else
        	        {
        	            new ANTLR_Exception< BUGSDataLexerImplTraits, MISMATCHED_SET_EXCEPTION, StreamType>( this->get_rec(), "" );

        	            this->recover();
        	            goto ruleNODENAMEEx;
        	        }


        	    }
        	    break;

        	default:
        	    goto loop1;	/* break out of the loop */
        	    break;
            }
        }
        loop1: ; /* Jump out to here if this rule does not match */


    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleNODENAMEEx; /* Prevent compiler warnings */
    ruleNODENAMEEx: ;

}
// $ANTLR end NODENAME

//   Comes from: 73:2: ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start CONSTANTVALUE
 *
 * Looks to match the characters the constitute the token CONSTANTVALUE
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mCONSTANTVALUE()
{
    ANTLR_UINT32	_type;
      


    _type	    = CONSTANTVALUE;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:2: ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:4: ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:4: ( '+' | '-' )?
        {
            int alt2=2;
            switch ( this->LA(1) )
            {
                case '+':
                case '-':
                	{
                		alt2=1;
                	}
                    break;
            }

            switch (alt2)
            {
        	case 1:
        	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:
        	    {
        	        if ( this->LA(1) == '+' || this->LA(1) == '-' )
        	        {
        	            this->consume();
        	        }
        	        else
        	        {
        	            new ANTLR_Exception< BUGSDataLexerImplTraits, MISMATCHED_SET_EXCEPTION, StreamType>( this->get_rec(), "" );

        	            this->recover();
        	            goto ruleCONSTANTVALUEEx;
        	        }


        	    }
        	    break;

            }
        }

        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:14: ( '0' .. '9' )+
        {
            int cnt3=0;

            for (;;)
            {
                int alt3=2;
        	switch ( this->LA(1) )
        	{
        	case '0':
        	case '1':
        	case '2':
        	case '3':
        	case '4':
        	case '5':
        	case '6':
        	case '7':
        	case '8':
        	case '9':
        		{
        			alt3=1;
        		}
        	    break;

        	}

        	switch (alt3)
        	{
        	    case 1:
        	        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:
        	        {
        	            if ( ((this->LA(1) >= '0') && (this->LA(1) <= '9')) )
        	            {
        	                this->consume();
        	            }
        	            else
        	            {
        	                new ANTLR_Exception< BUGSDataLexerImplTraits, MISMATCHED_SET_EXCEPTION, StreamType>( this->get_rec(), "" );

        	                this->recover();
        	                goto ruleCONSTANTVALUEEx;
        	            }


        	        }
        	        break;

        	    default:

        		if ( cnt3 >= 1 )
        		{
        		    goto loop3;
        		}
        		/* mismatchedSetEx()
        		 */
        		new ANTLR_Exception< BUGSDataLexerImplTraits, EARLY_EXIT_EXCEPTION, StreamType>( this->get_rec(), "" );


        		goto ruleCONSTANTVALUEEx;
        	}
        	cnt3++;
            }
            loop3: ;	/* Jump to here if this rule does not match */
        }

        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:25: ( '.' ( '0' .. '9' )+ )?
        {
            int alt5=2;
            switch ( this->LA(1) )
            {
                case '.':
                	{
                		alt5=1;
                	}
                    break;
            }

            switch (alt5)
            {
        	case 1:
        	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:26: '.' ( '0' .. '9' )+
        	    {
        	         this->matchc('.');
        	        if  (this->hasException())
        	        {
        	            goto ruleCONSTANTVALUEEx;
        	        }


        	        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:73:29: ( '0' .. '9' )+
        	        {
        	            int cnt4=0;

        	            for (;;)
        	            {
        	                int alt4=2;
        	        	switch ( this->LA(1) )
        	        	{
        	        	case '0':
        	        	case '1':
        	        	case '2':
        	        	case '3':
        	        	case '4':
        	        	case '5':
        	        	case '6':
        	        	case '7':
        	        	case '8':
        	        	case '9':
        	        		{
        	        			alt4=1;
        	        		}
        	        	    break;

        	        	}

        	        	switch (alt4)
        	        	{
        	        	    case 1:
        	        	        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:
        	        	        {
        	        	            if ( ((this->LA(1) >= '0') && (this->LA(1) <= '9')) )
        	        	            {
        	        	                this->consume();
        	        	            }
        	        	            else
        	        	            {
        	        	                new ANTLR_Exception< BUGSDataLexerImplTraits, MISMATCHED_SET_EXCEPTION, StreamType>( this->get_rec(), "" );

        	        	                this->recover();
        	        	                goto ruleCONSTANTVALUEEx;
        	        	            }


        	        	        }
        	        	        break;

        	        	    default:

        	        		if ( cnt4 >= 1 )
        	        		{
        	        		    goto loop4;
        	        		}
        	        		/* mismatchedSetEx()
        	        		 */
        	        		new ANTLR_Exception< BUGSDataLexerImplTraits, EARLY_EXIT_EXCEPTION, StreamType>( this->get_rec(), "" );


        	        		goto ruleCONSTANTVALUEEx;
        	        	}
        	        	cnt4++;
        	            }
        	            loop4: ;	/* Jump to here if this rule does not match */
        	        }

        	    }
        	    break;

            }
        }

    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleCONSTANTVALUEEx; /* Prevent compiler warnings */
    ruleCONSTANTVALUEEx: ;

}
// $ANTLR end CONSTANTVALUE

//   Comes from: 76:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+ )
/** \brief Lexer rule generated by ANTLR3
 *
 * $ANTLR start WHITESPACE
 *
 * Looks to match the characters the constitute the token WHITESPACE
 * from the attached input stream.
 *
 *
 * \remark
 *  - lexer->error == true if an exception was thrown.
 */
void BUGSDataLexer::mWHITESPACE()
{
    ANTLR_UINT32	_type;
      


    _type	    = WHITESPACE;


    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:76:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+ )
    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:76:14: ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:76:14: ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+
        {
            int cnt6=0;

            for (;;)
            {
                int alt6=2;
        	switch ( this->LA(1) )
        	{
        	case '\t':
        	case '\n':
        	case '\f':
        	case '\r':
        	case ' ':
        	case ';':
        		{
        			alt6=1;
        		}
        	    break;

        	}

        	switch (alt6)
        	{
        	    case 1:
        	        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:
        	        {
        	            if ( ((this->LA(1) >= '\t') && (this->LA(1) <= '\n')) || ((this->LA(1) >= '\f') && (this->LA(1) <= '\r')) || this->LA(1) == ' ' || this->LA(1) == ';' )
        	            {
        	                this->consume();
        	            }
        	            else
        	            {
        	                new ANTLR_Exception< BUGSDataLexerImplTraits, MISMATCHED_SET_EXCEPTION, StreamType>( this->get_rec(), "" );

        	                this->recover();
        	                goto ruleWHITESPACEEx;
        	            }


        	        }
        	        break;

        	    default:

        		if ( cnt6 >= 1 )
        		{
        		    goto loop6;
        		}
        		/* mismatchedSetEx()
        		 */
        		new ANTLR_Exception< BUGSDataLexerImplTraits, EARLY_EXIT_EXCEPTION, StreamType>( this->get_rec(), "" );


        		goto ruleWHITESPACEEx;
        	}
        	cnt6++;
            }
            loop6: ;	/* Jump to here if this rule does not match */
        }

        {
             this->get_state()->get_channel() = HIDDEN; 
        }


    }

	this->get_lexstate()->set_type(_type);
    // This is where rules clean up and exit
    //
    goto ruleWHITESPACEEx; /* Prevent compiler warnings */
    ruleWHITESPACEEx: ;

}
// $ANTLR end WHITESPACE

/** This is the entry point in to the lexer from an object that
 *  wants to generate the next token, such as a pCOMMON_TOKEN_STREAM
 */
void
BUGSDataLexer::mTokens()
{
    {
        //  /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:8: ( CLOSEBRACKET | COMMA | DOTDATA | DOTDIM | EQUALTO | LIST | STRUCTUREBEGIN | VECTORBEGIN | NODENAME | CONSTANTVALUE | WHITESPACE )

        ANTLR_UINT32 alt7;

        alt7=11;

        switch ( this->LA(1) )
        {
        case ')':
        	{
        		alt7=1;
        	}
            break;
        case ',':
        	{
        		alt7=2;
        	}
            break;
        case '.':
        	{
        		switch ( this->LA(2) )
        		{
        		case 'D':
        			{
        				switch ( this->LA(3) )
        				{
        				case 'a':
        					{
        						alt7=3;
        					}
        				    break;
        				case 'i':
        					{
        						alt7=4;
        					}
        				    break;

        				default:
        				    ExceptionBaseType* ex = new ANTLR_Exception< BUGSDataLexerImplTraits, NO_VIABLE_ALT_EXCEPTION, StreamType>( this->get_rec(), "" );
        				    ex->set_decisionNum( 7 );
        				    ex->set_state( 11 );


        				    goto ruleTokensEx;

        				}

        			}
        		    break;

        		default:
        		    ExceptionBaseType* ex = new ANTLR_Exception< BUGSDataLexerImplTraits, NO_VIABLE_ALT_EXCEPTION, StreamType>( this->get_rec(), "" );
        		    ex->set_decisionNum( 7 );
        		    ex->set_state( 3 );


        		    goto ruleTokensEx;

        		}

        	}
            break;
        case '=':
        	{
        		alt7=5;
        	}
            break;
        case 'l':
        	{
        		switch ( this->LA(2) )
        		{
        		case 'i':
        			{
        				switch ( this->LA(3) )
        				{
        				case 's':
        					{
        						switch ( this->LA(4) )
        						{
        						case 't':
        							{
        								switch ( this->LA(5) )
        								{
        								case '(':
        									{
        										alt7=6;
        									}
        								    break;

        								default:
        								    alt7=9;
        								}

        							}
        						    break;

        						default:
        						    alt7=9;
        						}

        					}
        				    break;

        				default:
        				    alt7=9;
        				}

        			}
        		    break;

        		default:
        		    alt7=9;
        		}

        	}
            break;
        case 's':
        	{
        		switch ( this->LA(2) )
        		{
        		case 't':
        			{
        				switch ( this->LA(3) )
        				{
        				case 'r':
        					{
        						switch ( this->LA(4) )
        						{
        						case 'u':
        							{
        								switch ( this->LA(5) )
        								{
        								case 'c':
        									{
        										switch ( this->LA(6) )
        										{
        										case 't':
        											{
        												switch ( this->LA(7) )
        												{
        												case 'u':
        													{
        														switch ( this->LA(8) )
        														{
        														case 'r':
        															{
        																switch ( this->LA(9) )
        																{
        																case 'e':
        																	{
        																		switch ( this->LA(10) )
        																		{
        																		case '(':
        																			{
        																				alt7=7;
        																			}
        																		    break;

        																		default:
        																		    alt7=9;
        																		}

        																	}
        																    break;

        																default:
        																    alt7=9;
        																}

        															}
        														    break;

        														default:
        														    alt7=9;
        														}

        													}
        												    break;

        												default:
        												    alt7=9;
        												}

        											}
        										    break;

        										default:
        										    alt7=9;
        										}

        									}
        								    break;

        								default:
        								    alt7=9;
        								}

        							}
        						    break;

        						default:
        						    alt7=9;
        						}

        					}
        				    break;

        				default:
        				    alt7=9;
        				}

        			}
        		    break;

        		default:
        		    alt7=9;
        		}

        	}
            break;
        case 'c':
        	{
        		switch ( this->LA(2) )
        		{
        		case '(':
        			{
        				alt7=8;
        			}
        		    break;

        		default:
        		    alt7=9;
        		}

        	}
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
        	{
        		alt7=9;
        	}
            break;
        case '+':
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        	{
        		alt7=10;
        	}
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
        case ';':
        	{
        		alt7=11;
        	}
            break;

        default:
            ExceptionBaseType* ex = new ANTLR_Exception< BUGSDataLexerImplTraits, NO_VIABLE_ALT_EXCEPTION, StreamType>( this->get_rec(), "" );
            ex->set_decisionNum( 7 );
            ex->set_state( 0 );


            goto ruleTokensEx;

        }

        switch (alt7)
        {
    	case 1:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:10: CLOSEBRACKET
    	    {
    	        /* 1:10: CLOSEBRACKET */
    	        mCLOSEBRACKET();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 2:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:23: COMMA
    	    {
    	        /* 1:23: COMMA */
    	        mCOMMA();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 3:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:29: DOTDATA
    	    {
    	        /* 1:29: DOTDATA */
    	        mDOTDATA();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 4:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:37: DOTDIM
    	    {
    	        /* 1:37: DOTDIM */
    	        mDOTDIM();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 5:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:44: EQUALTO
    	    {
    	        /* 1:44: EQUALTO */
    	        mEQUALTO();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 6:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:52: LIST
    	    {
    	        /* 1:52: LIST */
    	        mLIST();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 7:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:57: STRUCTUREBEGIN
    	    {
    	        /* 1:57: STRUCTUREBEGIN */
    	        mSTRUCTUREBEGIN();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 8:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:72: VECTORBEGIN
    	    {
    	        /* 1:72: VECTORBEGIN */
    	        mVECTORBEGIN();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 9:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:84: NODENAME
    	    {
    	        /* 1:84: NODENAME */
    	        mNODENAME();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 10:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:93: CONSTANTVALUE
    	    {
    	        /* 1:93: CONSTANTVALUE */
    	        mCONSTANTVALUE();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;
    	case 11:
    	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:1:107: WHITESPACE
    	    {
    	        /* 1:107: WHITESPACE */
    	        mWHITESPACE();
    	        if  (this->hasException())
    	        {
    	            goto ruleTokensEx;
    	        }



    	    }
    	    break;

        }
    }


    goto ruleTokensEx; /* Prevent compiler warnings */
ruleTokensEx: ;
}

/* =========================================================================
 * Lexer matching rules end.
 * =========================================================================
 */
/* End of Lexer code
 * ================================================
 * ================================================
 */

	}



/* End of code
 * =============================================================================
 */