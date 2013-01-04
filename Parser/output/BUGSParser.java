// $ANTLR 3.4 /u/s/h/shrirams/BUGS/BUGS.g 2013-01-04 14:31:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BUGSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSOPENBRACKET", "BERNOULLIOPENBRACKET", "BETAOPENBRACKET", "CENSORBEGINWITHC", "CENSORBEGINWITHI", "CLOGLOGOPENBRACKET", "CLOSEBRACE", "CLOSEBRACKET", "CLOSESQUAREBRACKET", "COLON", "COMMA", "CONSTANTINT", "CONSTANTVALUE", "DIRICHLETOPENBRACKET", "DIV", "FORSTART", "IN", "INVERSEOPENBRACKET", "LEFTPOINTER", "LOGITOPENBRACKET", "LOGOPENBRACKET", "MINUS", "MODEL", "MULT", "MUTLTINOMIALOPENBRACKET", "NODENAME", "OPENBRACE", "OPENBRACKET", "OPENSQUAREBRACKET", "PLUS", "PROBITOPENBRACKET", "TILDE", "TRUNCATIONBEGIN", "WHITESPACE"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public BUGSParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BUGSParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return BUGSParser.tokenNames; }
    public String getGrammarFileName() { return "/u/s/h/shrirams/BUGS/BUGS.g"; }


        public static void main(String[] args) throws Exception {
            BUGSLexer lex = new BUGSLexer(new ANTLRFileStream("Test"));
            CommonTokenStream tokens = new CommonTokenStream(lex);
     
            BUGSParser parser = new BUGSParser(tokens);
     
            try {
                parser.prog();
            } catch (RecognitionException e)  {
                e.printStackTrace();
            }
        }



    // $ANTLR start "prog"
    // /u/s/h/shrirams/BUGS/BUGS.g:54:1: prog : ( MODEL OPENBRACE statements CLOSEBRACE )* ;
    public final void prog() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:54:6: ( ( MODEL OPENBRACE statements CLOSEBRACE )* )
            // /u/s/h/shrirams/BUGS/BUGS.g:54:8: ( MODEL OPENBRACE statements CLOSEBRACE )*
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:54:8: ( MODEL OPENBRACE statements CLOSEBRACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MODEL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:54:9: MODEL OPENBRACE statements CLOSEBRACE
            	    {
            	    match(input,MODEL,FOLLOW_MODEL_in_prog269); if (state.failed) return ;

            	    match(input,OPENBRACE,FOLLOW_OPENBRACE_in_prog271); if (state.failed) return ;

            	    pushFollow(FOLLOW_statements_in_prog273);
            	    statements();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,CLOSEBRACE,FOLLOW_CLOSEBRACE_in_prog275); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "statements"
    // /u/s/h/shrirams/BUGS/BUGS.g:56:1: statements : ( ( uvNode TILDE )=> stochasticNodeExpr | ( mvNode TILDE )=> stochasticNodeExpr | ( uvNode LEFTPOINTER )=> logicalNodeExpr | ( mvNode LEFTPOINTER )=> logicalNodeExpr | ( linkFunction LEFTPOINTER )=> logicalNodeExpr | ( startFor statements endFor ) )+ ;
    public final void statements() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:56:12: ( ( ( uvNode TILDE )=> stochasticNodeExpr | ( mvNode TILDE )=> stochasticNodeExpr | ( uvNode LEFTPOINTER )=> logicalNodeExpr | ( mvNode LEFTPOINTER )=> logicalNodeExpr | ( linkFunction LEFTPOINTER )=> logicalNodeExpr | ( startFor statements endFor ) )+ )
            // /u/s/h/shrirams/BUGS/BUGS.g:56:15: ( ( uvNode TILDE )=> stochasticNodeExpr | ( mvNode TILDE )=> stochasticNodeExpr | ( uvNode LEFTPOINTER )=> logicalNodeExpr | ( mvNode LEFTPOINTER )=> logicalNodeExpr | ( linkFunction LEFTPOINTER )=> logicalNodeExpr | ( startFor statements endFor ) )+
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:56:15: ( ( uvNode TILDE )=> stochasticNodeExpr | ( mvNode TILDE )=> stochasticNodeExpr | ( uvNode LEFTPOINTER )=> logicalNodeExpr | ( mvNode LEFTPOINTER )=> logicalNodeExpr | ( linkFunction LEFTPOINTER )=> logicalNodeExpr | ( startFor statements endFor ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case NODENAME:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_BUGS()) ) {
                        alt2=1;
                    }
                    else if ( (synpred2_BUGS()) ) {
                        alt2=2;
                    }
                    else if ( (synpred3_BUGS()) ) {
                        alt2=3;
                    }
                    else if ( (synpred4_BUGS()) ) {
                        alt2=4;
                    }
                    else if ( (synpred5_BUGS()) ) {
                        alt2=5;
                    }


                    }
                    break;
                case LOGOPENBRACKET:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (synpred3_BUGS()) ) {
                        alt2=3;
                    }
                    else if ( (synpred4_BUGS()) ) {
                        alt2=4;
                    }
                    else if ( (synpred5_BUGS()) ) {
                        alt2=5;
                    }


                    }
                    break;
                case LOGITOPENBRACKET:
                    {
                    int LA2_4 = input.LA(2);

                    if ( (synpred3_BUGS()) ) {
                        alt2=3;
                    }
                    else if ( (synpred4_BUGS()) ) {
                        alt2=4;
                    }
                    else if ( (synpred5_BUGS()) ) {
                        alt2=5;
                    }


                    }
                    break;
                case CLOGLOGOPENBRACKET:
                    {
                    int LA2_5 = input.LA(2);

                    if ( (synpred3_BUGS()) ) {
                        alt2=3;
                    }
                    else if ( (synpred4_BUGS()) ) {
                        alt2=4;
                    }
                    else if ( (synpred5_BUGS()) ) {
                        alt2=5;
                    }


                    }
                    break;
                case PROBITOPENBRACKET:
                    {
                    int LA2_6 = input.LA(2);

                    if ( (synpred3_BUGS()) ) {
                        alt2=3;
                    }
                    else if ( (synpred4_BUGS()) ) {
                        alt2=4;
                    }
                    else if ( (synpred5_BUGS()) ) {
                        alt2=5;
                    }


                    }
                    break;
                case FORSTART:
                    {
                    alt2=6;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:56:16: ( uvNode TILDE )=> stochasticNodeExpr
            	    {
            	    pushFollow(FOLLOW_stochasticNodeExpr_in_statements296);
            	    stochasticNodeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:57:4: ( mvNode TILDE )=> stochasticNodeExpr
            	    {
            	    pushFollow(FOLLOW_stochasticNodeExpr_in_statements310);
            	    stochasticNodeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:58:4: ( uvNode LEFTPOINTER )=> logicalNodeExpr
            	    {
            	    pushFollow(FOLLOW_logicalNodeExpr_in_statements323);
            	    logicalNodeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:59:4: ( mvNode LEFTPOINTER )=> logicalNodeExpr
            	    {
            	    pushFollow(FOLLOW_logicalNodeExpr_in_statements337);
            	    logicalNodeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:60:4: ( linkFunction LEFTPOINTER )=> logicalNodeExpr
            	    {
            	    pushFollow(FOLLOW_logicalNodeExpr_in_statements351);
            	    logicalNodeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:61:4: ( startFor statements endFor )
            	    {
            	    // /u/s/h/shrirams/BUGS/BUGS.g:61:4: ( startFor statements endFor )
            	    // /u/s/h/shrirams/BUGS/BUGS.g:61:5: startFor statements endFor
            	    {
            	    pushFollow(FOLLOW_startFor_in_statements358);
            	    startFor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_statements_in_statements360);
            	    statements();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_endFor_in_statements362);
            	    endFor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statements"



    // $ANTLR start "stochasticNodeExpr"
    // /u/s/h/shrirams/BUGS/BUGS.g:65:1: stochasticNodeExpr : ( ( uvNode )=> uvStochasticNodeExpr ( censor | truncation )? | mvStochasticNodeExpr );
    public final void stochasticNodeExpr() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:66:2: ( ( uvNode )=> uvStochasticNodeExpr ( censor | truncation )? | mvStochasticNodeExpr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NODENAME) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred6_BUGS()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:66:4: ( uvNode )=> uvStochasticNodeExpr ( censor | truncation )?
                    {
                    pushFollow(FOLLOW_uvStochasticNodeExpr_in_stochasticNodeExpr386);
                    uvStochasticNodeExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    // /u/s/h/shrirams/BUGS/BUGS.g:66:37: ( censor | truncation )?
                    int alt3=3;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0 >= CENSORBEGINWITHC && LA3_0 <= CENSORBEGINWITHI)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==TRUNCATIONBEGIN) ) {
                        alt3=2;
                    }
                    switch (alt3) {
                        case 1 :
                            // /u/s/h/shrirams/BUGS/BUGS.g:66:38: censor
                            {
                            pushFollow(FOLLOW_censor_in_stochasticNodeExpr389);
                            censor();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /u/s/h/shrirams/BUGS/BUGS.g:66:47: truncation
                            {
                            pushFollow(FOLLOW_truncation_in_stochasticNodeExpr393);
                            truncation();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:67:4: mvStochasticNodeExpr
                    {
                    pushFollow(FOLLOW_mvStochasticNodeExpr_in_stochasticNodeExpr400);
                    mvStochasticNodeExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stochasticNodeExpr"



    // $ANTLR start "uvStochasticNodeExpr"
    // /u/s/h/shrirams/BUGS/BUGS.g:70:1: uvStochasticNodeExpr : uvNode TILDE uvDistribution ;
    public final void uvStochasticNodeExpr() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:71:2: ( uvNode TILDE uvDistribution )
            // /u/s/h/shrirams/BUGS/BUGS.g:71:3: uvNode TILDE uvDistribution
            {
            pushFollow(FOLLOW_uvNode_in_uvStochasticNodeExpr411);
            uvNode();

            state._fsp--;
            if (state.failed) return ;

            match(input,TILDE,FOLLOW_TILDE_in_uvStochasticNodeExpr413); if (state.failed) return ;

            pushFollow(FOLLOW_uvDistribution_in_uvStochasticNodeExpr415);
            uvDistribution();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "uvStochasticNodeExpr"



    // $ANTLR start "mvStochasticNodeExpr"
    // /u/s/h/shrirams/BUGS/BUGS.g:73:1: mvStochasticNodeExpr : mvNode TILDE mvDistribution ;
    public final void mvStochasticNodeExpr() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:74:2: ( mvNode TILDE mvDistribution )
            // /u/s/h/shrirams/BUGS/BUGS.g:74:3: mvNode TILDE mvDistribution
            {
            pushFollow(FOLLOW_mvNode_in_mvStochasticNodeExpr425);
            mvNode();

            state._fsp--;
            if (state.failed) return ;

            match(input,TILDE,FOLLOW_TILDE_in_mvStochasticNodeExpr427); if (state.failed) return ;

            pushFollow(FOLLOW_mvDistribution_in_mvStochasticNodeExpr429);
            mvDistribution();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mvStochasticNodeExpr"



    // $ANTLR start "censor"
    // /u/s/h/shrirams/BUGS/BUGS.g:77:1: censor : ( CENSORBEGINWITHC | CENSORBEGINWITHI ) ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower ) CLOSEBRACKET ;
    public final void censor() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:78:3: ( ( CENSORBEGINWITHC | CENSORBEGINWITHI ) ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower ) CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:78:5: ( CENSORBEGINWITHC | CENSORBEGINWITHI ) ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower ) CLOSEBRACKET
            {
            if ( (input.LA(1) >= CENSORBEGINWITHC && input.LA(1) <= CENSORBEGINWITHI) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // /u/s/h/shrirams/BUGS/BUGS.g:78:41: ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower )
            int alt5=2;
            switch ( input.LA(1) ) {
            case NODENAME:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred7_BUGS()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case CONSTANTVALUE:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred7_BUGS()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case COMMA:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:78:43: ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper
                    {
                    pushFollow(FOLLOW_lowerWithOptionalUpper_in_censor457);
                    lowerWithOptionalUpper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:78:94: upperWithOptionalLower
                    {
                    pushFollow(FOLLOW_upperWithOptionalLower_in_censor462);
                    upperWithOptionalLower();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_censor467); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "censor"



    // $ANTLR start "truncation"
    // /u/s/h/shrirams/BUGS/BUGS.g:80:1: truncation : TRUNCATIONBEGIN ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower ) CLOSEBRACKET ;
    public final void truncation() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:81:2: ( TRUNCATIONBEGIN ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower ) CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:81:4: TRUNCATIONBEGIN ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower ) CLOSEBRACKET
            {
            match(input,TRUNCATIONBEGIN,FOLLOW_TRUNCATIONBEGIN_in_truncation479); if (state.failed) return ;

            // /u/s/h/shrirams/BUGS/BUGS.g:81:20: ( ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper | upperWithOptionalLower )
            int alt6=2;
            switch ( input.LA(1) ) {
            case NODENAME:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred8_BUGS()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case CONSTANTVALUE:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred8_BUGS()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case COMMA:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:81:23: ( uvNode | CONSTANTVALUE )=> lowerWithOptionalUpper
                    {
                    pushFollow(FOLLOW_lowerWithOptionalUpper_in_truncation492);
                    lowerWithOptionalUpper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:81:74: upperWithOptionalLower
                    {
                    pushFollow(FOLLOW_upperWithOptionalLower_in_truncation496);
                    upperWithOptionalLower();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_truncation501); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "truncation"



    // $ANTLR start "lowerWithOptionalUpper"
    // /u/s/h/shrirams/BUGS/BUGS.g:84:1: lowerWithOptionalUpper : ( uvNode | CONSTANTVALUE ) COMMA ( uvNode | CONSTANTVALUE )? ;
    public final void lowerWithOptionalUpper() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:85:2: ( ( uvNode | CONSTANTVALUE ) COMMA ( uvNode | CONSTANTVALUE )? )
            // /u/s/h/shrirams/BUGS/BUGS.g:85:5: ( uvNode | CONSTANTVALUE ) COMMA ( uvNode | CONSTANTVALUE )?
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:85:5: ( uvNode | CONSTANTVALUE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NODENAME) ) {
                alt7=1;
            }
            else if ( (LA7_0==CONSTANTVALUE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:85:6: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_lowerWithOptionalUpper516);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:85:13: CONSTANTVALUE
                    {
                    match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_lowerWithOptionalUpper518); if (state.failed) return ;

                    }
                    break;

            }


            match(input,COMMA,FOLLOW_COMMA_in_lowerWithOptionalUpper521); if (state.failed) return ;

            // /u/s/h/shrirams/BUGS/BUGS.g:85:34: ( uvNode | CONSTANTVALUE )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NODENAME) ) {
                alt8=1;
            }
            else if ( (LA8_0==CONSTANTVALUE) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:85:35: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_lowerWithOptionalUpper524);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:85:42: CONSTANTVALUE
                    {
                    match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_lowerWithOptionalUpper526); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lowerWithOptionalUpper"



    // $ANTLR start "upperWithOptionalLower"
    // /u/s/h/shrirams/BUGS/BUGS.g:88:1: upperWithOptionalLower : ( uvNode | CONSTANTVALUE )? COMMA ( uvNode | CONSTANTVALUE ) ;
    public final void upperWithOptionalLower() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:89:2: ( ( uvNode | CONSTANTVALUE )? COMMA ( uvNode | CONSTANTVALUE ) )
            // /u/s/h/shrirams/BUGS/BUGS.g:89:5: ( uvNode | CONSTANTVALUE )? COMMA ( uvNode | CONSTANTVALUE )
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:89:5: ( uvNode | CONSTANTVALUE )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NODENAME) ) {
                alt9=1;
            }
            else if ( (LA9_0==CONSTANTVALUE) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:89:6: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_upperWithOptionalLower543);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:89:13: CONSTANTVALUE
                    {
                    match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_upperWithOptionalLower545); if (state.failed) return ;

                    }
                    break;

            }


            match(input,COMMA,FOLLOW_COMMA_in_upperWithOptionalLower549); if (state.failed) return ;

            // /u/s/h/shrirams/BUGS/BUGS.g:89:35: ( uvNode | CONSTANTVALUE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NODENAME) ) {
                alt10=1;
            }
            else if ( (LA10_0==CONSTANTVALUE) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:89:36: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_upperWithOptionalLower552);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:89:43: CONSTANTVALUE
                    {
                    match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_upperWithOptionalLower554); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "upperWithOptionalLower"



    // $ANTLR start "logicalNodeExpr"
    // /u/s/h/shrirams/BUGS/BUGS.g:92:1: logicalNodeExpr : ( ( uvNode | linkFunction )=> ( uvNode | linkFunction ) LEFTPOINTER exprWithNodesFunctions | mvNode LEFTPOINTER exprWithNodesFunctions );
    public final void logicalNodeExpr() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:93:2: ( ( uvNode | linkFunction )=> ( uvNode | linkFunction ) LEFTPOINTER exprWithNodesFunctions | mvNode LEFTPOINTER exprWithNodesFunctions )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NODENAME) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred9_BUGS()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA12_0==LOGOPENBRACKET) && (synpred9_BUGS())) {
                alt12=1;
            }
            else if ( (LA12_0==LOGITOPENBRACKET) && (synpred9_BUGS())) {
                alt12=1;
            }
            else if ( (LA12_0==CLOGLOGOPENBRACKET) && (synpred9_BUGS())) {
                alt12=1;
            }
            else if ( (LA12_0==PROBITOPENBRACKET) && (synpred9_BUGS())) {
                alt12=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:93:4: ( uvNode | linkFunction )=> ( uvNode | linkFunction ) LEFTPOINTER exprWithNodesFunctions
                    {
                    // /u/s/h/shrirams/BUGS/BUGS.g:93:31: ( uvNode | linkFunction )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NODENAME) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==CLOGLOGOPENBRACKET||(LA11_0 >= LOGITOPENBRACKET && LA11_0 <= LOGOPENBRACKET)||LA11_0==PROBITOPENBRACKET) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // /u/s/h/shrirams/BUGS/BUGS.g:93:32: uvNode
                            {
                            pushFollow(FOLLOW_uvNode_in_logicalNodeExpr578);
                            uvNode();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /u/s/h/shrirams/BUGS/BUGS.g:93:41: linkFunction
                            {
                            pushFollow(FOLLOW_linkFunction_in_logicalNodeExpr582);
                            linkFunction();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,LEFTPOINTER,FOLLOW_LEFTPOINTER_in_logicalNodeExpr585); if (state.failed) return ;

                    pushFollow(FOLLOW_exprWithNodesFunctions_in_logicalNodeExpr587);
                    exprWithNodesFunctions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:94:5: mvNode LEFTPOINTER exprWithNodesFunctions
                    {
                    pushFollow(FOLLOW_mvNode_in_logicalNodeExpr593);
                    mvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LEFTPOINTER,FOLLOW_LEFTPOINTER_in_logicalNodeExpr595); if (state.failed) return ;

                    pushFollow(FOLLOW_exprWithNodesFunctions_in_logicalNodeExpr597);
                    exprWithNodesFunctions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "logicalNodeExpr"



    // $ANTLR start "linkFunction"
    // /u/s/h/shrirams/BUGS/BUGS.g:97:1: linkFunction : ( LOGOPENBRACKET uvNode CLOSEBRACKET | LOGITOPENBRACKET uvNode CLOSEBRACKET | CLOGLOGOPENBRACKET uvNode CLOSEBRACKET | PROBITOPENBRACKET uvNode CLOSEBRACKET );
    public final void linkFunction() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:98:2: ( LOGOPENBRACKET uvNode CLOSEBRACKET | LOGITOPENBRACKET uvNode CLOSEBRACKET | CLOGLOGOPENBRACKET uvNode CLOSEBRACKET | PROBITOPENBRACKET uvNode CLOSEBRACKET )
            int alt13=4;
            switch ( input.LA(1) ) {
            case LOGOPENBRACKET:
                {
                alt13=1;
                }
                break;
            case LOGITOPENBRACKET:
                {
                alt13=2;
                }
                break;
            case CLOGLOGOPENBRACKET:
                {
                alt13=3;
                }
                break;
            case PROBITOPENBRACKET:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:98:4: LOGOPENBRACKET uvNode CLOSEBRACKET
                    {
                    match(input,LOGOPENBRACKET,FOLLOW_LOGOPENBRACKET_in_linkFunction609); if (state.failed) return ;

                    pushFollow(FOLLOW_uvNode_in_linkFunction611);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_linkFunction613); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:99:4: LOGITOPENBRACKET uvNode CLOSEBRACKET
                    {
                    match(input,LOGITOPENBRACKET,FOLLOW_LOGITOPENBRACKET_in_linkFunction619); if (state.failed) return ;

                    pushFollow(FOLLOW_uvNode_in_linkFunction621);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_linkFunction623); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:100:4: CLOGLOGOPENBRACKET uvNode CLOSEBRACKET
                    {
                    match(input,CLOGLOGOPENBRACKET,FOLLOW_CLOGLOGOPENBRACKET_in_linkFunction628); if (state.failed) return ;

                    pushFollow(FOLLOW_uvNode_in_linkFunction630);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_linkFunction632); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:101:4: PROBITOPENBRACKET uvNode CLOSEBRACKET
                    {
                    match(input,PROBITOPENBRACKET,FOLLOW_PROBITOPENBRACKET_in_linkFunction637); if (state.failed) return ;

                    pushFollow(FOLLOW_uvNode_in_linkFunction639);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_linkFunction641); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "linkFunction"



    // $ANTLR start "exprWithNodesFunctions"
    // /u/s/h/shrirams/BUGS/BUGS.g:104:1: exprWithNodesFunctions : ( unaryExpression | OPENBRACKET MINUS unaryExpression CLOSEBRACKET | MINUS unaryExpression | scalarFunctions | vectorFunctions ) ( ( PLUS | MINUS | MULT | DIV ) exprWithNodesFunctions )? ;
    public final void exprWithNodesFunctions() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:105:2: ( ( unaryExpression | OPENBRACKET MINUS unaryExpression CLOSEBRACKET | MINUS unaryExpression | scalarFunctions | vectorFunctions ) ( ( PLUS | MINUS | MULT | DIV ) exprWithNodesFunctions )? )
            // /u/s/h/shrirams/BUGS/BUGS.g:105:4: ( unaryExpression | OPENBRACKET MINUS unaryExpression CLOSEBRACKET | MINUS unaryExpression | scalarFunctions | vectorFunctions ) ( ( PLUS | MINUS | MULT | DIV ) exprWithNodesFunctions )?
            {
            // /u/s/h/shrirams/BUGS/BUGS.g:105:4: ( unaryExpression | OPENBRACKET MINUS unaryExpression CLOSEBRACKET | MINUS unaryExpression | scalarFunctions | vectorFunctions )
            int alt14=5;
            switch ( input.LA(1) ) {
            case CONSTANTINT:
            case CONSTANTVALUE:
            case NODENAME:
                {
                alt14=1;
                }
                break;
            case OPENBRACKET:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==MINUS) ) {
                    alt14=2;
                }
                else if ( ((LA14_2 >= CONSTANTINT && LA14_2 <= CONSTANTVALUE)||LA14_2==NODENAME||LA14_2==OPENBRACKET) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                alt14=3;
                }
                break;
            case ABSOPENBRACKET:
                {
                alt14=4;
                }
                break;
            case INVERSEOPENBRACKET:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:105:5: unaryExpression
                    {
                    pushFollow(FOLLOW_unaryExpression_in_exprWithNodesFunctions654);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:105:23: OPENBRACKET MINUS unaryExpression CLOSEBRACKET
                    {
                    match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_exprWithNodesFunctions658); if (state.failed) return ;

                    match(input,MINUS,FOLLOW_MINUS_in_exprWithNodesFunctions660); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_exprWithNodesFunctions662);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_exprWithNodesFunctions665); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:105:73: MINUS unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_exprWithNodesFunctions669); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_exprWithNodesFunctions671);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:105:97: scalarFunctions
                    {
                    pushFollow(FOLLOW_scalarFunctions_in_exprWithNodesFunctions675);
                    scalarFunctions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:105:115: vectorFunctions
                    {
                    pushFollow(FOLLOW_vectorFunctions_in_exprWithNodesFunctions679);
                    vectorFunctions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // /u/s/h/shrirams/BUGS/BUGS.g:105:133: ( ( PLUS | MINUS | MULT | DIV ) exprWithNodesFunctions )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DIV||LA15_0==MINUS||LA15_0==MULT||LA15_0==PLUS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:105:134: ( PLUS | MINUS | MULT | DIV ) exprWithNodesFunctions
                    {
                    if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULT||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_exprWithNodesFunctions_in_exprWithNodesFunctions694);
                    exprWithNodesFunctions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exprWithNodesFunctions"



    // $ANTLR start "uvNode"
    // /u/s/h/shrirams/BUGS/BUGS.g:108:1: uvNode : NODENAME ( OPENSQUAREBRACKET expression ( COMMA expression )* CLOSESQUAREBRACKET )? ;
    public final void uvNode() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:109:2: ( NODENAME ( OPENSQUAREBRACKET expression ( COMMA expression )* CLOSESQUAREBRACKET )? )
            // /u/s/h/shrirams/BUGS/BUGS.g:109:4: NODENAME ( OPENSQUAREBRACKET expression ( COMMA expression )* CLOSESQUAREBRACKET )?
            {
            match(input,NODENAME,FOLLOW_NODENAME_in_uvNode707); if (state.failed) return ;

            // /u/s/h/shrirams/BUGS/BUGS.g:109:13: ( OPENSQUAREBRACKET expression ( COMMA expression )* CLOSESQUAREBRACKET )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OPENSQUAREBRACKET) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1 >= CONSTANTINT && LA17_1 <= CONSTANTVALUE)||LA17_1==NODENAME||LA17_1==OPENBRACKET) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:109:14: OPENSQUAREBRACKET expression ( COMMA expression )* CLOSESQUAREBRACKET
                    {
                    match(input,OPENSQUAREBRACKET,FOLLOW_OPENSQUAREBRACKET_in_uvNode710); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_uvNode712);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    // /u/s/h/shrirams/BUGS/BUGS.g:109:43: ( COMMA expression )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /u/s/h/shrirams/BUGS/BUGS.g:109:44: COMMA expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_uvNode715); if (state.failed) return ;

                    	    pushFollow(FOLLOW_expression_in_uvNode717);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    match(input,CLOSESQUAREBRACKET,FOLLOW_CLOSESQUAREBRACKET_in_uvNode722); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "uvNode"



    // $ANTLR start "mvNode"
    // /u/s/h/shrirams/BUGS/BUGS.g:111:1: mvNode : NODENAME OPENSQUAREBRACKET multiIndices CLOSESQUAREBRACKET ;
    public final void mvNode() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:112:2: ( NODENAME OPENSQUAREBRACKET multiIndices CLOSESQUAREBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:112:4: NODENAME OPENSQUAREBRACKET multiIndices CLOSESQUAREBRACKET
            {
            match(input,NODENAME,FOLLOW_NODENAME_in_mvNode736); if (state.failed) return ;

            match(input,OPENSQUAREBRACKET,FOLLOW_OPENSQUAREBRACKET_in_mvNode738); if (state.failed) return ;

            pushFollow(FOLLOW_multiIndices_in_mvNode740);
            multiIndices();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSESQUAREBRACKET,FOLLOW_CLOSESQUAREBRACKET_in_mvNode742); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mvNode"



    // $ANTLR start "expression"
    // /u/s/h/shrirams/BUGS/BUGS.g:115:1: expression : unaryExpression ( ( PLUS | MINUS | MULT | DIV ) expression )? ;
    public final void expression() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:116:2: ( unaryExpression ( ( PLUS | MINUS | MULT | DIV ) expression )? )
            // /u/s/h/shrirams/BUGS/BUGS.g:116:4: unaryExpression ( ( PLUS | MINUS | MULT | DIV ) expression )?
            {
            pushFollow(FOLLOW_unaryExpression_in_expression754);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            // /u/s/h/shrirams/BUGS/BUGS.g:116:20: ( ( PLUS | MINUS | MULT | DIV ) expression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DIV||LA18_0==MINUS||LA18_0==MULT||LA18_0==PLUS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:116:21: ( PLUS | MINUS | MULT | DIV ) expression
                    {
                    if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULT||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_expression767);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "unaryExpression"
    // /u/s/h/shrirams/BUGS/BUGS.g:119:1: unaryExpression : ( CONSTANTINT | CONSTANTVALUE | uvNode | OPENBRACKET expression CLOSEBRACKET );
    public final void unaryExpression() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:120:2: ( CONSTANTINT | CONSTANTVALUE | uvNode | OPENBRACKET expression CLOSEBRACKET )
            int alt19=4;
            switch ( input.LA(1) ) {
            case CONSTANTINT:
                {
                alt19=1;
                }
                break;
            case CONSTANTVALUE:
                {
                alt19=2;
                }
                break;
            case NODENAME:
                {
                alt19=3;
                }
                break;
            case OPENBRACKET:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:120:4: CONSTANTINT
                    {
                    match(input,CONSTANTINT,FOLLOW_CONSTANTINT_in_unaryExpression780); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:121:4: CONSTANTVALUE
                    {
                    match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_unaryExpression787); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:122:4: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_unaryExpression792);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:123:4: OPENBRACKET expression CLOSEBRACKET
                    {
                    match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_unaryExpression798); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_unaryExpression800);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_unaryExpression802); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "multiIndices"
    // /u/s/h/shrirams/BUGS/BUGS.g:126:1: multiIndices : multiDimExpression ( COMMA multiDimExpression )* ;
    public final void multiIndices() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:127:2: ( multiDimExpression ( COMMA multiDimExpression )* )
            // /u/s/h/shrirams/BUGS/BUGS.g:127:4: multiDimExpression ( COMMA multiDimExpression )*
            {
            pushFollow(FOLLOW_multiDimExpression_in_multiIndices814);
            multiDimExpression();

            state._fsp--;
            if (state.failed) return ;

            // /u/s/h/shrirams/BUGS/BUGS.g:127:23: ( COMMA multiDimExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /u/s/h/shrirams/BUGS/BUGS.g:127:24: COMMA multiDimExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiIndices817); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiDimExpression_in_multiIndices819);
            	    multiDimExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multiIndices"



    // $ANTLR start "multiDimExpression"
    // /u/s/h/shrirams/BUGS/BUGS.g:130:1: multiDimExpression : ( ( OPENBRACKET expression COLON )=> OPENBRACKET expression COLON expression CLOSEBRACKET | expression ( COLON expression )? );
    public final void multiDimExpression() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:131:2: ( ( OPENBRACKET expression COLON )=> OPENBRACKET expression COLON expression CLOSEBRACKET | expression ( COLON expression )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OPENBRACKET) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred10_BUGS()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA22_0 >= CONSTANTINT && LA22_0 <= CONSTANTVALUE)||LA22_0==NODENAME) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:131:4: ( OPENBRACKET expression COLON )=> OPENBRACKET expression COLON expression CLOSEBRACKET
                    {
                    match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_multiDimExpression843); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_multiDimExpression845);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,COLON,FOLLOW_COLON_in_multiDimExpression847); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_multiDimExpression849);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_multiDimExpression851); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:132:4: expression ( COLON expression )?
                    {
                    pushFollow(FOLLOW_expression_in_multiDimExpression856);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    // /u/s/h/shrirams/BUGS/BUGS.g:132:15: ( COLON expression )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COLON) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /u/s/h/shrirams/BUGS/BUGS.g:132:16: COLON expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_multiDimExpression859); if (state.failed) return ;

                            pushFollow(FOLLOW_expression_in_multiDimExpression861);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multiDimExpression"



    // $ANTLR start "startFor"
    // /u/s/h/shrirams/BUGS/BUGS.g:135:1: startFor : FORSTART OPENBRACKET loopVariable IN loopBegin COLON loopEnd CLOSEBRACKET OPENBRACE ;
    public final void startFor() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:136:2: ( FORSTART OPENBRACKET loopVariable IN loopBegin COLON loopEnd CLOSEBRACKET OPENBRACE )
            // /u/s/h/shrirams/BUGS/BUGS.g:136:4: FORSTART OPENBRACKET loopVariable IN loopBegin COLON loopEnd CLOSEBRACKET OPENBRACE
            {
            match(input,FORSTART,FOLLOW_FORSTART_in_startFor875); if (state.failed) return ;

            match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_startFor877); if (state.failed) return ;

            pushFollow(FOLLOW_loopVariable_in_startFor879);
            loopVariable();

            state._fsp--;
            if (state.failed) return ;

            match(input,IN,FOLLOW_IN_in_startFor881); if (state.failed) return ;

            pushFollow(FOLLOW_loopBegin_in_startFor883);
            loopBegin();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_startFor885); if (state.failed) return ;

            pushFollow(FOLLOW_loopEnd_in_startFor887);
            loopEnd();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_startFor889); if (state.failed) return ;

            match(input,OPENBRACE,FOLLOW_OPENBRACE_in_startFor891); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "startFor"



    // $ANTLR start "endFor"
    // /u/s/h/shrirams/BUGS/BUGS.g:139:1: endFor : CLOSEBRACE ;
    public final void endFor() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:140:2: ( CLOSEBRACE )
            // /u/s/h/shrirams/BUGS/BUGS.g:140:4: CLOSEBRACE
            {
            match(input,CLOSEBRACE,FOLLOW_CLOSEBRACE_in_endFor904); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "endFor"



    // $ANTLR start "loopVariable"
    // /u/s/h/shrirams/BUGS/BUGS.g:143:1: loopVariable : NODENAME ;
    public final void loopVariable() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:144:2: ( NODENAME )
            // /u/s/h/shrirams/BUGS/BUGS.g:144:4: NODENAME
            {
            match(input,NODENAME,FOLLOW_NODENAME_in_loopVariable916); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "loopVariable"



    // $ANTLR start "loopBegin"
    // /u/s/h/shrirams/BUGS/BUGS.g:147:1: loopBegin : ( uvNode | CONSTANTINT );
    public final void loopBegin() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:148:2: ( uvNode | CONSTANTINT )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==NODENAME) ) {
                alt23=1;
            }
            else if ( (LA23_0==CONSTANTINT) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:148:4: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_loopBegin928);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:149:4: CONSTANTINT
                    {
                    match(input,CONSTANTINT,FOLLOW_CONSTANTINT_in_loopBegin934); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "loopBegin"



    // $ANTLR start "loopEnd"
    // /u/s/h/shrirams/BUGS/BUGS.g:152:1: loopEnd : ( uvNode | CONSTANTINT );
    public final void loopEnd() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:153:2: ( uvNode | CONSTANTINT )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NODENAME) ) {
                alt24=1;
            }
            else if ( (LA24_0==CONSTANTINT) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:153:4: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_loopEnd946);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:154:4: CONSTANTINT
                    {
                    match(input,CONSTANTINT,FOLLOW_CONSTANTINT_in_loopEnd952); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "loopEnd"



    // $ANTLR start "scalarFunctions"
    // /u/s/h/shrirams/BUGS/BUGS.g:171:1: scalarFunctions : ABSOPENBRACKET exprWithNodesFunctions CLOSEBRACKET ;
    public final void scalarFunctions() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:172:2: ( ABSOPENBRACKET exprWithNodesFunctions CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:172:4: ABSOPENBRACKET exprWithNodesFunctions CLOSEBRACKET
            {
            match(input,ABSOPENBRACKET,FOLLOW_ABSOPENBRACKET_in_scalarFunctions1108); if (state.failed) return ;

            pushFollow(FOLLOW_exprWithNodesFunctions_in_scalarFunctions1110);
            exprWithNodesFunctions();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_scalarFunctions1112); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "scalarFunctions"



    // $ANTLR start "vectorFunctions"
    // /u/s/h/shrirams/BUGS/BUGS.g:175:1: vectorFunctions : INVERSEOPENBRACKET mvNode CLOSEBRACKET ;
    public final void vectorFunctions() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:176:2: ( INVERSEOPENBRACKET mvNode CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:176:4: INVERSEOPENBRACKET mvNode CLOSEBRACKET
            {
            match(input,INVERSEOPENBRACKET,FOLLOW_INVERSEOPENBRACKET_in_vectorFunctions1124); if (state.failed) return ;

            pushFollow(FOLLOW_mvNode_in_vectorFunctions1126);
            mvNode();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_vectorFunctions1128); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vectorFunctions"



    // $ANTLR start "uvDistribution"
    // /u/s/h/shrirams/BUGS/BUGS.g:179:1: uvDistribution : ( discreteUnivariate | continuousUnivariate );
    public final void uvDistribution() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:180:2: ( discreteUnivariate | continuousUnivariate )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BERNOULLIOPENBRACKET) ) {
                alt25=1;
            }
            else if ( (LA25_0==BETAOPENBRACKET) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:180:4: discreteUnivariate
                    {
                    pushFollow(FOLLOW_discreteUnivariate_in_uvDistribution1141);
                    discreteUnivariate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:181:4: continuousUnivariate
                    {
                    pushFollow(FOLLOW_continuousUnivariate_in_uvDistribution1147);
                    continuousUnivariate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "uvDistribution"



    // $ANTLR start "mvDistribution"
    // /u/s/h/shrirams/BUGS/BUGS.g:184:1: mvDistribution : ( discreteMultivariate | continuousMultivariate );
    public final void mvDistribution() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:185:2: ( discreteMultivariate | continuousMultivariate )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==MUTLTINOMIALOPENBRACKET) ) {
                alt26=1;
            }
            else if ( (LA26_0==DIRICHLETOPENBRACKET) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:185:4: discreteMultivariate
                    {
                    pushFollow(FOLLOW_discreteMultivariate_in_mvDistribution1159);
                    discreteMultivariate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:186:4: continuousMultivariate
                    {
                    pushFollow(FOLLOW_continuousMultivariate_in_mvDistribution1165);
                    continuousMultivariate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mvDistribution"



    // $ANTLR start "discreteUnivariate"
    // /u/s/h/shrirams/BUGS/BUGS.g:189:1: discreteUnivariate : bernoulli ;
    public final void discreteUnivariate() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:190:2: ( bernoulli )
            // /u/s/h/shrirams/BUGS/BUGS.g:190:4: bernoulli
            {
            pushFollow(FOLLOW_bernoulli_in_discreteUnivariate1177);
            bernoulli();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "discreteUnivariate"



    // $ANTLR start "continuousUnivariate"
    // /u/s/h/shrirams/BUGS/BUGS.g:193:1: continuousUnivariate : beta ;
    public final void continuousUnivariate() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:194:2: ( beta )
            // /u/s/h/shrirams/BUGS/BUGS.g:194:4: beta
            {
            pushFollow(FOLLOW_beta_in_continuousUnivariate1190);
            beta();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "continuousUnivariate"



    // $ANTLR start "discreteMultivariate"
    // /u/s/h/shrirams/BUGS/BUGS.g:197:1: discreteMultivariate : multinomial ;
    public final void discreteMultivariate() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:198:2: ( multinomial )
            // /u/s/h/shrirams/BUGS/BUGS.g:198:4: multinomial
            {
            pushFollow(FOLLOW_multinomial_in_discreteMultivariate1203);
            multinomial();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "discreteMultivariate"



    // $ANTLR start "continuousMultivariate"
    // /u/s/h/shrirams/BUGS/BUGS.g:201:1: continuousMultivariate : dirichlet ;
    public final void continuousMultivariate() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:202:2: ( dirichlet )
            // /u/s/h/shrirams/BUGS/BUGS.g:202:4: dirichlet
            {
            pushFollow(FOLLOW_dirichlet_in_continuousMultivariate1215);
            dirichlet();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "continuousMultivariate"



    // $ANTLR start "distributionParameter"
    // /u/s/h/shrirams/BUGS/BUGS.g:205:1: distributionParameter : ( uvNode | CONSTANTINT | CONSTANTVALUE );
    public final void distributionParameter() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:206:2: ( uvNode | CONSTANTINT | CONSTANTVALUE )
            int alt27=3;
            switch ( input.LA(1) ) {
            case NODENAME:
                {
                alt27=1;
                }
                break;
            case CONSTANTINT:
                {
                alt27=2;
                }
                break;
            case CONSTANTVALUE:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:206:4: uvNode
                    {
                    pushFollow(FOLLOW_uvNode_in_distributionParameter1228);
                    uvNode();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:206:13: CONSTANTINT
                    {
                    match(input,CONSTANTINT,FOLLOW_CONSTANTINT_in_distributionParameter1232); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /u/s/h/shrirams/BUGS/BUGS.g:206:27: CONSTANTVALUE
                    {
                    match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_distributionParameter1236); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "distributionParameter"



    // $ANTLR start "bernoulli"
    // /u/s/h/shrirams/BUGS/BUGS.g:209:1: bernoulli : BERNOULLIOPENBRACKET distributionParameter CLOSEBRACKET ;
    public final void bernoulli() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:210:2: ( BERNOULLIOPENBRACKET distributionParameter CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:210:4: BERNOULLIOPENBRACKET distributionParameter CLOSEBRACKET
            {
            match(input,BERNOULLIOPENBRACKET,FOLLOW_BERNOULLIOPENBRACKET_in_bernoulli1249); if (state.failed) return ;

            pushFollow(FOLLOW_distributionParameter_in_bernoulli1251);
            distributionParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_bernoulli1253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bernoulli"



    // $ANTLR start "beta"
    // /u/s/h/shrirams/BUGS/BUGS.g:213:1: beta : BETAOPENBRACKET distributionParameter COMMA distributionParameter CLOSEBRACKET ;
    public final void beta() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:214:2: ( BETAOPENBRACKET distributionParameter COMMA distributionParameter CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:214:4: BETAOPENBRACKET distributionParameter COMMA distributionParameter CLOSEBRACKET
            {
            match(input,BETAOPENBRACKET,FOLLOW_BETAOPENBRACKET_in_beta1265); if (state.failed) return ;

            pushFollow(FOLLOW_distributionParameter_in_beta1267);
            distributionParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,COMMA,FOLLOW_COMMA_in_beta1269); if (state.failed) return ;

            pushFollow(FOLLOW_distributionParameter_in_beta1271);
            distributionParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_beta1273); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "beta"



    // $ANTLR start "multinomial"
    // /u/s/h/shrirams/BUGS/BUGS.g:217:1: multinomial : MUTLTINOMIALOPENBRACKET distributionParameter OPENSQUAREBRACKET CLOSESQUAREBRACKET COMMA distributionParameter CLOSEBRACKET ;
    public final void multinomial() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:218:2: ( MUTLTINOMIALOPENBRACKET distributionParameter OPENSQUAREBRACKET CLOSESQUAREBRACKET COMMA distributionParameter CLOSEBRACKET )
            // /u/s/h/shrirams/BUGS/BUGS.g:218:4: MUTLTINOMIALOPENBRACKET distributionParameter OPENSQUAREBRACKET CLOSESQUAREBRACKET COMMA distributionParameter CLOSEBRACKET
            {
            match(input,MUTLTINOMIALOPENBRACKET,FOLLOW_MUTLTINOMIALOPENBRACKET_in_multinomial1285); if (state.failed) return ;

            pushFollow(FOLLOW_distributionParameter_in_multinomial1287);
            distributionParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,OPENSQUAREBRACKET,FOLLOW_OPENSQUAREBRACKET_in_multinomial1289); if (state.failed) return ;

            match(input,CLOSESQUAREBRACKET,FOLLOW_CLOSESQUAREBRACKET_in_multinomial1291); if (state.failed) return ;

            match(input,COMMA,FOLLOW_COMMA_in_multinomial1293); if (state.failed) return ;

            pushFollow(FOLLOW_distributionParameter_in_multinomial1297);
            distributionParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_multinomial1299); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multinomial"



    // $ANTLR start "dirichlet"
    // /u/s/h/shrirams/BUGS/BUGS.g:222:1: dirichlet : DIRICHLETOPENBRACKET distributionParameter OPENSQUAREBRACKET CLOSESQUAREBRACKET COMMA ;
    public final void dirichlet() throws RecognitionException {
        try {
            // /u/s/h/shrirams/BUGS/BUGS.g:223:2: ( DIRICHLETOPENBRACKET distributionParameter OPENSQUAREBRACKET CLOSESQUAREBRACKET COMMA )
            // /u/s/h/shrirams/BUGS/BUGS.g:223:4: DIRICHLETOPENBRACKET distributionParameter OPENSQUAREBRACKET CLOSESQUAREBRACKET COMMA
            {
            match(input,DIRICHLETOPENBRACKET,FOLLOW_DIRICHLETOPENBRACKET_in_dirichlet1311); if (state.failed) return ;

            pushFollow(FOLLOW_distributionParameter_in_dirichlet1313);
            distributionParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,OPENSQUAREBRACKET,FOLLOW_OPENSQUAREBRACKET_in_dirichlet1315); if (state.failed) return ;

            match(input,CLOSESQUAREBRACKET,FOLLOW_CLOSESQUAREBRACKET_in_dirichlet1317); if (state.failed) return ;

            match(input,COMMA,FOLLOW_COMMA_in_dirichlet1319); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirichlet"

    // $ANTLR start synpred1_BUGS
    public final void synpred1_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:56:16: ( uvNode TILDE )
        // /u/s/h/shrirams/BUGS/BUGS.g:56:17: uvNode TILDE
        {
        pushFollow(FOLLOW_uvNode_in_synpred1_BUGS289);
        uvNode();

        state._fsp--;
        if (state.failed) return ;

        match(input,TILDE,FOLLOW_TILDE_in_synpred1_BUGS291); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_BUGS

    // $ANTLR start synpred2_BUGS
    public final void synpred2_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:57:4: ( mvNode TILDE )
        // /u/s/h/shrirams/BUGS/BUGS.g:57:5: mvNode TILDE
        {
        pushFollow(FOLLOW_mvNode_in_synpred2_BUGS303);
        mvNode();

        state._fsp--;
        if (state.failed) return ;

        match(input,TILDE,FOLLOW_TILDE_in_synpred2_BUGS305); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_BUGS

    // $ANTLR start synpred3_BUGS
    public final void synpred3_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:58:4: ( uvNode LEFTPOINTER )
        // /u/s/h/shrirams/BUGS/BUGS.g:58:5: uvNode LEFTPOINTER
        {
        pushFollow(FOLLOW_uvNode_in_synpred3_BUGS316);
        uvNode();

        state._fsp--;
        if (state.failed) return ;

        match(input,LEFTPOINTER,FOLLOW_LEFTPOINTER_in_synpred3_BUGS318); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_BUGS

    // $ANTLR start synpred4_BUGS
    public final void synpred4_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:59:4: ( mvNode LEFTPOINTER )
        // /u/s/h/shrirams/BUGS/BUGS.g:59:5: mvNode LEFTPOINTER
        {
        pushFollow(FOLLOW_mvNode_in_synpred4_BUGS330);
        mvNode();

        state._fsp--;
        if (state.failed) return ;

        match(input,LEFTPOINTER,FOLLOW_LEFTPOINTER_in_synpred4_BUGS332); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_BUGS

    // $ANTLR start synpred5_BUGS
    public final void synpred5_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:60:4: ( linkFunction LEFTPOINTER )
        // /u/s/h/shrirams/BUGS/BUGS.g:60:5: linkFunction LEFTPOINTER
        {
        pushFollow(FOLLOW_linkFunction_in_synpred5_BUGS344);
        linkFunction();

        state._fsp--;
        if (state.failed) return ;

        match(input,LEFTPOINTER,FOLLOW_LEFTPOINTER_in_synpred5_BUGS346); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_BUGS

    // $ANTLR start synpred6_BUGS
    public final void synpred6_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:66:4: ( uvNode )
        // /u/s/h/shrirams/BUGS/BUGS.g:66:5: uvNode
        {
        pushFollow(FOLLOW_uvNode_in_synpred6_BUGS381);
        uvNode();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_BUGS

    // $ANTLR start synpred7_BUGS
    public final void synpred7_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:78:43: ( uvNode | CONSTANTVALUE )
        int alt28=2;
        int LA28_0 = input.LA(1);

        if ( (LA28_0==NODENAME) ) {
            alt28=1;
        }
        else if ( (LA28_0==CONSTANTVALUE) ) {
            alt28=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 28, 0, input);

            throw nvae;

        }
        switch (alt28) {
            case 1 :
                // /u/s/h/shrirams/BUGS/BUGS.g:78:44: uvNode
                {
                pushFollow(FOLLOW_uvNode_in_synpred7_BUGS451);
                uvNode();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /u/s/h/shrirams/BUGS/BUGS.g:78:51: CONSTANTVALUE
                {
                match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_synpred7_BUGS453); if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred7_BUGS

    // $ANTLR start synpred8_BUGS
    public final void synpred8_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:81:23: ( uvNode | CONSTANTVALUE )
        int alt29=2;
        int LA29_0 = input.LA(1);

        if ( (LA29_0==NODENAME) ) {
            alt29=1;
        }
        else if ( (LA29_0==CONSTANTVALUE) ) {
            alt29=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 29, 0, input);

            throw nvae;

        }
        switch (alt29) {
            case 1 :
                // /u/s/h/shrirams/BUGS/BUGS.g:81:24: uvNode
                {
                pushFollow(FOLLOW_uvNode_in_synpred8_BUGS485);
                uvNode();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /u/s/h/shrirams/BUGS/BUGS.g:81:31: CONSTANTVALUE
                {
                match(input,CONSTANTVALUE,FOLLOW_CONSTANTVALUE_in_synpred8_BUGS487); if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred8_BUGS

    // $ANTLR start synpred9_BUGS
    public final void synpred9_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:93:4: ( uvNode | linkFunction )
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==NODENAME) ) {
            alt30=1;
        }
        else if ( (LA30_0==CLOGLOGOPENBRACKET||(LA30_0 >= LOGITOPENBRACKET && LA30_0 <= LOGOPENBRACKET)||LA30_0==PROBITOPENBRACKET) ) {
            alt30=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 30, 0, input);

            throw nvae;

        }
        switch (alt30) {
            case 1 :
                // /u/s/h/shrirams/BUGS/BUGS.g:93:5: uvNode
                {
                pushFollow(FOLLOW_uvNode_in_synpred9_BUGS568);
                uvNode();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /u/s/h/shrirams/BUGS/BUGS.g:93:14: linkFunction
                {
                pushFollow(FOLLOW_linkFunction_in_synpred9_BUGS572);
                linkFunction();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred9_BUGS

    // $ANTLR start synpred10_BUGS
    public final void synpred10_BUGS_fragment() throws RecognitionException {
        // /u/s/h/shrirams/BUGS/BUGS.g:131:4: ( OPENBRACKET expression COLON )
        // /u/s/h/shrirams/BUGS/BUGS.g:131:5: OPENBRACKET expression COLON
        {
        match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_synpred10_BUGS834); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred10_BUGS836);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred10_BUGS838); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_BUGS

    // Delegated rules

    public final boolean synpred5_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_BUGS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_BUGS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_MODEL_in_prog269 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OPENBRACE_in_prog271 = new BitSet(new long[]{0x0000000421880200L});
    public static final BitSet FOLLOW_statements_in_prog273 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CLOSEBRACE_in_prog275 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_stochasticNodeExpr_in_statements296 = new BitSet(new long[]{0x0000000421880202L});
    public static final BitSet FOLLOW_stochasticNodeExpr_in_statements310 = new BitSet(new long[]{0x0000000421880202L});
    public static final BitSet FOLLOW_logicalNodeExpr_in_statements323 = new BitSet(new long[]{0x0000000421880202L});
    public static final BitSet FOLLOW_logicalNodeExpr_in_statements337 = new BitSet(new long[]{0x0000000421880202L});
    public static final BitSet FOLLOW_logicalNodeExpr_in_statements351 = new BitSet(new long[]{0x0000000421880202L});
    public static final BitSet FOLLOW_startFor_in_statements358 = new BitSet(new long[]{0x0000000421880200L});
    public static final BitSet FOLLOW_statements_in_statements360 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_endFor_in_statements362 = new BitSet(new long[]{0x0000000421880202L});
    public static final BitSet FOLLOW_uvStochasticNodeExpr_in_stochasticNodeExpr386 = new BitSet(new long[]{0x0000001000000182L});
    public static final BitSet FOLLOW_censor_in_stochasticNodeExpr389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncation_in_stochasticNodeExpr393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mvStochasticNodeExpr_in_stochasticNodeExpr400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_uvStochasticNodeExpr411 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_TILDE_in_uvStochasticNodeExpr413 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_uvDistribution_in_uvStochasticNodeExpr415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mvNode_in_mvStochasticNodeExpr425 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_TILDE_in_mvStochasticNodeExpr427 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_mvDistribution_in_mvStochasticNodeExpr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_censor442 = new BitSet(new long[]{0x0000000020014000L});
    public static final BitSet FOLLOW_lowerWithOptionalUpper_in_censor457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_upperWithOptionalLower_in_censor462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_censor467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATIONBEGIN_in_truncation479 = new BitSet(new long[]{0x0000000020014000L});
    public static final BitSet FOLLOW_lowerWithOptionalUpper_in_truncation492 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_upperWithOptionalLower_in_truncation496 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_truncation501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_lowerWithOptionalUpper516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_lowerWithOptionalUpper518 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_lowerWithOptionalUpper521 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_uvNode_in_lowerWithOptionalUpper524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_lowerWithOptionalUpper526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_upperWithOptionalLower543 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_upperWithOptionalLower545 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_upperWithOptionalLower549 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_uvNode_in_upperWithOptionalLower552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_upperWithOptionalLower554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_logicalNodeExpr578 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_linkFunction_in_logicalNodeExpr582 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LEFTPOINTER_in_logicalNodeExpr585 = new BitSet(new long[]{0x00000000A2218010L});
    public static final BitSet FOLLOW_exprWithNodesFunctions_in_logicalNodeExpr587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mvNode_in_logicalNodeExpr593 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LEFTPOINTER_in_logicalNodeExpr595 = new BitSet(new long[]{0x00000000A2218010L});
    public static final BitSet FOLLOW_exprWithNodesFunctions_in_logicalNodeExpr597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGOPENBRACKET_in_linkFunction609 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_uvNode_in_linkFunction611 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_linkFunction613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGITOPENBRACKET_in_linkFunction619 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_uvNode_in_linkFunction621 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_linkFunction623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOGLOGOPENBRACKET_in_linkFunction628 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_uvNode_in_linkFunction630 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_linkFunction632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROBITOPENBRACKET_in_linkFunction637 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_uvNode_in_linkFunction639 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_linkFunction641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_exprWithNodesFunctions654 = new BitSet(new long[]{0x000000020A040002L});
    public static final BitSet FOLLOW_OPENBRACKET_in_exprWithNodesFunctions658 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_MINUS_in_exprWithNodesFunctions660 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_unaryExpression_in_exprWithNodesFunctions662 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_exprWithNodesFunctions665 = new BitSet(new long[]{0x000000020A040002L});
    public static final BitSet FOLLOW_MINUS_in_exprWithNodesFunctions669 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_unaryExpression_in_exprWithNodesFunctions671 = new BitSet(new long[]{0x000000020A040002L});
    public static final BitSet FOLLOW_scalarFunctions_in_exprWithNodesFunctions675 = new BitSet(new long[]{0x000000020A040002L});
    public static final BitSet FOLLOW_vectorFunctions_in_exprWithNodesFunctions679 = new BitSet(new long[]{0x000000020A040002L});
    public static final BitSet FOLLOW_set_in_exprWithNodesFunctions684 = new BitSet(new long[]{0x00000000A2218010L});
    public static final BitSet FOLLOW_exprWithNodesFunctions_in_exprWithNodesFunctions694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODENAME_in_uvNode707 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_OPENSQUAREBRACKET_in_uvNode710 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_uvNode712 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_COMMA_in_uvNode715 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_uvNode717 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_CLOSESQUAREBRACKET_in_uvNode722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODENAME_in_mvNode736 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_OPENSQUAREBRACKET_in_mvNode738 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_multiIndices_in_mvNode740 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSESQUAREBRACKET_in_mvNode742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_expression754 = new BitSet(new long[]{0x000000020A040002L});
    public static final BitSet FOLLOW_set_in_expression757 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTINT_in_unaryExpression780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_unaryExpression787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_unaryExpression792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENBRACKET_in_unaryExpression798 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_unaryExpression800 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_unaryExpression802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiDimExpression_in_multiIndices814 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_multiIndices817 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_multiDimExpression_in_multiIndices819 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_OPENBRACKET_in_multiDimExpression843 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_multiDimExpression845 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_multiDimExpression847 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_multiDimExpression849 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_multiDimExpression851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_multiDimExpression856 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COLON_in_multiDimExpression859 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_multiDimExpression861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORSTART_in_startFor875 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OPENBRACKET_in_startFor877 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_loopVariable_in_startFor879 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IN_in_startFor881 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_loopBegin_in_startFor883 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_startFor885 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_loopEnd_in_startFor887 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_startFor889 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OPENBRACE_in_startFor891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSEBRACE_in_endFor904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODENAME_in_loopVariable916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_loopBegin928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTINT_in_loopBegin934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_loopEnd946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTINT_in_loopEnd952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSOPENBRACKET_in_scalarFunctions1108 = new BitSet(new long[]{0x00000000A2218010L});
    public static final BitSet FOLLOW_exprWithNodesFunctions_in_scalarFunctions1110 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_scalarFunctions1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSEOPENBRACKET_in_vectorFunctions1124 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_mvNode_in_vectorFunctions1126 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_vectorFunctions1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_discreteUnivariate_in_uvDistribution1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continuousUnivariate_in_uvDistribution1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_discreteMultivariate_in_mvDistribution1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continuousMultivariate_in_mvDistribution1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bernoulli_in_discreteUnivariate1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beta_in_continuousUnivariate1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multinomial_in_discreteMultivariate1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirichlet_in_continuousMultivariate1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_distributionParameter1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTINT_in_distributionParameter1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_distributionParameter1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BERNOULLIOPENBRACKET_in_bernoulli1249 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_distributionParameter_in_bernoulli1251 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_bernoulli1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BETAOPENBRACKET_in_beta1265 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_distributionParameter_in_beta1267 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_beta1269 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_distributionParameter_in_beta1271 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_beta1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTLTINOMIALOPENBRACKET_in_multinomial1285 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_distributionParameter_in_multinomial1287 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_OPENSQUAREBRACKET_in_multinomial1289 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSESQUAREBRACKET_in_multinomial1291 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_multinomial1293 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_distributionParameter_in_multinomial1297 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_multinomial1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIRICHLETOPENBRACKET_in_dirichlet1311 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_distributionParameter_in_dirichlet1313 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_OPENSQUAREBRACKET_in_dirichlet1315 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSESQUAREBRACKET_in_dirichlet1317 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_dirichlet1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_synpred1_BUGS289 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_TILDE_in_synpred1_BUGS291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mvNode_in_synpred2_BUGS303 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_TILDE_in_synpred2_BUGS305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_synpred3_BUGS316 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LEFTPOINTER_in_synpred3_BUGS318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mvNode_in_synpred4_BUGS330 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LEFTPOINTER_in_synpred4_BUGS332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linkFunction_in_synpred5_BUGS344 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LEFTPOINTER_in_synpred5_BUGS346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_synpred6_BUGS381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_synpred7_BUGS451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_synpred7_BUGS453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_synpred8_BUGS485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTVALUE_in_synpred8_BUGS487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uvNode_in_synpred9_BUGS568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linkFunction_in_synpred9_BUGS572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENBRACKET_in_synpred10_BUGS834 = new BitSet(new long[]{0x00000000A0018000L});
    public static final BitSet FOLLOW_expression_in_synpred10_BUGS836 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_synpred10_BUGS838 = new BitSet(new long[]{0x0000000000000002L});

}