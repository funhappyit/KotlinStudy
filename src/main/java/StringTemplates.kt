fun main(){
//    val answer = 42
//    println("Fount $answer!")
//    println("printing a $1")
    tripleQuotes()
}
fun stringConcatenation(){
    val s = "hi\n"
    val n = 11
    val d = 3.14
    println("first: "+s+"second:"+n+", third:"+d)
}

fun expresstionInTemplate(){
    val condition = true
    println(
        "${if (condition) 'a' else 'b'}"
    )
    val x = 11
    println("$x+4=${x+4}")
}
fun tripleQuotes(){
    val s = "value"
    println("s=\"$s\".")
    println("""s="$s".""")
}
