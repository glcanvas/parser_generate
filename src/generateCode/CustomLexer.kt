package generateCode


import kotlin.collections.ArrayList
import AntlrParser.*
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.StringBuilder

class CustomLexer(
    val prefix: String,
    val head: parseInputParser.Combine_allContext
) {
    val tokens: ArrayList<Pair<String, String>> = ArrayList()
    val skip: ArrayList<Boolean> = ArrayList()

    init {
        head.terminal_all_rules().terminal_rule().forEach {
            it.TERMINAL_ID
            val currentState: Pair<String, String> = Pair(it.TERMINAL_ID.text, it.terminal_value.text)
            if (it.SAVE() == null) {
                skip.add(false)
            } else {
                skip.add(true)
            }
            tokens.add(currentState)
        }
    }

    fun generateCodeForLexer(): String {
        val tokenString = tokens.joinToString(separator = ",") { "Pair(\"${it.first}\",${it.second})" }
        val skipString = skip.joinToString(separator = ",") {
            when (it) {
                true -> "false"
                false -> "true"
            }
        }
        val f = File("/home/nikita/mt_lab_4/templates/TemplateLexer")
        val lines = f.bufferedReader().readLines()

        val tmp = lines.joinToString(separator = "\n").format(prefix, tokenString, skipString)
        File("/home/nikita/mt_lab_4/src/generatedCode/${prefix}GenLexer.kt").writeText(tmp)
        return tmp
    }

}