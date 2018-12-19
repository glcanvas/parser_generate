package generateCode

import AntlrParser.*
import java.io.File
import java.lang.StringBuilder
import java.util.stream.Collectors
import kotlin.math.pow

class CustomParser(val prefix: String, head: parseInputParser.Combine_allContext) {
    open val nonTerminals = ArrayList<Node>()

    val firstsList = ArrayList<List<String>>() // here terminals
    var followList = ArrayList<HashSet<String>>() // here terminals

    val mapNonTerm = HashMap<String, Int>()
    val firstUsed = ArrayList<Boolean>()

    val startNonTerm: String
    //val parserPac: String

    init {
        startNonTerm = head.begin().NOT_TERMINAL_ID().text
        //parserPac = head.pack().PACAGE_NAME().text

        head.non_terminal_all_rules().non_terminal().forEachIndexed { index, it ->
            it.block_of_non_teerminal_rule
            nonTerminals.add(
                Node(
                    name = it.node.name,
                    defineInnerVariables = it.node.defineInnerVariables,
                    initCode = it.node.initCode,
                    states = it.node.states.stream().map {
                        it.stream().map {
                            Pair<String, String>(
                                it.key,
                                it.value ?: "{}"
                            )
                        }.collect(Collectors.toList())
                    }.collect(Collectors.toList())
                )
            )
            if (it.node.name in mapNonTerm) {
                throw ParserException("non terminal=${it.node.name} yet exist")
            }
            mapNonTerm[it.node.name] = index
        }
        nonTerminals.forEach {
            firstsList.add(ArrayList())
            firstUsed.add(false)
            followList.add(HashSet())
        }

        nonTerminals.forEachIndexed { index, it ->
            if (!firstUsed[index]) {
                buildFirstForNode(it)
            }
        }
        buildFollow()
    }

    private fun buildFirstForNode(node: Node): List<String> {
        val result = HashSet<String>()
        firstUsed[mapNonTerm[node.name] ?: throw ParserException("non terminal=${node.name}")] = true
        node.states.forEach {
            val begin = it[0].first
            when (begin[0].isUpperCase()) {
                true -> {
                    if (begin in result) {
                        throw ParserException("not LL(1) grammar in non terminal=${node.name}, has right branches")
                    }
                    result.add(begin)
                } // terminal
                false -> {
                    val fstIndex = mapNonTerm[begin] ?: throw ParserException("non terminal=$begin")
                    if (!firstUsed[fstIndex]) {
                        buildFirstForNode(nonTerminals[fstIndex]).forEach { it1 ->
                            if (it1 in result) {
                                throw ParserException("not LL(1) grammar in non terminal=${node.name}, has right branches")
                            }
                            result.add(it1)
                        }

                    } else if (firstUsed[fstIndex] and firstsList[fstIndex].isEmpty()) {
                        throw ParserException("grammar has cycle")
                    } else if (firstUsed[fstIndex] and !firstsList[fstIndex].isEmpty()) {
                        firstsList[fstIndex].forEach { it1 ->
                            if (it1 in result) {
                                throw ParserException("not LL(1) grammar in non terminal=${node.name}, has right branches")
                            }
                            result.add(it1)
                        }
                    } else {
                        throw ParserException("not come in $node")
                    }
                } // non terminal
            }
        }
        if (node.name in result) {
            throw ParserException("not LL(1) grammar in non terminal=${node.name}, has left recursion")
        }
        val tmpResult = result.toList()
        firstsList[mapNonTerm[node.name] as Int] = tmpResult
        return tmpResult
    }


    private fun buildFollow() {
        val startId = mapNonTerm[startNonTerm]
        followList[startId ?: -1].add("EOF")
        var changed = true
        while (changed) {
            changed = false
            nonTerminals.forEach {
                //A -> a \in P
                it.states.forEach { list ->
                    // B : a = beta B teta
                    list.forEachIndexed { index, pair ->
                        if (index + 1 < list.size) {
                            if (pair.first[0].isLowerCase() and list[index + 1].first[0].isLowerCase()) {
                                //all is nonTerm

                                val bId = mapNonTerm[pair.first] ?: -1
                                val gammaId = mapNonTerm[list[index + 1].first] ?: -1
                                val gammaFirstWithoutEps = firstsList[gammaId].filter { it -> it != "EPS" }
                                val oldLen = followList[bId].size

                                followList[bId].addAll(gammaFirstWithoutEps)

                                if (firstsList[gammaId].contains("EPS")) {
                                    val aId = mapNonTerm[it.name] ?: -1
                                    followList[bId].addAll(followList[aId])
                                }

                                if (oldLen != followList[bId].size) {
                                    changed = true
                                }

                            } else if (pair.first[0].isLowerCase() and list[index + 1].first[0].isUpperCase()) {

                                val bId = mapNonTerm[pair.first] ?: -1
                                val oldLen = followList[bId].size

                                followList[bId].add(list[index + 1].first)

                                if (oldLen != followList[bId].size) {
                                    changed = true
                                }

                            }
                        }

                        if (index + 1 == list.size) {
                            if (pair.first[0].isLowerCase()) {
                                // non term then add him follow
                                val bId = mapNonTerm[pair.first] ?: -1
                                val aId = mapNonTerm[it.name] ?: -1
                                val oldSize = followList[bId].size
                                followList[bId].addAll(followList[aId])
                                if (oldSize != followList[bId].size) {
                                    changed = true
                                }
                            }
                        }
                        val lastId = mapNonTerm[list.last().first] ?: -1
                        if (list.last().first[0].isLowerCase() && list.size > 1 && "EPS" in firstsList[lastId]) {
                            val B = list[list.size - 2]
                            if (B.first[0].isLowerCase()) {
                                //is non term
                                val bId = mapNonTerm[B.first] ?: -1
                                val curId = mapNonTerm[it.name] ?: -1
                                val oldSize = followList[bId].size
                                followList[bId].addAll(followList[curId])
                                if (oldSize != followList[bId].size) {
                                    changed = true
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    fun printAll() {
        nonTerminals.forEachIndexed { index, it ->
            System.out.println(
                "========================\n" +
                        "name=${it.name}"
            )
            System.out.println(firstsList[index])
            System.out.println(followList[index])
        }
    }

    fun generateParser(): String {
        val f = File("/home/nikita/mt_lab_4/templates/TemplateParser")
        val lines = f.bufferedReader().readLines()

        val tmp = lines.joinToString(separator = "\n")
            .format(
                prefix,
                "$startNonTerm$nonTerm",
                "$startNonTerm$nonTerm",
                nonTerminals.joinToString(separator = "\n") { generateClass(it) })
        File("/home/nikita/mt_lab_4/src/generatedCode/${prefix}GenParser.kt").writeText(tmp)
        return tmp
    }

    fun generateClass(node: Node): String {
        val f = File("/home/nikita/mt_lab_4/templates/TemplateNodeClass")
        val lines = f.bufferedReader().readLines()
        return lines.joinToString(separator = "\n")
            .format(
                "${node.name}$nonTerm",
                node.defineInnerVariables
                    .replace("<", "")
                    .replace(">", ""),
                prefix,
                node.initCode
                    .replace("{", "")
                    .replace("}", ""),
                firstsList[mapNonTerm[node.name] ?: -1].joinToString(separator = ",") { "\"$it\"" },
                followList[mapNonTerm[node.name] ?: -1].joinToString(separator = ",") { "\"$it\"" },
                generateFunction(node)
            )

    }

    fun generateFunction(node: Node): String {
        val sb = StringBuilder()
        sb.apply {
            val nodeId = mapNonTerm[node.name] ?: -1
            if ("EOF" in followList[nodeId]) {
                append("if(point == inputString.size){").append("\n")
                append("return").append("\n")
                append("}").append("\n")
            }

            append("when(inputString[point].first){")
            var index = 0
            for (i in node.states) {
                if (i[0].first[0].isUpperCase() && i[0].first != "EPS") {
                    //terminal not eps
                    append("\"${i[0].first}\"->{").append("\n")
                    append("    ").append(generateForBranch(node, index))
                    append("}").append("\n")
                } else if (i[0].first[0].isUpperCase() && i[0].first == "EPS") {
                    //terminal eps
                    val followId = mapNonTerm[node.name] ?: -1
                    followList[followId].forEach { term ->
                        append("\"$term\"->{").append("\n")
                        append("    ").append(generateForBranch(node, index))
                        append("}").append("\n")
                    }
                } else {
                    //non terminal
                    val nonTermId = mapNonTerm[i[0].first] ?: -1
                    val existEps = firstsList[nonTermId].contains("EPS")
                    if (existEps) {
                        firstsList[nonTermId].filter { it -> it != "EPS" }.forEach { term1 ->
                            append("\"$term1\" -> {").append("\n")
                            append("    ").append(generateForBranch(node, index))
                            append("}").append("\n")
                        }
                        followList[nonTermId].forEach { term1 ->
                            append("\"$term1\" -> {").append("\n")
                            append("    ").append(generateForBranch(node, index))
                            append("}").append("\n")
                        }

                    } else {
                        firstsList[mapNonTerm[i[0].first] ?: -1].forEach { term1 ->
                            append("\"$term1\" -> {").append("\n")
                            append("    ").append(generateForBranch(node, index))
                            append("}").append("\n")
                        }
                    }
                }
                index += 1
            }
            append("else->throw ParserException(\"term=\${inputString[point].first} can't be in term=${node.name}$nonTerm\")")
            append("}")

        }
        return sb.toString()
    }

    fun generateForBranch(node: Node, num: Int): String = StringBuilder().apply {
        node.states[num].forEachIndexed { index, pair ->
            if (pair.first[0].isLowerCase()) {
                append("var ${pair.first} = ${pair.first}$nonTerm(inputString)").append("\n") // non terminal
            } else {
                append("var ${pair.first} : Pair<String, String>").append("\n") //terminal
            }
        }

        node.states[num].forEachIndexed { index, pair ->
            if (pair.first[0].isLowerCase()) {
                // non terminal
                append("${pair.first}.point = ${prefix}GenParser.point").append("\n")
                append("${pair.first}.parseState()").append("\n")
                append("point = ${prefix}GenParser.point").append("\n")
                append(generateInnerCode(node, num, index)).append("\n")
            } else {
                //terminal
                if (pair.first != "EPS") {
                    append("if(inputString[point].first != \"${pair.first}\"){").append("\n")
                    append("    ").append("throw Exception()").append("\n")
                    append("}").append("\n")
                }
                append("${pair.first} = Pair(\"${pair.first}\",inputString[point].second)").append("\n")
                append(if (pair.first == "EPS") "" else "point += 1").append("\n")
                append("${prefix}GenParser.point = point").append("\n")
                append(generateInnerCode(node, num, index)).append("\n")
            }
        }

    }.toString()

    /*
    * num1 -- pos of branch
    * num2 -- pos of code block in branch
    * */
    fun generateInnerCode(node: Node, num1: Int, num2: Int) = StringBuilder().apply {
        var code = node.states[num1][num2].second.replace("{", "").replace("}", "")
        node.states[num1].forEachIndexed { index, item ->
            code = code.replace("\$$index", item.first)
        }
        append(code)
    }.toString()

    val nonTerm = "_NonTerm"
}