fun main(){
//    if(1>0)
//        println("It's true!")
//    if(10<11){
//        println("10<11")
//        println("ten is less than eleven")
//    }
    val x =1
    println(oneOrTheOther(x==1))
    println(oneOrTheOther(x==2))
}
fun if2(){
    val x:Boolean = 1>=1
    if(x)
        println("it's true!")
}
fun if3(){
    val n:Int = -11
    if(n>0)
        println("It's positive")
    else
        println("It's negative or zero")
}
fun if4(){
    val n:Int = -11
    if(n>0)
        println("It's positive")
    else if(n==0)
        println("It's zero")
    else
        println("It's negative")
}
fun if5(){
    val y:Boolean = false
    if(!y)
        println("!y is true")
}
fun if6(){
    val num =10
    val result = if(num>100) 4 else 42
    println(result)
}
fun trueOrFalse(exp: Boolean):String{
    if(exp)
        return "It's true!"
    return "It's false"
}
fun oneOrTheOther(exp: Boolean):String=
    if(exp)
        "True!"
    else
        "False"

