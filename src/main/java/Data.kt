import atomictest.*

class Data(var i:Int)

fun main(){
//    val data = Data(10)
//    data.i eq 10
//    data.i = 20
//    default()
    val lc = LogChanges()
    lc.n eq 0
    lc.n = 2
    lc.n eq 2
    trace eq "0 becomes 2"

}

class Default{
    var i: Int = 0
    get(){
        trace("get()")
        return field
    }
    set(value){
        trace("set($value)")
        field = value
    }
}
fun default(){
    val d = Default()
    d.i = 2
    trace(d.i)
    trace eq """
        set(2)
        get()
        2
    """.trimIndent()
}
class LogChanges{
    var n: Int = 0
    set(value){
        trace("$field becomes $value")
        field =value
    }
}