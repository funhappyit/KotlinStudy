fun condition(i:Int) = i<100

fun main(){
//    var i =0
//    while(condition(i)){
//         print(".")
//        i+=10
//    }
//    sumUsingRange()
//    showRange(1..5)
//    showRange(0 until 5)
//    showRange(5 downTo 1)
//    showRange(0..9 step 2)
//    showRange(0 until 10 step 3)
//    showRange(9 downTo 2 step 3)
    indexIntoString()
}

fun doWhileLoop(){
    var i=0
    do{
        print(".")
        i+=10
    }while (condition(i))
}

fun assignmentOperators(){
    var n = 10
    val d = 3
    print(n)
    while (n>d){
        n-=d
        print("- $d")
    }
    println("= $n")
    var m = 10
    print(m)
    m %= d
    print("% $d=$m")
}
fun incrementOperator(){
    var i = 0
    while(i<4){
        print(".")
        i++
    }
}
fun repeatThreeTimes(){
    for(i in 1..3){
        println("Hey $i!")
    }
}
fun definingRanges(){
    val range1 = 1..10
    val range2 = 0 until 10
    println(range1)
    println(range2)
}
fun sumUsingRange(){
    var sum = 0
    for(n in 10..100){
        sum += n
    }
    println("sum = $sum")
}
fun showRange(r:IntProgression){
    for(i in r){
        print("$i")
    }
    print("// $r")
    println()
}
fun forWithCharRange(){
    for(c in 'a'..'z'){
        print(c)
    }
}
fun indexIntoString(){
    val s = "abc"
    for(i in 0..s.lastIndex){
        print(s[i]+1)
    }
}






