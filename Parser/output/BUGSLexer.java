// $ANTLR 3.4 /u/s/h/shrirams/BUGS/BUGS.g 2013-01-04 14:31:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BUGSLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ABSOPENBRACKET=4;
    public static final int BERNOULLIOPENBRACKET=5;
    public static final int BETAOPENBRACKET=6;
    public static final int CENSORBEGINWITHC=7;
    public static final int CENSORBEGINWITHI=8;
    public static final int CLOGLOGOPENBRACKET=9;
    public static final int CLOSEBRACE=10;
    public static final int CLOSEBRACKET=11;
    public static final int CLOSESQUAREBRACKET=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int CONSTANTINT=15;
    public static final int CONSTANTVALUE=16;
    public static final int DIRICHLETOPENBRACKET=17;
    public static final int DIV=18;
    public static final int FORSTART=19;
    public static final int IN=20;
    public static final int INVERSEOPENBRACKET=21;
    public static final int LEFTPOINTER=22;
    public static final int LOGITOPENBRACKET=23;
    public static final int LOGOPENBRACKET=24;
    public static final int MINUS=25;
    public static final int MODEL=26;
    public static final int MULT=27;
    public static final int MUTLTINOMIALOPENBRACKET=28;
    public static final int NODENAME=29;
    public static final int OPENBRACE=30;
    public static final int OPENBRACKET=31;
    public static final int OPENSQUAREBRACKET=32;
    public static final int PLUS=33;
    public static final int PROBITOPENBRACKET=34;
    public static final int TILDE=35;
    public static final int TRUNCATIONBEGIN=36;
    public static final int WHITESPACE=37;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BUGSLexer() {} 
    public BUGSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BUGSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/u/s/h/shrirams/BUGS/BUGS.g"; }

    // $ANTLR start "ABSOPENBRACKET"
    public final void mABSOPENBRACKET() throws RecognitionException {
        try {
            int _type = ABSOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:2:16: ( 'abs(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:2:18: 'abs('
            {
            match("abs("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSOPENBRACKET"

    // $ANTLR start "BERNOULLIOPENBRACKET"
    public final void mBERNOULLIOPENBRACKET() throws RecognitionException {
        try {
            int _type = BERNOULLIOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:3:22: ( 'dbern(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:3:24: 'dbern('
            {
            match("dbern("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BERNOULLIOPENBRACKET"

    // $ANTLR start "BETAOPENBRACKET"
    public final void mBETAOPENBRACKET() throws RecognitionException {
        try {
            int _type = BETAOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:4:17: ( 'dbeta(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:4:19: 'dbeta('
            {
            match("dbeta("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETAOPENBRACKET"

    // $ANTLR start "CENSORBEGINWITHC"
    public final void mCENSORBEGINWITHC() throws RecognitionException {
        try {
            int _type = CENSORBEGINWITHC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:5:18: ( 'C(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:5:20: 'C('
            {
            match("C("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CENSORBEGINWITHC"

    // $ANTLR start "CENSORBEGINWITHI"
    public final void mCENSORBEGINWITHI() throws RecognitionException {
        try {
            int _type = CENSORBEGINWITHI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:6:18: ( 'I(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:6:20: 'I('
            {
            match("I("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CENSORBEGINWITHI"

    // $ANTLR start "CLOGLOGOPENBRACKET"
    public final void mCLOGLOGOPENBRACKET() throws RecognitionException {
        try {
            int _type = CLOGLOGOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:7:20: ( 'cloglog(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:7:22: 'cloglog('
            {
            match("cloglog("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOGLOGOPENBRACKET"

    // $ANTLR start "CLOSEBRACE"
    public final void mCLOSEBRACE() throws RecognitionException {
        try {
            int _type = CLOSEBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:8:12: ( '}' )
            // /u/s/h/shrirams/BUGS/BUGS.g:8:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEBRACE"

    // $ANTLR start "CLOSEBRACKET"
    public final void mCLOSEBRACKET() throws RecognitionException {
        try {
            int _type = CLOSEBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:9:14: ( ')' )
            // /u/s/h/shrirams/BUGS/BUGS.g:9:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEBRACKET"

    // $ANTLR start "CLOSESQUAREBRACKET"
    public final void mCLOSESQUAREBRACKET() throws RecognitionException {
        try {
            int _type = CLOSESQUAREBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:10:20: ( ']' )
            // /u/s/h/shrirams/BUGS/BUGS.g:10:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSESQUAREBRACKET"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:11:7: ( ':' )
            // /u/s/h/shrirams/BUGS/BUGS.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:12:7: ( ',' )
            // /u/s/h/shrirams/BUGS/BUGS.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DIRICHLETOPENBRACKET"
    public final void mDIRICHLETOPENBRACKET() throws RecognitionException {
        try {
            int _type = DIRICHLETOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:13:22: ( 'ddirich(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:13:24: 'ddirich('
            {
            match("ddirich("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIRICHLETOPENBRACKET"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:14:5: ( '/' )
            // /u/s/h/shrirams/BUGS/BUGS.g:14:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "FORSTART"
    public final void mFORSTART() throws RecognitionException {
        try {
            int _type = FORSTART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:15:10: ( 'for' )
            // /u/s/h/shrirams/BUGS/BUGS.g:15:12: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FORSTART"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:16:4: ( 'in' )
            // /u/s/h/shrirams/BUGS/BUGS.g:16:6: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INVERSEOPENBRACKET"
    public final void mINVERSEOPENBRACKET() throws RecognitionException {
        try {
            int _type = INVERSEOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:17:20: ( 'inverse(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:17:22: 'inverse('
            {
            match("inverse("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVERSEOPENBRACKET"

    // $ANTLR start "LEFTPOINTER"
    public final void mLEFTPOINTER() throws RecognitionException {
        try {
            int _type = LEFTPOINTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:18:13: ( '<-' )
            // /u/s/h/shrirams/BUGS/BUGS.g:18:15: '<-'
            {
            match("<-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTPOINTER"

    // $ANTLR start "LOGITOPENBRACKET"
    public final void mLOGITOPENBRACKET() throws RecognitionException {
        try {
            int _type = LOGITOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:19:18: ( 'logit(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:19:20: 'logit('
            {
            match("logit("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGITOPENBRACKET"

    // $ANTLR start "LOGOPENBRACKET"
    public final void mLOGOPENBRACKET() throws RecognitionException {
        try {
            int _type = LOGOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:20:16: ( 'log(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:20:18: 'log('
            {
            match("log("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGOPENBRACKET"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:21:7: ( '-' )
            // /u/s/h/shrirams/BUGS/BUGS.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MODEL"
    public final void mMODEL() throws RecognitionException {
        try {
            int _type = MODEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:22:7: ( 'model' )
            // /u/s/h/shrirams/BUGS/BUGS.g:22:9: 'model'
            {
            match("model"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODEL"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:23:6: ( '*' )
            // /u/s/h/shrirams/BUGS/BUGS.g:23:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "MUTLTINOMIALOPENBRACKET"
    public final void mMUTLTINOMIALOPENBRACKET() throws RecognitionException {
        try {
            int _type = MUTLTINOMIALOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:24:25: ( 'dmulti(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:24:27: 'dmulti('
            {
            match("dmulti("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUTLTINOMIALOPENBRACKET"

    // $ANTLR start "OPENBRACE"
    public final void mOPENBRACE() throws RecognitionException {
        try {
            int _type = OPENBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:25:11: ( '{' )
            // /u/s/h/shrirams/BUGS/BUGS.g:25:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENBRACE"

    // $ANTLR start "OPENBRACKET"
    public final void mOPENBRACKET() throws RecognitionException {
        try {
            int _type = OPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:26:13: ( '(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:26:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENBRACKET"

    // $ANTLR start "OPENSQUAREBRACKET"
    public final void mOPENSQUAREBRACKET() throws RecognitionException {
        try {
            int _type = OPENSQUAREBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:27:19: ( '[' )
            // /u/s/h/shrirams/BUGS/BUGS.g:27:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENSQUAREBRACKET"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:28:6: ( '+' )
            // /u/s/h/shrirams/BUGS/BUGS.g:28:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PROBITOPENBRACKET"
    public final void mPROBITOPENBRACKET() throws RecognitionException {
        try {
            int _type = PROBITOPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:29:19: ( 'probit(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:29:21: 'probit('
            {
            match("probit("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROBITOPENBRACKET"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:30:7: ( '~' )
            // /u/s/h/shrirams/BUGS/BUGS.g:30:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "TRUNCATIONBEGIN"
    public final void mTRUNCATIONBEGIN() throws RecognitionException {
        try {
            int _type = TRUNCATIONBEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:31:17: ( 'T(' )
            // /u/s/h/shrirams/BUGS/BUGS.g:31:19: 'T('
            {
            match("T("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUNCATIONBEGIN"

    // $ANTLR start "CONSTANTINT"
    public final void mCONSTANTINT() throws RecognitionException {
        try {
            int _type = CONSTANTINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:158:2: ( ( '0' .. '9' )+ )
            // /u/s/h/shrirams/BUGS/BUGS.g:158:4: ( '0' .. '9' )+
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:158:4: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTANTINT"

    // $ANTLR start "NODENAME"
    public final void mNODENAME() throws RecognitionException {
        try {
            int _type = NODENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:162:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )* )
            // /u/s/h/shrirams/BUGS/BUGS.g:162:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /u/s/h/shrirams/BUGS/BUGS.g:162:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODENAME"

    // $ANTLR start "CONSTANTVALUE"
    public final void mCONSTANTVALUE() throws RecognitionException {
        try {
            int _type = CONSTANTVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:166:2: ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ( 'E' ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // /u/s/h/shrirams/BUGS/BUGS.g:166:4: ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ( 'E' ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:166:4: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /u/s/h/shrirams/BUGS/BUGS.g:166:14: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // /u/s/h/shrirams/BUGS/BUGS.g:166:25: ( '.' ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:166:26: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // /u/s/h/shrirams/BUGS/BUGS.g:166:29: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /u/s/h/shrirams/BUGS/BUGS.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            // /u/s/h/shrirams/BUGS/BUGS.g:166:42: ( 'E' ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:166:43: 'E' ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    match('E'); 

                    // /u/s/h/shrirams/BUGS/BUGS.g:166:46: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /u/s/h/shrirams/BUGS/BUGS.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // /u/s/h/shrirams/BUGS/BUGS.g:166:56: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /u/s/h/shrirams/BUGS/BUGS.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTANTVALUE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /u/s/h/shrirams/BUGS/BUGS.g:169:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+ )
            // /u/s/h/shrirams/BUGS/BUGS.g:169:14: ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:169:14: ( '\\t' | ' ' | '\\r' | '\\n' | ';' | '\\u000C' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||(LA10_0 >= '\f' && LA10_0 <= '\r')||LA10_0==' '||LA10_0==';') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)==';' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:1:8: ( ABSOPENBRACKET | BERNOULLIOPENBRACKET | BETAOPENBRACKET | CENSORBEGINWITHC | CENSORBEGINWITHI | CLOGLOGOPENBRACKET | CLOSEBRACE | CLOSEBRACKET | CLOSESQUAREBRACKET | COLON | COMMA | DIRICHLETOPENBRACKET | DIV | FORSTART | IN | INVERSEOPENBRACKET | LEFTPOINTER | LOGITOPENBRACKET | LOGOPENBRACKET | MINUS | MODEL | MULT | MUTLTINOMIALOPENBRACKET | OPENBRACE | OPENBRACKET | OPENSQUAREBRACKET | PLUS | PROBITOPENBRACKET | TILDE | TRUNCATIONBEGIN | CONSTANTINT | NODENAME | CONSTANTVALUE | WHITESPACE )
        int alt11=34;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:10: ABSOPENBRACKET
                {
                mABSOPENBRACKET(); 


                }
                break;
            case 2 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:25: BERNOULLIOPENBRACKET
                {
                mBERNOULLIOPENBRACKET(); 


                }
                break;
            case 3 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:46: BETAOPENBRACKET
                {
                mBETAOPENBRACKET(); 


                }
                break;
            case 4 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:62: CENSORBEGINWITHC
                {
                mCENSORBEGINWITHC(); 


                }
                break;
            case 5 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:79: CENSORBEGINWITHI
                {
                mCENSORBEGINWITHI(); 


                }
                break;
            case 6 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:96: CLOGLOGOPENBRACKET
                {
                mCLOGLOGOPENBRACKET(); 


                }
                break;
            case 7 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:115: CLOSEBRACE
                {
                mCLOSEBRACE(); 


                }
                break;
            case 8 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:126: CLOSEBRACKET
                {
                mCLOSEBRACKET(); 


                }
                break;
            case 9 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:139: CLOSESQUAREBRACKET
                {
                mCLOSESQUAREBRACKET(); 


                }
                break;
            case 10 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:158: COLON
                {
                mCOLON(); 


                }
                break;
            case 11 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:164: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 12 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:170: DIRICHLETOPENBRACKET
                {
                mDIRICHLETOPENBRACKET(); 


                }
                break;
            case 13 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:191: DIV
                {
                mDIV(); 


                }
                break;
            case 14 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:195: FORSTART
                {
                mFORSTART(); 


                }
                break;
            case 15 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:204: IN
                {
                mIN(); 


                }
                break;
            case 16 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:207: INVERSEOPENBRACKET
                {
                mINVERSEOPENBRACKET(); 


                }
                break;
            case 17 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:226: LEFTPOINTER
                {
                mLEFTPOINTER(); 


                }
                break;
            case 18 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:238: LOGITOPENBRACKET
                {
                mLOGITOPENBRACKET(); 


                }
                break;
            case 19 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:255: LOGOPENBRACKET
                {
                mLOGOPENBRACKET(); 


                }
                break;
            case 20 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:270: MINUS
                {
                mMINUS(); 


                }
                break;
            case 21 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:276: MODEL
                {
                mMODEL(); 


                }
                break;
            case 22 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:282: MULT
                {
                mMULT(); 


                }
                break;
            case 23 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:287: MUTLTINOMIALOPENBRACKET
                {
                mMUTLTINOMIALOPENBRACKET(); 


                }
                break;
            case 24 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:311: OPENBRACE
                {
                mOPENBRACE(); 


                }
                break;
            case 25 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:321: OPENBRACKET
                {
                mOPENBRACKET(); 


                }
                break;
            case 26 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:333: OPENSQUAREBRACKET
                {
                mOPENSQUAREBRACKET(); 


                }
                break;
            case 27 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:351: PLUS
                {
                mPLUS(); 


                }
                break;
            case 28 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:356: PROBITOPENBRACKET
                {
                mPROBITOPENBRACKET(); 


                }
                break;
            case 29 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:374: TILDE
                {
                mTILDE(); 


                }
                break;
            case 30 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:380: TRUNCATIONBEGIN
                {
                mTRUNCATIONBEGIN(); 


                }
                break;
            case 31 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:396: CONSTANTINT
                {
                mCONSTANTINT(); 


                }
                break;
            case 32 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:408: NODENAME
                {
                mNODENAME(); 


                }
                break;
            case 33 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:417: CONSTANTVALUE
                {
                mCONSTANTVALUE(); 


                }
                break;
            case 34 :
                // /u/s/h/shrirams/BUGS/BUGS.g:1:431: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\5\33\6\uffff\2\33\1\uffff\1\33\1\47\1\33\4\uffff\1\52\1"+
        "\33\1\uffff\1\33\1\55\2\uffff\4\33\2\uffff\2\33\1\65\1\33\2\uffff"+
        "\1\33\1\uffff\1\33\2\uffff\5\33\1\77\1\33\1\uffff\3\33\1\uffff\5"+
        "\33\1\uffff\2\33\1\uffff\11\33\1\125\1\33\2\uffff\4\33\2\uffff\2"+
        "\33\1\uffff\2\33\4\uffff";
    static final String DFA11_eofS =
        "\137\uffff";
    static final String DFA11_minS =
        "\1\11\2\142\2\50\1\154\6\uffff\1\157\1\156\1\uffff\1\157\1\60\1"+
        "\157\4\uffff\1\60\1\162\1\uffff\1\50\1\56\2\uffff\1\163\1\145\1"+
        "\151\1\165\2\uffff\1\157\1\162\1\56\1\147\2\uffff\1\144\1\uffff"+
        "\1\157\2\uffff\1\50\2\162\1\154\1\147\1\56\1\145\1\uffff\1\50\1"+
        "\145\1\142\1\uffff\1\156\1\141\1\151\1\164\1\154\1\uffff\1\162\1"+
        "\164\1\uffff\1\154\1\151\2\50\1\143\1\151\1\157\1\163\1\50\1\56"+
        "\1\164\2\uffff\1\150\1\50\1\147\1\145\2\uffff\2\50\1\uffff\2\50"+
        "\4\uffff";
    static final String DFA11_maxS =
        "\1\176\1\142\1\155\2\50\1\154\6\uffff\1\157\1\156\1\uffff\1\157"+
        "\1\71\1\157\4\uffff\1\71\1\162\1\uffff\1\50\1\105\2\uffff\1\163"+
        "\1\145\1\151\1\165\2\uffff\1\157\1\162\1\172\1\147\2\uffff\1\144"+
        "\1\uffff\1\157\2\uffff\1\50\1\164\1\162\1\154\1\147\1\172\1\145"+
        "\1\uffff\1\151\1\145\1\142\1\uffff\1\156\1\141\1\151\1\164\1\154"+
        "\1\uffff\1\162\1\164\1\uffff\1\154\1\151\2\50\1\143\1\151\1\157"+
        "\1\163\1\50\1\172\1\164\2\uffff\1\150\1\50\1\147\1\145\2\uffff\2"+
        "\50\1\uffff\2\50\4\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\1\13\1\15\2\uffff\1\21\3\uffff\1\26"+
        "\1\30\1\31\1\32\2\uffff\1\35\2\uffff\1\40\1\42\4\uffff\1\4\1\5\4"+
        "\uffff\1\24\1\41\1\uffff\1\33\1\uffff\1\36\1\37\7\uffff\1\17\3\uffff"+
        "\1\1\5\uffff\1\16\2\uffff\1\23\13\uffff\1\2\1\3\4\uffff\1\22\1\25"+
        "\2\uffff\1\27\2\uffff\1\34\1\14\1\6\1\20";
    static final String DFA11_specialS =
        "\137\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\34\1\uffff\2\34\22\uffff\1\34\7\uffff\1\24\1\7\1\22\1\26"+
            "\1\12\1\20\1\uffff\1\13\12\32\1\11\1\34\1\16\4\uffff\2\33\1"+
            "\3\5\33\1\4\12\33\1\31\6\33\1\25\1\uffff\1\10\3\uffff\1\1\1"+
            "\33\1\5\1\2\1\33\1\14\2\33\1\15\2\33\1\17\1\21\2\33\1\27\12"+
            "\33\1\23\1\uffff\1\6\1\30",
            "\1\35",
            "\1\36\1\uffff\1\37\10\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\12\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "\12\50",
            "\1\53",
            "",
            "\1\54",
            "\1\50\1\uffff\12\32\13\uffff\1\50",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\33\1\uffff\12\33\7\uffff\32\33\6\uffff\25\33\1\64\4\33",
            "\1\66",
            "",
            "",
            "\1\67",
            "",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72\1\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\33\1\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\100",
            "",
            "\1\102\100\uffff\1\101",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\33\1\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ABSOPENBRACKET | BERNOULLIOPENBRACKET | BETAOPENBRACKET | CENSORBEGINWITHC | CENSORBEGINWITHI | CLOGLOGOPENBRACKET | CLOSEBRACE | CLOSEBRACKET | CLOSESQUAREBRACKET | COLON | COMMA | DIRICHLETOPENBRACKET | DIV | FORSTART | IN | INVERSEOPENBRACKET | LEFTPOINTER | LOGITOPENBRACKET | LOGOPENBRACKET | MINUS | MODEL | MULT | MUTLTINOMIALOPENBRACKET | OPENBRACE | OPENBRACKET | OPENSQUAREBRACKET | PLUS | PROBITOPENBRACKET | TILDE | TRUNCATIONBEGIN | CONSTANTINT | NODENAME | CONSTANTVALUE | WHITESPACE );";
        }
    }
 

}