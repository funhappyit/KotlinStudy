fun main(){
    val r = multiplyByTwo(5)
    println(r)
}
/*
fun 함수이름(p1:타입1,p2:타입2,...):반환타입{
    여러 줄의 코드
    return 결과
}
*/
fun multiplyByTwo(x:Int):Int{
    println("Inside multiplyByTwo")
    return x*2
}
