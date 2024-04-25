import java.lang.Math.E
import java.lang.Math.sqrt
import java.lang.reflect.ParameterizedType
import kotlin.math.roundToInt
import kotlin.math.PI as circleRatio
import kotlin.math.cos as cosine

fun main(){
//    println(PI)
//    println(cos(PI))
//    println(cos(2* PI))
//    math()
    val rt = RightTriangle(3.0, 4.0)
    println(rt.hypotenuse())
    println(rt.area())
}
fun circle(){
    println(circleRatio)
    println(cosine(circleRatio))
    println(cosine(2*circleRatio))
}
fun math(){
    println(E)
    println(E.roundToInt())
    println(E.toInt())
}
class RightTriangle(val a:Double, val b:Double){
    fun hypotenuse() = sqrt(a*a + b*b)
    fun area() = a*b/2
}

