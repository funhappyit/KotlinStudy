import atomictest.*

val String.indices: IntRange
    get() = 0 until length

val <T> List<T>.firstOrNull: T?
    get() = if(isEmpty()) null else this[0]

fun forControl(){
    val nums = mutableListOf(0)
    for (i in 4 until 100 step 4){
        if(i == 8) continue
        if(i == 40) break
        nums.add(i)
    }
    nums eq "[0, 4, 12, 16, 20, 24, 28, 32, 36]"
}
fun whileControl(){
    val nums = mutableListOf(0)
    var i=0
    while(i<100){
        i+=4
        if(i==8) continue
        if(i==40) break
        nums.add(i)
    }
    nums eq "[0, 4, 12, 16, 20, 24, 28, 32, 36]"
}


fun main(){
    whileControl()
}