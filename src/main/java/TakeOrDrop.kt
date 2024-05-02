import atomictest.*
fun main(){
    setOperations()
}

fun takeOrDrop(){
    val list = listOf('a','b','c','X','Z')
    list.takeLast(3) eq "[c, X, Z]"
    list.takeLastWhile { it.isUpperCase() } eq "[X, Z]"
    list.drop(1) eq "[b, c, X, Z]"
    list.dropWhile { it.isLowerCase() } eq "[X, Z]"
}

fun setOperations(){
       val set = setOf("a","ab","ac")
    set.maxByOrNull { it.length }?.length eq 2
    set.filter {
        it.contains('b')
    } eq listOf("ab")
    set.map { it.length } eq listOf(1,2,2)
}