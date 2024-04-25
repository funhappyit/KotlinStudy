package Exceptions

import atomictest.*


fun main(){
    averageIncome(3300,3) eq 1100
    capture {
        averageIncome(5000,0)
    } eq "ArithmeticException: /by zero"
}
fun erroneousCode(){
    // val i = "1$".toInt()
}
fun introducingCapture(){
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""
}

fun introducingNull(){
    "1$".toIntOrNull() eq null
}

fun averageIncome(income:Int,months:Int) =
    if (months ==0)
        null
    else
        income / months


