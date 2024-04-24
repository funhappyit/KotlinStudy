fun main(){
    inference()

}
fun types(){
    val whole: Int = 11
    val fractional:Double=1.4
    val trueOrFalse:Boolean = true
    val words:String = "A value"
    val character:Char='z'
    val lines:String = """Triple quotes let
        you have many lines
        in your string
    """.trimMargin()

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(words)
    println(character)
    println(lines)
}
fun inference(){
    val n =1+1.2
    println(n)

}

