package AntlrParser;

import generateCode.CustomLexer;
import generateCode.CustomParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainGenerate {
    public static void main(String args[]) {
        String way = args[0];
        String prefix = args[1];
        File f = new File(way);
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(f))) {
            String s;
            while ((s = bf.readLine()) != null) {
                sb.append(s).append("\n");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
            return;
        }

        parseInputLexer lexer = new parseInputLexer(new ANTLRInputStream(sb.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parseInputParser parser = new parseInputParser(tokens);

        parseInputParser.Combine_allContext a = parser.combine_all();

        CustomLexer l = new CustomLexer(prefix, a);
        CustomParser p = new CustomParser(prefix, a);

        l.generateCodeForLexer();
        p.generateParser();
        p.printAll();
    }
}
