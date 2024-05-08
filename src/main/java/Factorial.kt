import atomictest.*
import java.util.concurrent.atomic.DoubleAccumulator

fun factorial(n:Long):Long{
    if(n<=1) return 1
    return n * factorial(n-1)
}
//fun sum(n: Long): Long{
//   var accumulator = 0L
//   for(i in 1..n){
//       accumulator += i
//   }
//    return accumulator
//}

private tailrec fun sum(
    n:Long,
    accumulator: Long
):Long =
    if(n == 0L) accumulator
    else sum(n-1,accumulator+n)

fun sum(n:Long) = sum(n,0)

fun fibonacci(n:Long):Long{
    return when(n){
        0L->0
        1L->1
        else ->
            fibonacci(n-1)+fibonacci(n-2)
    }
}
fun fibonacci(n:Int): Long{
    tailrec fun fibonacci(
        n:Int,
        current:Long,
        next:Long
    ):Long{
        if(n==0) return current
        return fibonacci(
            n-1,next,current+next
        )
    }
    return fibonacci(n,0L,1L)
}


fun main(){
    (0..8).map{fibonacci(it)} eq "[0,1,1,2,3,5,8,13,21]"

}