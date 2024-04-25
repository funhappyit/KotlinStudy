fun main(){
    val num =1
    val den =2
    val f = fraction(num.toLong(),den.toLong())
    println(f)
}
fun intRanges(){
    val r1 = IntRange(0,10)
    val r2 = IntRange(5,7)
    println(r1)
    println(r2)
}
fun rangeSum(){
    val r = IntRange(0,10)
    println(r.sum())
}

fun strings(){
    val s = "AbcD"
    println(s.reversed())
    println(s.toLowerCase())
}
fun conversion(){
    val s = "123"
    println(s.toInt())
    val i = 123
    println(i.toString())
}

fun fraction(numerator:Long, denom:Long)=numerator.toDouble()/denom