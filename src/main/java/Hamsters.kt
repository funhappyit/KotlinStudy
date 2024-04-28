import atomictest.*
class Hamster1(val name:String)

class Cage(private val maxCapacity:Int){
    private val hamsters = mutableListOf<Hamster1>()
    val capacity: Int get() = maxCapacity - hamsters.size
    val full: Boolean get() = hamsters.size == maxCapacity
    fun put(hamster: Hamster1):Boolean =
        if(full)
            false
        else {
            hamsters += hamster
            true
        }
    fun take(): Hamster1 =
        hamsters.removeAt(0)
}
fun main(){
    val cage = Cage(2)
    cage.full eq false
    cage.capacity eq 2
    cage.put(Hamster1("Alice")) eq true
    cage.put(Hamster1("Bob")) eq true
    cage.full eq true
    cage.capacity eq 0
    cage.put(Hamster1(("Charlie"))) eq false
    cage.take()
    cage.capacity eq 1

}