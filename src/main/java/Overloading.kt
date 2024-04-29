import atomictest.*

class Overloading{
    fun f() = 0
    fun f(n:Int) = n+2
}
class My(){
    fun foo() = 0
}

fun My.foo() = 1

fun My.foo(i: Int) = i+2

fun main(){
//   My().foo() eq 0
//    My().foo(1) eq 3
    addInt(5,6) eq add(5,6)
    addDouble(56.23, 44.77) eq add(56.23, 44.77)

}

fun addInt(i:Int, j:Int) = i+j
fun addDouble(i:Double, j:Double) = i+j

fun add(i:Int, j:Int) = i+j
fun add(i:Double, j:Double) = i+j
