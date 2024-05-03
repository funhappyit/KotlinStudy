import atomictest.*

fun main(){
//    val left = listOf("a","b","c","d")
//    val right = listOf("q","r","s","t")
//
//    left.zip(right) eq "[(a, q), (b, r), (c, s), (d, t)]"
//
//    left.zip(0..4) eq "[(a, 0), (b, 1), (c, 2), (d, 3)]"
//
//    (10..100).zip(right) eq "[(10, q), (11, r), (12, s), (13, t)]"
    flatten()

}
data class Person2(
    val name: String,
    val id :Int
)

fun zipAndTransform(){
    val names = listOf("Bob","Jill","Jim")
    val ids = listOf(1731, 9274, 8378)
    names.zip(ids) { name, id->
        Person2(name,id)
    } eq "[Person2(name=Bob, id=1731), "+
            "Person2(name=Jill, id=9274), "+
            "Person2(name=Jim, id=8378)]"

}
fun zippingWithNext(){
    val list = listOf('a', 'b', 'c', 'd')

    list.zipWithNext() eq listOf(
        Pair('a', 'b'),
        Pair('b', 'c'),
        Pair('c', 'd')
    )

    list.zipWithNext{a,b -> "$a$b"} eq "[ab, bc, cd]"
}
fun flatten(){
    val list = listOf(
        listOf(1,2),
        listOf(4,5),
        listOf(7,8)
    )
    list.flatten() eq "[1, 2, 4, 5, 7, 8]"


}





