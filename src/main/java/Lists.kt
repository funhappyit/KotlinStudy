import atomictest.*

fun main(){
    plusAssignPuzzle()
}

fun list(){
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    //List의 각 원소에 대해 이터레이션하기
    var result = ""
    for(i in ints){
        result += "$i "
    }
    result eq "99 3 5 7 11 13"

    //List 원소를 '인덱싱'하기
    ints[4] eq 11
}

fun outOfBounds(){
    val ints = listOf(1,2,3)
    capture { ints[3] } contains listOf("ArrayIndexOutOfBoundsException")
}

fun paramterizedTypes(){
    val numbers = listOf(1,2,3)
    val strings = listOf("one","two","three")

    val numbers2:List<Int> = listOf(1,2,3)
    val string2:List<String> = listOf("one","two","three")

    numbers eq numbers2
    strings eq string2
}
fun mutableList(){
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2,3))

    list+=4
    list += listOf(5,6)

    list eq listOf(1,2,3,4,5,6)
}

fun getList():List<Int>{
    return mutableListOf(1,2,3)
}

fun multipleListRef(){
    val first = mutableListOf(1)
    val second: List<Int> = first
    second eq listOf(1)

    first += 2
    second eq listOf(1,2)
}
fun plusAssignPuzzle(){
    val list1 = mutableListOf('A')
    list1 += 'A'
    list1.plusAssign('A')

    //val에 불변 리스트를 대입하는 경우
    val list2 = listOf('B')

    var list3 = listOf('C')
    list3 += 'C'
    val newList = list3+'C'
    list3 = newList

    list1 eq "[A, A, A]"
    list2 eq "[B]"
    list3 eq "[C, C, C]"

}

