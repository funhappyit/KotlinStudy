import atomictest.*
import java.util.function.BiPredicate

val isPlus: (Int) -> Boolean = {it>0}
val helloWorld: () -> String =
    {"Hello, world!"}
val sum:(Int, Int)->Int = {x,y->x+y}

fun <T> List<T>.any(
    predicate: (T)-> Boolean
):Boolean{
    for(element in this){
        if(predicate(element))
            return true
    }
    return false
}

fun main(){
   // listOf(1,2,-3).any(isPlus) eq true
  //  repeatByInt()
//    repeat(3) {trace("#$it")}
//    trace eq "#0 #1 #2"
    nullableReturn()
}
fun callingReference(){
    helloWorld() eq "Hello, world!"
    sum(1,2) eq 3
}
fun higherOrderFunctions(){
    val ints = listOf(1,2,-3)
    ints.any{it>0} eq true
    val strings = listOf("abc"," ")
    strings.any { it.isBlank() } eq true
    strings.any(String::isNotBlank) eq true
}
fun repeat(
    times:Int,
    action: (Int)->Unit
){
    for(index in 0 until times){
        action(index)
    }
}
fun repeatByInt(){
    repeat(4) {trace("hi!")}
    trace eq "hi! hi! hi! hi!"
}
fun nullableReturn(){
    val transform:(String)->Int? = {s:String->s.toIntOrNull()}
    transform("112") eq 112
    transform("abc") eq null
    val x = listOf("112","abc")

}