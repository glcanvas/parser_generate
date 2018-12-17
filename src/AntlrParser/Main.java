package AntlrParser;

import generatedCode.*;
import kotlin.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //String arg[] = new String[]{"/home/nikita/mt_lab_4/tests/gr4", "gr3_"};
        //MainGenerate.main(arg);
        gr3_GenLexer lex = new gr3_GenLexer("1 + 2 * 3");
        List<Pair<String, String>> tkns = lex.generateTokens();
        gr3_GenParser gp = new gr3_GenParser(tkns);
        System.out.println(gp.getStart().getRes());

    }
}