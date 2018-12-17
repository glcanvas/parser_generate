package generateCode

data class Node(
    val name: String,
    val defineInnerVariables: String,
    val initCode: String,
    val states: List<List<Pair<String, String>>>
)