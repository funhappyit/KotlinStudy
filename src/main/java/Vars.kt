fun main(){
    varAndVal();
}

fun vars(){
    var whole = 11
    var fractional = 1.4
    var words = "Twas Brilling"
    println(whole);
    println(fractional);
    println(words);
}

fun varisMutable(){
    var sum = 1
    sum = sum+2
    sum+=3
    println(sum)
}

fun varAndVal(){
    val whole = 11
    val fractional = 1.4
    val words = "Twas Brillig"
    println(whole)
    println(fractional)
    println(words)
}