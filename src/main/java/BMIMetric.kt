fun main(){
//    val weight = 160
//    val height = 68
//    val status = bmiEnglish(weight,height)
//    println(status)
//    longConstants()
    biggestLong()
}
fun bmiMetric(weight:Double,height:Double):String{
    val bmi = weight/(height*height)
    return if (bmi<18.5) "UnderWeight"
    else if(bmi<25) "Normal weight"
    else "Overweight"
}
fun bmiEnglish(weight:Int, height: Int):String{
    val bmi = weight/(height*height)*703.07
    return if (bmi<18.5) "Underweight"
    else if (bmi<25) "Normal weight"
    else "Overweight"
}
fun longConstants(){
    val i = 0
    val l1 = 0L
    val l2:Long =0
    println("$l1 $l2")
}
fun useingLongs() {
    val i = Int.MAX_VALUE
    println(0L + i + i)
    println(1_000_000 * 1_000_000L)
}
fun biggestLong(){
    println(Long.MAX_VALUE)
}
