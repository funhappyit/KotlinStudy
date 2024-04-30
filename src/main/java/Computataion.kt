import atomictest.*

data class Computataion(
    val data: Int,
    val info: String
)

fun evaluate(input:Int) =
    if(input>5)
        Computataion(input*2,"High")
    else
        Computataion(input*2, "Low")

fun main(){
    val (value,description) = evaluate(7)
    value eq 14
    description eq "High"
}