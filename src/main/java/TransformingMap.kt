import atomictest.*

fun main(){
    val even = mapOf(2 to "two", 4 to "four")
    even.map {
        "${it.key} = ${it.value}"
    }eq listOf("2 = two","4 = four")

    even.map { (key, value)->
        "$key=$value"
    }eq listOf("2=two","4=four")

    even.mapKeys { (num, _)->-num }
        .mapValues { (_, str)->"minus $str" } eq
            mapOf(-2 to "minus two",
            -4 to "minus four")

}