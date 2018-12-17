package generateCode

import java.lang.Exception

class ParserException(val error: String) : Exception() {
    override fun toString(): String {
        return error
    }
}