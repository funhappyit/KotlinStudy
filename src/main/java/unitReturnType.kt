
fun main(){
    confusing()
}
fun unitFun() = Unit
fun unitReturnType(){
    println(unitFun())
    val u1: Unit= println(42)
    println(u1)
    val u2 = println(0)
    println(u2)
}

fun assigningAnif(){
    val result1 = if(11>42) 9 else 5
    val result2 = if(1<2){
        val a = 11
        a+42
    }else 42

    val result3 =
        if('x'<'y')
            println("x<y")
        else
            println("x>y")

    println(result1)
    println(result2)
    println(result3)
}
fun postfixVsPrefix(){
    var i = 10
    println(i++)
    println(i)
    var j = 20
    println(++j)
    println(j)
}
fun confusing(){
    var i = 1
    println(i++ + ++i)
    //윗 줄보다는 덜 복잡하지만 아래 두 줄의 코드도 바람직하지는 않다
    println(i++ + 10)
    println(20 * ++i)
}

