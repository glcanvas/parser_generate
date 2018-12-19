package generatedCode

import java.lang.Exception
import kotlin.math.pow

class gr5_GenParser(val inputString: List<Pair<String, String>>) {
     //val startTerm: Term
     val point = 0
     val start : e_NonTerm

     init {

            start = e_NonTerm(inputString)
            start.parseState()
        }
    class e_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float;
     var point = gr5_GenParser.point
    init {
        res=0.0f;
        this.FIRST = listOf("NUMBER","MINUS","OPEN")
        this.FOLLOW = listOf("CLOSE","EOF")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"NUMBER" -> {
    var t = t_NonTerm(inputString)
var x = x_NonTerm(inputString)
t.point = gr5_GenParser.point
t.parseState()
point = gr5_GenParser.point

x.point = gr5_GenParser.point
x.parseState()
point = gr5_GenParser.point
res = t.res + x.res + x.next;
}
"MINUS" -> {
    var t = t_NonTerm(inputString)
var x = x_NonTerm(inputString)
t.point = gr5_GenParser.point
t.parseState()
point = gr5_GenParser.point

x.point = gr5_GenParser.point
x.parseState()
point = gr5_GenParser.point
res = t.res + x.res + x.next;
}
"OPEN" -> {
    var t = t_NonTerm(inputString)
var x = x_NonTerm(inputString)
t.point = gr5_GenParser.point
t.parseState()
point = gr5_GenParser.point

x.point = gr5_GenParser.point
x.parseState()
point = gr5_GenParser.point
res = t.res + x.res + x.next;
}
else->throw ParserException("term=${inputString[point].first} can't be in term=e_NonTerm")}
    }
}
class x_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float; var next: Float;
     var point = gr5_GenParser.point
    init {
        res=0.0f; next=0.0f;
        this.FIRST = listOf("EPS","PLUS","MINUS")
        this.FOLLOW = listOf("CLOSE","EOF")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"PLUS"->{
    var PLUS : Pair<String, String>
var t = t_NonTerm(inputString)
var x = x_NonTerm(inputString)
if(inputString[point].first != "PLUS"){
    throw Exception()
}
PLUS = Pair("PLUS",inputString[point].second)
point += 1
gr5_GenParser.point = point

t.point = gr5_GenParser.point
t.parseState()
point = gr5_GenParser.point

x.point = gr5_GenParser.point
x.parseState()
point = gr5_GenParser.point
res = t.res; next = x.res + x.next;
}
"MINUS"->{
    var MINUS : Pair<String, String>
var t = t_NonTerm(inputString)
var x = x_NonTerm(inputString)
if(inputString[point].first != "MINUS"){
    throw Exception()
}
MINUS = Pair("MINUS",inputString[point].second)
point += 1
gr5_GenParser.point = point

t.point = gr5_GenParser.point
t.parseState()
point = gr5_GenParser.point

x.point = gr5_GenParser.point
x.parseState()
point = gr5_GenParser.point
res = - t.res; next = x.res + x.next;
}
"CLOSE"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"EOF"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
else->throw ParserException("term=${inputString[point].first} can't be in term=x_NonTerm")}
    }
}
class t_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float
     var point = gr5_GenParser.point
    init {
        res=1.0f;
        this.FIRST = listOf("NUMBER","MINUS","OPEN")
        this.FOLLOW = listOf("CLOSE","EOF","PLUS","MINUS")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"NUMBER" -> {
    var p = p_NonTerm(inputString)
var y = y_NonTerm(inputString)
p.point = gr5_GenParser.point
p.parseState()
point = gr5_GenParser.point

y.point = gr5_GenParser.point
y.parseState()
point = gr5_GenParser.point
res = p.res * y.res * y.next;
}
"MINUS" -> {
    var p = p_NonTerm(inputString)
var y = y_NonTerm(inputString)
p.point = gr5_GenParser.point
p.parseState()
point = gr5_GenParser.point

y.point = gr5_GenParser.point
y.parseState()
point = gr5_GenParser.point
res = p.res * y.res * y.next;
}
"OPEN" -> {
    var p = p_NonTerm(inputString)
var y = y_NonTerm(inputString)
p.point = gr5_GenParser.point
p.parseState()
point = gr5_GenParser.point

y.point = gr5_GenParser.point
y.parseState()
point = gr5_GenParser.point
res = p.res * y.res * y.next;
}
else->throw ParserException("term=${inputString[point].first} can't be in term=t_NonTerm")}
    }
}
class y_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float; var next: Float;
     var point = gr5_GenParser.point
    init {
        res=1.0f; next=1.0f;
        this.FIRST = listOf("EPS","MULL")
        this.FOLLOW = listOf("CLOSE","EOF","PLUS","MINUS")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"MULL"->{
    var MULL : Pair<String, String>
var p = p_NonTerm(inputString)
var y = y_NonTerm(inputString)
if(inputString[point].first != "MULL"){
    throw Exception()
}
MULL = Pair("MULL",inputString[point].second)
point += 1
gr5_GenParser.point = point

p.point = gr5_GenParser.point
p.parseState()
point = gr5_GenParser.point

y.point = gr5_GenParser.point
y.parseState()
point = gr5_GenParser.point
res = p.res; next = y.res * y.next;
}
"CLOSE"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"EOF"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"PLUS"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"MINUS"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
else->throw ParserException("term=${inputString[point].first} can't be in term=y_NonTerm")}
    }
}
class p_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float
     var point = gr5_GenParser.point
    init {
        res=1.0f;
        this.FIRST = listOf("NUMBER","MINUS","OPEN")
        this.FOLLOW = listOf("CLOSE","MULL","EOF","PLUS","MINUS")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"NUMBER" -> {
    var f = f_NonTerm(inputString)
var pow = pow_NonTerm(inputString)
f.point = gr5_GenParser.point
f.parseState()
point = gr5_GenParser.point

pow.point = gr5_GenParser.point
pow.parseState()
point = gr5_GenParser.point
res = f.res.pow(pow.res.pow(pow.next));
}
"MINUS" -> {
    var f = f_NonTerm(inputString)
var pow = pow_NonTerm(inputString)
f.point = gr5_GenParser.point
f.parseState()
point = gr5_GenParser.point

pow.point = gr5_GenParser.point
pow.parseState()
point = gr5_GenParser.point
res = f.res.pow(pow.res.pow(pow.next));
}
"OPEN" -> {
    var f = f_NonTerm(inputString)
var pow = pow_NonTerm(inputString)
f.point = gr5_GenParser.point
f.parseState()
point = gr5_GenParser.point

pow.point = gr5_GenParser.point
pow.parseState()
point = gr5_GenParser.point
res = f.res.pow(pow.res.pow(pow.next));
}
else->throw ParserException("term=${inputString[point].first} can't be in term=p_NonTerm")}
    }
}
class pow_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float; var next: Float;
     var point = gr5_GenParser.point
    init {
        res=1.0f;next=1.0f;
        this.FIRST = listOf("POW","EPS")
        this.FOLLOW = listOf("CLOSE","MULL","EOF","PLUS","MINUS")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"POW"->{
    var POW : Pair<String, String>
var f = f_NonTerm(inputString)
var pow = pow_NonTerm(inputString)
if(inputString[point].first != "POW"){
    throw Exception()
}
POW = Pair("POW",inputString[point].second)
point += 1
gr5_GenParser.point = point

f.point = gr5_GenParser.point
f.parseState()
point = gr5_GenParser.point

pow.point = gr5_GenParser.point
pow.parseState()
point = gr5_GenParser.point
res = f.res; next = pow.res.pow( pow.next);
}
"CLOSE"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"MULL"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"EOF"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"PLUS"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
"MINUS"->{
    var EPS : Pair<String, String>
EPS = Pair("EPS",inputString[point].second)

gr5_GenParser.point = point

}
else->throw ParserException("term=${inputString[point].first} can't be in term=pow_NonTerm")}
    }
}
class f_NonTerm(inputString: List<Pair<String, String>>): Term(inputString) {
    var res:Float
     var point = gr5_GenParser.point
    init {
        res=1.0f;
        this.FIRST = listOf("NUMBER","MINUS","OPEN")
        this.FOLLOW = listOf("POW","CLOSE","MULL","EOF","PLUS","MINUS")
    }
    override fun parseState() {
        if(point == inputString.size){
return
}
when(inputString[point].first){"MINUS"->{
    var MINUS : Pair<String, String>
var f = f_NonTerm(inputString)
if(inputString[point].first != "MINUS"){
    throw Exception()
}
MINUS = Pair("MINUS",inputString[point].second)
point += 1
gr5_GenParser.point = point

f.point = gr5_GenParser.point
f.parseState()
point = gr5_GenParser.point
res = - f.res; 
}
"NUMBER"->{
    var NUMBER : Pair<String, String>
if(inputString[point].first != "NUMBER"){
    throw Exception()
}
NUMBER = Pair("NUMBER",inputString[point].second)
point += 1
gr5_GenParser.point = point
res = NUMBER.second.toFloat();
}
"OPEN"->{
    var OPEN : Pair<String, String>
var e = e_NonTerm(inputString)
var CLOSE : Pair<String, String>
if(inputString[point].first != "OPEN"){
    throw Exception()
}
OPEN = Pair("OPEN",inputString[point].second)
point += 1
gr5_GenParser.point = point

e.point = gr5_GenParser.point
e.parseState()
point = gr5_GenParser.point

if(inputString[point].first != "CLOSE"){
    throw Exception()
}
CLOSE = Pair("CLOSE",inputString[point].second)
point += 1
gr5_GenParser.point = point
res = e.res;
}
else->throw ParserException("term=${inputString[point].first} can't be in term=f_NonTerm")}
    }
}

    companion object {
            var point = 0
            var end = false
    }
}


open class Term(val inputString: List<Pair<String, String>>) {
    open fun parseState(): Unit {}
    open var FIRST = listOf<String>()
    open var FOLLOW = listOf<String>()
    open var context = ArrayList<Any>()
}