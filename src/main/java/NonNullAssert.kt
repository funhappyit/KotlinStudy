import atomictest.*

fun main(){
    fun String?.isNullOrEmpty():Boolean =
        this ==  null || isEmpty()
    "".isNullOrEmpty() eq true
}

fun nonNullAssertCall(){
    val s:String? = "abc"
    s!!.length eq 3
}
fun valueFromMap(){
   val map = mapOf(1 to "One")
   map[1]!!.uppercase()
   map.getValue(1).uppercase() eq "ONE"
   capture {
       map[2]!!.uppercase()
   } eq "NullPointerException"
    capture {
        map.getValue(2).uppercase()
    } eq "NoSuchElementException: "+
            "Key 2 is missing in the map."
}

fun stringIsNullOr(){
    val s1: String? = null
    s1.isNullOrEmpty() eq true
    s1.isNullOrBlank() eq true

    val s2 = ""
    s2.isNullOrEmpty() eq true
    s2.isNullOrBlank() eq true

    val s3: String =" \t\n"
    s3.isNullOrEmpty() eq false
    s3.isNullOrBlank() eq true
}


