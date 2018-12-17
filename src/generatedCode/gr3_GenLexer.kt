package generatedCode

class gr3_GenLexer(val inputString: String) {
    /*
    * first -- terminal name
    * second -- regexp for him
    * */
    private val tokens: List<Pair<String, String>> =
        listOf(Pair("PLUS","[+]"),Pair("MINUS","[-]"),Pair("MULL","[*]"),Pair("OPEN","[(]"),Pair("CLOSE","[)]"),Pair("NUMBER","[0-9]+"),Pair("WS","[ \t\r\n]+"))// here input code
    private val regexped = ArrayList<Regex>()
    private val skip: List<Boolean> = listOf(false,false,false,false,false,false,true)// here input gen code
    private var point = 0
    /*
    * first --  name of terminal
    * second -- value of terminal
    * */
    val generatedTokens: ArrayList<Pair<String, String>> = ArrayList()

    init {
        tokens.forEach {
            regexped.add(Regex(it.second))
        }
    }

    fun generateTokens(): List<Pair<String, String>> {
        while (point != inputString.length) {
            val pair = findFirst(point, inputString)
            val index = pair.first
            val token = pair.second
            if (!skip[index]) {
                generatedTokens.add(Pair(tokens[index].first, token))
            }
            point += token.length
        }
        return generatedTokens
    }

    private fun findFirst(ptr: Int, inp: String): Pair<Int, String> {
        for ((index, value) in regexped.withIndex()) {
            val result = value.find(inp, ptr)
            result ?: continue
            if(result.range.first != ptr) {
                continue
            }
            return Pair(index, result.value)
        }
        throw LexerException("can't match from position=$ptr")
    }
}