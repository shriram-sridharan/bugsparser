import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        BUGSLexer lex = new BUGSLexer(new ANTLRFileStream("/home/shriram/RA/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        BUGSParser g = new BUGSParser(tokens, 49100, null);
        try {
            g.();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}