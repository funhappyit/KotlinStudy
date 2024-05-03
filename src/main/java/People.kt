import atomictest.*
data class Person3(
    val name: String,
    val age:Int
)

val names = listOf(
    "Alice","Arthricia","Bob","Bill","Birdperson","Charlie","Crocubot","Franz","Revolio"
)

val ages = listOf(21,15,25,25,42,21,42,21,33)

fun people():List<Person3> =
    names.zip(ages) {
        name,age->Person3(name,age)
    }

fun main(){
   val groups = people().groupBy { it.name.first() }
    //groupBy()는 빠르게 맵을 만든다.
    groups['Z'] eq null
}
