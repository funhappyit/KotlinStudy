import atomictest.*
private var count = 0

private class Box(val dimension:Int){
    fun volumn() =
        dimension * dimension * dimension

    override fun toString() = "Box volume: ${volumn()}"
}
private fun countBox(box:Box){
    trace("$box")
    count++
}
fun countBoxes(){
    countBox(Box(4))
    countBox(Box(5))
}
fun main(){
    countBoxes()
    trace("$count boxes")
    trace eq """
        Box volume: 64 
        Box volume: 125
        2 boxes
    """.trimIndent()

}
