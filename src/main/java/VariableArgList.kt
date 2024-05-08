import atomictest.*

fun v(s: String, vararg d:Double){}

fun main(){
    second(7,9,32) eq "[7][9][32]"
}
fun varargSum(){
//    sum(13,27,44) eq 84
//    sum(1, 3, 5, 7, 9, 11) eq 36
//    sum() eq 0

}

//fun sum(vararg numbers:Int):Int{
//    var total = 0
//    for(n in numbers){
//        total += n
//    }
//    return total
//}
fun evaluate(vararg ints:Int) =
    "Size: ${ints.size}\n"+
    "Sum: ${ints.sum()}\n"+
    "Average: ${ints.average()}"

//fun spreadOperator(){
//    val array = intArrayOf(4,5)
//    sum(1,2,3,*array,6) eq 21
//
//    val list = listOf(9,10,11)
//    sum(*list.toIntArray()) eq 30
//}
fun first(vararg numbers: Int):String{
    var result = ""
    for(i in numbers){
        result += "[$i]"
    }
    return result
}
fun second(vararg numbers: Int) = first(*numbers)
