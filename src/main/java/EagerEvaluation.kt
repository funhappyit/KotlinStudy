import atomictest.*

fun Int.isEven():Boolean{
    trace("$this.isEven()")
    return this % 2 == 0
}

fun Int.square():Int{
    trace("$this.square()")
    return this*this
}

fun Int.lessThanTen():Boolean{
    trace("$this.lessThanTen()")
    return this<10
}
fun eagerVsLazyEvaluation(){
    val list = listOf(1,2,3,4)
    trace(">>> List:")
    trace(
        list.filter(Int::isEven)
            .map(Int::square)
            .any(Int::lessThanTen)
    )
    trace(">>> Sequence:")
    /*
    asSequence() 함수는 Kotlin의 컬렉션을 시퀀스로 변환합니다.
    컬렉션을 시퀀스로 변환하면 연산이 "지연 평가"되어, 필요한 시점에만 연산이 수행됩니다. 이는 대규모의 데이터에 대해 연산을 수행할 때 성능을 향상시킬 수 있습니다.
    일반적으로, 'filter()','map()','any()'와 같은 연산은 컬렉션을 탐색하면서 새로운 컬렉션을 생성하거나 결과를 계산합니다.
     그러나 'asSequence()'를 사용하면 이러한 연산이 실제로 필요한 시점까지 지연되어 처리됩니다.
    따라서, 'asSequence()'를 사용하면 연산이 필요한 시점에서만 요소를 계산하고 처리할 수 있습니다.
    */
    trace(
        list.asSequence()
            .filter(Int::isEven)
            .map(Int::square)
            .any(Int::lessThanTen)
    )
    trace eq "List:\n" +
            "1.isEven()\n" +
            "2.isEven()\n" +
            "3.isEven()\n" +
            "4.isEven()\n" +
            "2.square()\n" +
            "4.square()\n" +
            "4.lessThanTen()\n" +
            "true\n" +
            ">>> Sequence:\n" +
            "1.isEven()\n" +
            "2.isEven()\n" +
            "2.square()\n" +
            "4.lessThanTen()\n" +
            "true"
}
fun noComputationYet(){
    val r = listOf(1, 2, 3, 4)
        .asSequence()
        .filter(Int::isEven)
        .map(Int::square)
    r.toString().substringBefore("@") eq "kotlin.sequences.TransformingSequence"

}
fun terminalOperations(){
    val list = listOf(1,2,3,4)
    trace(list.asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .toList()
    )
    trace eq "1.isEven()\n" +
            "2.isEven()\n" +
            "2.square()\n" +
            "3.isEven()\n" +
            "4.isEven()\n" +
            "4.square()\n" +
            "[4, 16]"
}
fun generateSequence1(){
    val naturalNumbers =
        generateSequence(1){
            it+1
        }
    naturalNumbers.take(3).toList() eq listOf(1,2,3)
    naturalNumbers.take(10).sum() eq 55
}

fun test(){
    val n = 3 // 이 숫자를 바꿔서 증가할 횟수를 조절할 수 있습니다.

    // 1씩 증가하는 for 루프
    for (i in 1..n) {
        println(i+1)
    }
}
fun generateSequence2(){
    val items = mutableListOf("first","second","third","XXX","4th")
    val seq = generateSequence {
        items.removeAt(0).takeIf { it != "XXX" }
    }
    seq.toList() eq "[first, second, third]"
}
fun <T> T.takeIf(
    predicate: (T)->Boolean
): T? {
    return if (predicate(this)) this else null
}

fun main() {
    generateSequence2()
}