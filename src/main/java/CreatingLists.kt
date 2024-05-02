import atomictest.*
fun main(){
    filterNotNull()
}

fun creatingLists(){
    //람다는 인자로 추가할 원소의 인덱스를 받는다.
    val list1 = List(10){it}
    list1 eq "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"

    //한 값으로만 이뤄진 리스트
    val list2 = List(10){0}
    list2 eq "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]"

    //글자로 이뤄진 리스트
    val list3 = List(10){'a'+it}
    list3 eq "[a, b, c, d, e, f, g, h, i, j]"

    //정해진 순서를 반복
    val list4 = List(10){list3[it%3]}
    list4 eq "[a, b, c, a, b, c, a, b, c, a]"
}
fun mutableList1(){
    val mutableList1 = MutableList(5,{10*(it+1)})
    mutableList1 eq "[10, 20, 30, 40, 50]"
    val mutableList2 = MutableList(5){10*(it+1)}
    mutableList2 eq "[10, 20, 30, 40, 50]"
}
fun partition(){
    val list = listOf(-3, -1, 5, 7, 10)
    val isPositive = {i:Int -> i>0}

    list.filter(isPositive) eq "[5, 7, 10]"
    list.filterNot(isPositive) eq "[-3, -1]"

    val (pos,neg) = list.partition{it>0}
    pos eq "[5, 7, 10]"
    neg eq "[-3, -1]"

}
fun createPair() = Pair(1,"one")
fun pairOfLists(){
    val (i,s) = createPair()
    i eq 1
    s eq "one"
}
fun filterNotNull(){
    val list = listOf(1,2,null)
    list.filterNotNull() eq "[1, 2]"
}
