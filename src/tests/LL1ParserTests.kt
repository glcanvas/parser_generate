package tests

import generatedCode.gr3_GenLexer
import generatedCode.gr3_GenParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LL1ParserTests {
    @Test
    fun test1() {
        val lex = gr3_GenLexer("1 - (2 - (3 + 3))")
        val tkns = lex.generateTokens()
        val gp = gr3_GenParser(tkns)
        gr3_GenParser.point = 0
        assertEquals(gp.start.res, 5)
    }

    @Test
    fun test2() {
        val lex = gr3_GenLexer("1 + 2 * 3")
        val tkns = lex.generateTokens()
        val gp = gr3_GenParser(tkns)
        gr3_GenParser.point = 0
        assertEquals(gp.start.res, 7)
    }

    @Test
    fun test3() {
        val lex = gr3_GenLexer("1 * 2 + 3")
        val tkns = lex.generateTokens()
        val gp = gr3_GenParser(tkns)
        gr3_GenParser.point = 0
        assertEquals(gp.start.res, 5)
    }

    @Test
    fun test4() {
        val lex = gr3_GenLexer("1 - (2 * 3)")
        val tkns = lex.generateTokens()
        val gp = gr3_GenParser(tkns)
        gr3_GenParser.point = 0
        assertEquals(gp.start.res, -5)
    }
}
