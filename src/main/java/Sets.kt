import atomictest.*
fun main(){
    mutableSet()

}


fun removeDuplicates(){
    //List에서 중복을 제거할려면 Set으로 변환하라.
    val list = listOf(3,3,2,1,2)
    list.toSet() eq setOf(1,2,3)
    list.distinct() eq listOf(3,2,1)
    "abbcc".toSet() eq setOf('a','b','c')
}
fun mutableSet(){
    //가변Set
    val mutableSet = mutableSetOf<Int>()
    mutableSet += 42
    mutableSet += 42
    mutableSet eq setOf(42)
    mutableSet -= 42
    mutableSet eq setOf<Int>()
}


fun etc(){
    //Set은 각각의 값이 오직 하나만 존재할 수 있는 컬렉션이다
    val intSet = setOf(1,1,2,3,9,9,4)
    //중복이 없다
    intSet eq setOf(1,2,3,4,9)

    //원소 순서는 중요하지 않다
    setOf(1,2) eq setOf(2,1)

    //원소인지 검사
    (9 in intSet) eq true
    (99 in intSet) eq false

    intSet.contains(9) eq true
    intSet.contains(99) eq false

    // 이 집합이 다른 집합을 포함하는가?
    intSet.containsAll(setOf(1,9,2)) eq true

    //합집합
    intSet.union(setOf(3,4,5,6)) eq setOf(1,2,3,4,5,6,9)

    //교집합
    intSet intersect setOf(0,1,2,7,8) eq setOf(1,2)

    //차집합
    intSet subtract setOf(0,1,9,10) eq setOf(2,3,4)
    intSet - setOf(0,1,9,10) eq setOf(2,3,4)

}



