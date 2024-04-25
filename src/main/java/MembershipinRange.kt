fun main(){
   // inString()
    println(isDigit('a'))
    println(isDigit('5'))
    println(notDigit('z'))
}

fun memberShipInRange(){
    var percent = 35
    println(percent in 1..100)
}

fun memberShipUsingBounds(){
    val percent = 35
    println(percent in 0..100)
}
fun iterationVsMemberShip(){
    val values = 1..3
    for(v in values){
        println("iteration $v")
    }
    val v = 2
    if(v in values)
        println("$v is a member of $values")
}
fun inString(){
    println('t' in "kotlin")
    println('a' in "kotlin")
}

fun isDigit(ch:Char) = ch in '0'..'9'
fun notDigit(ch:Char) = ch !in '0'..'9'
