package AntlrParser;

import generatedCode.*;
import kotlin.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //1-2-3
        gr5_GenLexer lex = new gr5_GenLexer("1-2-3");
        List<Pair<String, String>> tkns = lex.generateTokens();
        gr5_GenParser gp = new gr5_GenParser(tkns);
        System.out.println(gp.getStart().getRes());
    }
}