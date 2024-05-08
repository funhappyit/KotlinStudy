import atomictest.*

class WithSecondary(i:Int){
    init {
        trace("Primary: $i")
    }
    constructor(c:Char) :this(c-'A'){
        trace("Secondary:'$c'")
    }
    constructor(s:String):
            this(s.first()){//[1]
                trace("Secondary:\"$s\"")
            }
}
fun main(){
//    fun sep() = trace("-".repeat(10))
//    WithSecondary(1)
//    sep()
//    WithSecondary('D')
//    sep()
    WithSecondary("Last Constructor")
    trace eq ""



}