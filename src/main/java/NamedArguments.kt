import atomictest.*

fun color(
    red:Int = 0,
    green: Int = 0,
    blue: Int =0
) = "($red, $green, $blue)"

fun main(){
//    color(139) eq "(139, 0, 0)"
//    color(blue = 139) eq "(0, 0, 139)"
//    color(255, 165) eq "(255, 165, 0)"
    createString()
}
fun createString(){
    val list = listOf(1, 2, 3)
    list.toString() eq "[1, 2, 3]"
    list.joinToString() eq "1, 2, 3"
    list.joinToString(prefix = "(", postfix = ")") eq "(1, 2, 3)"
}
class DefaultArg

