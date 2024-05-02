import atomictest.*

fun String.echo(){
    trace(toUpperCase())
    trace(this)
    trace(toLowerCase())
}
fun main(){
    chainedCalls()

}
fun elvisOperator(){
    val s1: String? = "abc"
    (s1 ?: "---") eq "abc"
    val s2: String? = null
    (s2 ?:"---") eq "---"
}
fun checkLengh(s:String?, expected: Int){
    val length1 = if(s!=null) s.length else 0
    val length2 = s?.length ?:0
    length1 eq expected
    length2 eq expected
}

class Person1(
    val name: String,
    var friend: Person1?=null
)
fun chainedCalls(){
    val alice = Person1("Alice")
    println( alice.friend?.name )
    val bob = Person1("Bob")
    val charlie = Person1("Charlie",bob)
    println( charlie.friend?.name )
}