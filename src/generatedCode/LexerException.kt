package generatedCode

import java.lang.Exception

class LexerException(val error: String) : Exception() {
    override fun toString(): String {
        return error
    }
}