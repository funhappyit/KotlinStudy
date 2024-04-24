fun isOpen1(hour:Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status =
        if(hour >= open && hour <= closed)
            true
        else
            false
    println("Open: $status")
}
fun isOpen2(hour: Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour >= open && hour <= closed
    println("Open: $status")
}

fun isClosed(hour: Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour<open || hour>closed
    println("Closed: $status")
}

fun main() = isClosed(6)