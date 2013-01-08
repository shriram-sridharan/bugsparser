/** \file
 *  This C++ source file was generated by $ANTLR version 3.5-rc-2
 *
 *     -  From the grammar source file : /u/s/h/shrirams/bugsparser/Parser/BUGSData.g
 *     -                            On : 2013-01-07 18:13:02
 *     -                for the parser : BUGSDataParserParser
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
#include    "BUGSDataParser.hpp"
/* ----------------------------------------- */


/* ============================================================================= */

/* =============================================================================
 * Start of recognizer
 */

	namespace BUGSData {

using namespace antlr3;
/** \brief Table of all token names in symbolic order, mainly used for
 *         error reporting.
 */
ANTLR_UINT8*   BUGSDataParserTokenNames[11+4]
     = {
        (ANTLR_UINT8*) "<invalid>",       /* String to print to indicate an invalid token */
        (ANTLR_UINT8*) "<EOR>",
        (ANTLR_UINT8*) "<DOWN>",
        (ANTLR_UINT8*) "<UP>",
        (ANTLR_UINT8*) "CLOSEBRACKET",
        (ANTLR_UINT8*) "COMMA",
        (ANTLR_UINT8*) "CONSTANTVALUE",
        (ANTLR_UINT8*) "DOTDATA",
        (ANTLR_UINT8*) "DOTDIM",
        (ANTLR_UINT8*) "EQUALTO",
        (ANTLR_UINT8*) "LIST",
        (ANTLR_UINT8*) "NODENAME",
        (ANTLR_UINT8*) "STRUCTUREBEGIN",
        (ANTLR_UINT8*) "VECTORBEGIN",
        (ANTLR_UINT8*) "WHITESPACE"
       };


/** \brief Name of the grammar file that generated this code
 */
static const char fileName[] = "/u/s/h/shrirams/bugsparser/Parser/BUGSData.g";

/** \brief Return the name of the grammar file that generated this code.
 */
const char* BUGSDataParser::getGrammarFileName()
{
	return fileName;
}
/** \brief Create a new BUGSDataParser parser and return a context for it.
 *
 * \param[in] instream Pointer to an input stream interface.
 *
 * \return Pointer to new parser context upon success.
 */
BUGSDataParser::BUGSDataParser( StreamType* instream)
    :ImplTraits::BaseParserType(ANTLR_SIZE_HINT, instream, NULL)

{
	// See if we can create a new parser with the standard constructor
	//
	this->init(instream);
}

/** \brief Create a new BUGSDataParser parser and return a context for it.
 *
 * \param[in] instream Pointer to an input stream interface.
 *
 * \return Pointer to new parser context upon success.
 */
BUGSDataParser::BUGSDataParser( StreamType* instream, RecognizerSharedStateType* state)
    :ImplTraits::BaseParserType(ANTLR_SIZE_HINT, instream, state)

{
	this->init(instream );
}

void BUGSDataParser::init(StreamType* instream)
{
	/* Install the token table
	*/
	this->get_psrstate()->set_tokenNames( BUGSDataParserTokenNames );


}

void
BUGSDataParser::reset()
{
    this->get_rec()->reset();
}

/** Free the parser resources
 */
BUGSDataParser::~BUGSDataParser()
 {
}

/** Return token names used by this 
parser

 *
 * The returned pointer is used as an index into the token names table (using the token
 * number as the index).
 *
 * \return Pointer to first char * in the table.
 */
static ANTLR_UINT8**	getTokenNames()
{
        return BUGSDataParserTokenNames;
}


/* Declare the bitsets
 */
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_LIST_in_data134_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000800) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_LIST_in_data134( FOLLOW_LIST_in_data134_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_datatype_in_data136_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000030) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_datatype_in_data136( FOLLOW_datatype_in_data136_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_COMMA_in_data139_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000800) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_COMMA_in_data139( FOLLOW_COMMA_in_data139_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_datatype_in_data141_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000030) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_datatype_in_data141( FOLLOW_datatype_in_data141_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_CLOSEBRACKET_in_data145_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_CLOSEBRACKET_in_data145( FOLLOW_CLOSEBRACKET_in_data145_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_scalar_in_datatype161_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_scalar_in_datatype161( FOLLOW_scalar_in_datatype161_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_vector_in_datatype168_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_vector_in_datatype168( FOLLOW_vector_in_datatype168_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_array_in_datatype175_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_array_in_datatype175( FOLLOW_array_in_datatype175_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_NODENAME_in_array188_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000200) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_NODENAME_in_array188( FOLLOW_NODENAME_in_array188_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_EQUALTO_in_array190_bits[]	= { ANTLR_UINT64_LIT(0x0000000000001000) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_EQUALTO_in_array190( FOLLOW_EQUALTO_in_array190_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_STRUCTUREBEGIN_in_array192_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000080) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_STRUCTUREBEGIN_in_array192( FOLLOW_STRUCTUREBEGIN_in_array192_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_DOTDATA_in_array194_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000200) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_DOTDATA_in_array194( FOLLOW_DOTDATA_in_array194_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_EQUALTO_in_array196_bits[]	= { ANTLR_UINT64_LIT(0x0000000000002000) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_EQUALTO_in_array196( FOLLOW_EQUALTO_in_array196_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_vectordata_in_array198_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000020) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_vectordata_in_array198( FOLLOW_vectordata_in_array198_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_COMMA_in_array200_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000100) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_COMMA_in_array200( FOLLOW_COMMA_in_array200_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_DOTDIM_in_array202_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000200) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_DOTDIM_in_array202( FOLLOW_DOTDIM_in_array202_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_EQUALTO_in_array204_bits[]	= { ANTLR_UINT64_LIT(0x0000000000002000) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_EQUALTO_in_array204( FOLLOW_EQUALTO_in_array204_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_vectordata_in_array206_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000010) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_vectordata_in_array206( FOLLOW_vectordata_in_array206_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_CLOSEBRACKET_in_array208_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_CLOSEBRACKET_in_array208( FOLLOW_CLOSEBRACKET_in_array208_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_NODENAME_in_vector223_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000200) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_NODENAME_in_vector223( FOLLOW_NODENAME_in_vector223_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_EQUALTO_in_vector225_bits[]	= { ANTLR_UINT64_LIT(0x0000000000002000) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_EQUALTO_in_vector225( FOLLOW_EQUALTO_in_vector225_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_vectordata_in_vector227_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_vectordata_in_vector227( FOLLOW_vectordata_in_vector227_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_VECTORBEGIN_in_vectordata246_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000040) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_VECTORBEGIN_in_vectordata246( FOLLOW_VECTORBEGIN_in_vectordata246_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_CONSTANTVALUE_in_vectordata250_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000030) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_CONSTANTVALUE_in_vectordata250( FOLLOW_CONSTANTVALUE_in_vectordata250_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_COMMA_in_vectordata255_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000040) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_COMMA_in_vectordata255( FOLLOW_COMMA_in_vectordata255_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_CONSTANTVALUE_in_vectordata259_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000030) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_CONSTANTVALUE_in_vectordata259( FOLLOW_CONSTANTVALUE_in_vectordata259_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_CLOSEBRACKET_in_vectordata265_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_CLOSEBRACKET_in_vectordata265( FOLLOW_CLOSEBRACKET_in_vectordata265_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_NODENAME_in_scalar282_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000200) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_NODENAME_in_scalar282( FOLLOW_NODENAME_in_scalar282_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_EQUALTO_in_scalar284_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000040) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_EQUALTO_in_scalar284( FOLLOW_EQUALTO_in_scalar284_bits, 1 );
/** Bitset defining follow set for error recovery in rule state: BUGSDataParser  */
static	ANTLR_BITWORD FOLLOW_CONSTANTVALUE_in_scalar286_bits[]	= { ANTLR_UINT64_LIT(0x0000000000000002) };
static  BUGSDataParserImplTraits::BitsetListType FOLLOW_CONSTANTVALUE_in_scalar286( FOLLOW_CONSTANTVALUE_in_scalar286_bits, 1 );


/* ==============================================
 * Parsing rules
 */
/**
 * $ANTLR start data
 * /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:37:1: data returns [MainMemoryData* mmdata = new MainMemoryData()] : LIST datatype ( COMMA datatype )* CLOSEBRACKET ;
 */
MainMemoryData*
BUGSDataParser::data()
{
        BUGSDataParserImplTraits::RuleReturnValueType _antlr_rule_exit(this);
      
    MainMemoryData* mmdata;


    /* Initialize rule variables
     */
    mmdata =  new MainMemoryData();

    m_data_stack.push(dataScope()); 

 
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:42:2: ( LIST datatype ( COMMA datatype )* CLOSEBRACKET )
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:42:4: LIST datatype ( COMMA datatype )* CLOSEBRACKET
        {
             this->matchToken(LIST, &FOLLOW_LIST_in_data134);
            if  (this->hasException())
            {
                goto ruledataEx;
            }


            this->followPush(FOLLOW_datatype_in_data136);
            datatype();

            this->followPop();
            if  (this->hasException())
            {
                goto ruledataEx;
            }


            // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:42:18: ( COMMA datatype )*

            for (;;)
            {
                int alt1=2;
                switch ( this->LA(1) )
                {
                case COMMA:
                	{
                		alt1=1;
                	}
                    break;

                }

                switch (alt1)
                {
            	case 1:
            	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:42:19: COMMA datatype
            	    {
            	         this->matchToken(COMMA, &FOLLOW_COMMA_in_data139);
            	        if  (this->hasException())
            	        {
            	            goto ruledataEx;
            	        }


            	        this->followPush(FOLLOW_datatype_in_data141);
            	        datatype();

            	        this->followPop();
            	        if  (this->hasException())
            	        {
            	            goto ruledataEx;
            	        }


            	    }
            	    break;

            	default:
            	    goto loop1;	/* break out of the loop */
            	    break;
                }
            }
            loop1: ; /* Jump out to here if this rule does not match */


             this->matchToken(CLOSEBRACKET, &FOLLOW_CLOSEBRACKET_in_data145);
            if  (this->hasException())
            {
                goto ruledataEx;
            }


            {
                mmdata->scalars = m_data_stack.peek().scalars; mmdata->vectors = m_data_stack.peek().vectors;
            }


        }

    }
    // This is where rules clean up and exit
    //
    goto ruledataEx; /* Prevent compiler warnings */
    ruledataEx: ;


    	if (this->hasException())
        {
            this->preporterror();
            this->precover();
        }
    m_data_stack.pop(); 

    return mmdata;
}
/* $ANTLR end data */

/**
 * $ANTLR start datatype
 * /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:45:1: datatype : ( scalar | vector | array );
 */
void
BUGSDataParser::datatype()
{
        BUGSDataParserImplTraits::RuleReturnValueType _antlr_rule_exit(this);
      

    BUGSDataParser_scalar_return scalar1;
    typedef	BUGSDataParser_scalar_return RETURN_TYPE_scalar1;

    BUGSDataParser_vector_return vector2;
    typedef	BUGSDataParser_vector_return RETURN_TYPE_vector2;

    /* Initialize rule variables
     */


 
    {
        {
            //  /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:46:2: ( scalar | vector | array )

            ANTLR_UINT32 alt2;

            alt2=3;

            switch ( this->LA(1) )
            {
            case NODENAME:
            	{
            		switch ( this->LA(2) )
            		{
            		case EQUALTO:
            			{
            				switch ( this->LA(3) )
            				{
            				case CONSTANTVALUE:
            					{
            						alt2=1;
            					}
            				    break;
            				case STRUCTUREBEGIN:
            					{
            						alt2=3;
            					}
            				    break;
            				case VECTORBEGIN:
            					{
            						alt2=2;
            					}
            				    break;

            				default:
            				    ExceptionBaseType* ex = new ANTLR_Exception< BUGSDataParserImplTraits, NO_VIABLE_ALT_EXCEPTION, StreamType>( this->get_rec(), "" );
            				    ex->set_decisionNum( 2 );
            				    ex->set_state( 2 );


            				    goto ruledatatypeEx;

            				}

            			}
            		    break;

            		default:
            		    ExceptionBaseType* ex = new ANTLR_Exception< BUGSDataParserImplTraits, NO_VIABLE_ALT_EXCEPTION, StreamType>( this->get_rec(), "" );
            		    ex->set_decisionNum( 2 );
            		    ex->set_state( 1 );


            		    goto ruledatatypeEx;

            		}

            	}
                break;

            default:
                ExceptionBaseType* ex = new ANTLR_Exception< BUGSDataParserImplTraits, NO_VIABLE_ALT_EXCEPTION, StreamType>( this->get_rec(), "" );
                ex->set_decisionNum( 2 );
                ex->set_state( 0 );


                goto ruledatatypeEx;

            }

            switch (alt2)
            {
        	case 1:
        	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:46:4: scalar
        	    {
        	        this->followPush(FOLLOW_scalar_in_datatype161);
        	        scalar1=scalar();

        	        this->followPop();
        	        if  (this->hasException())
        	        {
        	            goto ruledatatypeEx;
        	        }


        	        {
        	            m_data_stack.peek().scalars[
        	            scalar1.nodename
        	            ] = scalar1.value
        	            ;
        	        }


        	    }
        	    break;
        	case 2:
        	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:47:4: vector
        	    {
        	        this->followPush(FOLLOW_vector_in_datatype168);
        	        vector2=vector();

        	        this->followPop();
        	        if  (this->hasException())
        	        {
        	            goto ruledatatypeEx;
        	        }


        	        {
        	            m_data_stack.peek().vectors[
        	            vector2.nodename
        	            ] = vector2.value
        	            ;
        	        }


        	    }
        	    break;
        	case 3:
        	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:48:4: array
        	    {
        	        this->followPush(FOLLOW_array_in_datatype175);
        	        array();

        	        this->followPop();
        	        if  (this->hasException())
        	        {
        	            goto ruledatatypeEx;
        	        }


        	    }
        	    break;

            }
        }
    }
    // This is where rules clean up and exit
    //
    goto ruledatatypeEx; /* Prevent compiler warnings */
    ruledatatypeEx: ;


    	if (this->hasException())
        {
            this->preporterror();
            this->precover();
        }
    return ;
}
/* $ANTLR end datatype */

/**
 * $ANTLR start array
 * /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:51:1: array : NODENAME EQUALTO STRUCTUREBEGIN DOTDATA EQUALTO vectordata COMMA DOTDIM EQUALTO vectordata CLOSEBRACKET ;
 */
void
BUGSDataParser::array()
{
        BUGSDataParserImplTraits::RuleReturnValueType _antlr_rule_exit(this);
      

    /* Initialize rule variables
     */


 
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:52:2: ( NODENAME EQUALTO STRUCTUREBEGIN DOTDATA EQUALTO vectordata COMMA DOTDIM EQUALTO vectordata CLOSEBRACKET )
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:52:4: NODENAME EQUALTO STRUCTUREBEGIN DOTDATA EQUALTO vectordata COMMA DOTDIM EQUALTO vectordata CLOSEBRACKET
        {
             this->matchToken(NODENAME, &FOLLOW_NODENAME_in_array188);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(EQUALTO, &FOLLOW_EQUALTO_in_array190);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(STRUCTUREBEGIN, &FOLLOW_STRUCTUREBEGIN_in_array192);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(DOTDATA, &FOLLOW_DOTDATA_in_array194);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(EQUALTO, &FOLLOW_EQUALTO_in_array196);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


            this->followPush(FOLLOW_vectordata_in_array198);
            vectordata();

            this->followPop();
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(COMMA, &FOLLOW_COMMA_in_array200);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(DOTDIM, &FOLLOW_DOTDIM_in_array202);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(EQUALTO, &FOLLOW_EQUALTO_in_array204);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


            this->followPush(FOLLOW_vectordata_in_array206);
            vectordata();

            this->followPop();
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


             this->matchToken(CLOSEBRACKET, &FOLLOW_CLOSEBRACKET_in_array208);
            if  (this->hasException())
            {
                goto rulearrayEx;
            }


        }

    }
    // This is where rules clean up and exit
    //
    goto rulearrayEx; /* Prevent compiler warnings */
    rulearrayEx: ;


    	if (this->hasException())
        {
            this->preporterror();
            this->precover();
        }
    return ;
}
/* $ANTLR end array */

/**
 * $ANTLR start vector
 * /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:55:1: vector returns [std::string nodename, std::vector<float> value] : NODENAME EQUALTO vectordata ;
 */
BUGSDataParser_vector_return
BUGSDataParser::vector()
{
    BUGSDataParser_vector_return retval(this);


    const CommonTokenType*    NODENAME3;
    std::vector<float> vectordata4;
    typedef	std::vector<float> RETURN_TYPE_vectordata4;

    /* Initialize rule variables
     */

    NODENAME3       = NULL;
    retval.call_start_placeholder(); 



 
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:56:2: ( NODENAME EQUALTO vectordata )
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:56:4: NODENAME EQUALTO vectordata
        {
            NODENAME3 =  this->matchToken(NODENAME, &FOLLOW_NODENAME_in_vector223);
            if  (this->hasException())
            {
                goto rulevectorEx;
            }


             this->matchToken(EQUALTO, &FOLLOW_EQUALTO_in_vector225);
            if  (this->hasException())
            {
                goto rulevectorEx;
            }


            this->followPush(FOLLOW_vectordata_in_vector227);
            vectordata4=vectordata();

            this->followPop();
            if  (this->hasException())
            {
                goto rulevectorEx;
            }


            {
                retval.nodename= (NODENAME3->getText());
                 retval.value= 
                vectordata4
                ;

            }


        }

    }
    // This is where rules clean up and exit
    //
    goto rulevectorEx; /* Prevent compiler warnings */
    rulevectorEx: ;
    retval.call_stop_placeholder();



    	if (this->hasException())
        {
            this->preporterror();
            this->precover();
        }
    return retval;
}
/* $ANTLR end vector */

/**
 * $ANTLR start vectordata
 * /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:59:1: vectordata returns [std::vector<float> value] : VECTORBEGIN cv1= CONSTANTVALUE ( COMMA cv2= CONSTANTVALUE )* CLOSEBRACKET ;
 */
std::vector<float>
BUGSDataParser::vectordata()
{
        BUGSDataParserImplTraits::RuleReturnValueType _antlr_rule_exit(this);
      
    std::vector<float> value;


    const CommonTokenType*    cv1;
    const CommonTokenType*    cv2;

    /* Initialize rule variables
     */

    cv1       = NULL;
    cv2       = NULL;


 
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:60:2: ( VECTORBEGIN cv1= CONSTANTVALUE ( COMMA cv2= CONSTANTVALUE )* CLOSEBRACKET )
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:60:4: VECTORBEGIN cv1= CONSTANTVALUE ( COMMA cv2= CONSTANTVALUE )* CLOSEBRACKET
        {
             this->matchToken(VECTORBEGIN, &FOLLOW_VECTORBEGIN_in_vectordata246);
            if  (this->hasException())
            {
                goto rulevectordataEx;
            }


            cv1 =  this->matchToken(CONSTANTVALUE, &FOLLOW_CONSTANTVALUE_in_vectordata250);
            if  (this->hasException())
            {
                goto rulevectordataEx;
            }


            {
                value
                .push_back(::atof((cv1->getText()).c_str()));
            }


            // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:60:81: ( COMMA cv2= CONSTANTVALUE )*

            for (;;)
            {
                int alt3=2;
                switch ( this->LA(1) )
                {
                case COMMA:
                	{
                		alt3=1;
                	}
                    break;

                }

                switch (alt3)
                {
            	case 1:
            	    // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:60:82: COMMA cv2= CONSTANTVALUE
            	    {
            	         this->matchToken(COMMA, &FOLLOW_COMMA_in_vectordata255);
            	        if  (this->hasException())
            	        {
            	            goto rulevectordataEx;
            	        }


            	        cv2 =  this->matchToken(CONSTANTVALUE, &FOLLOW_CONSTANTVALUE_in_vectordata259);
            	        if  (this->hasException())
            	        {
            	            goto rulevectordataEx;
            	        }


            	        {
            	            value
            	            .push_back(::atof((cv2->getText()).c_str()));
            	        }


            	    }
            	    break;

            	default:
            	    goto loop3;	/* break out of the loop */
            	    break;
                }
            }
            loop3: ; /* Jump out to here if this rule does not match */


             this->matchToken(CLOSEBRACKET, &FOLLOW_CLOSEBRACKET_in_vectordata265);
            if  (this->hasException())
            {
                goto rulevectordataEx;
            }


        }

    }
    // This is where rules clean up and exit
    //
    goto rulevectordataEx; /* Prevent compiler warnings */
    rulevectordataEx: ;


    	if (this->hasException())
        {
            this->preporterror();
            this->precover();
        }
    return value;
}
/* $ANTLR end vectordata */

/**
 * $ANTLR start scalar
 * /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:64:1: scalar returns [std::string nodename, float value] : NODENAME EQUALTO CONSTANTVALUE ;
 */
BUGSDataParser_scalar_return
BUGSDataParser::scalar()
{
    BUGSDataParser_scalar_return retval(this);


    const CommonTokenType*    NODENAME5;
    const CommonTokenType*    CONSTANTVALUE6;

    /* Initialize rule variables
     */

    NODENAME5       = NULL;
    CONSTANTVALUE6       = NULL;
    retval.call_start_placeholder(); 



 
    {
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:65:2: ( NODENAME EQUALTO CONSTANTVALUE )
        // /u/s/h/shrirams/bugsparser/Parser/BUGSData.g:65:4: NODENAME EQUALTO CONSTANTVALUE
        {
            NODENAME5 =  this->matchToken(NODENAME, &FOLLOW_NODENAME_in_scalar282);
            if  (this->hasException())
            {
                goto rulescalarEx;
            }


             this->matchToken(EQUALTO, &FOLLOW_EQUALTO_in_scalar284);
            if  (this->hasException())
            {
                goto rulescalarEx;
            }


            CONSTANTVALUE6 =  this->matchToken(CONSTANTVALUE, &FOLLOW_CONSTANTVALUE_in_scalar286);
            if  (this->hasException())
            {
                goto rulescalarEx;
            }


            {
                retval.nodename= (NODENAME5->getText());
                 retval.value=::atof((CONSTANTVALUE6->getText()).c_str());

            }


        }

    }
    // This is where rules clean up and exit
    //
    goto rulescalarEx; /* Prevent compiler warnings */
    rulescalarEx: ;
    retval.call_stop_placeholder();



    	if (this->hasException())
        {
            this->preporterror();
            this->precover();
        }
    return retval;
}
/* $ANTLR end scalar */
/* End of parsing rules
 * ==============================================
 */

/* ==============================================
 * Syntactic predicates
 */
/* End of syntactic predicates
 * ==============================================
 */

	}


/* End of code
 * =============================================================================
 */