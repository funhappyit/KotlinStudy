import atomictest.*

fun sumViaFold(){
    val list = listOf(1, 10, 100, 1000)
    list.fold(0){sum, n->
        sum+n
    } eq 1111
}
fun foldVsForLoop(){
    val list = listOf(1, 10, 100, 1000)
    var accumulator = 0
    val operation = {sum:Int, i:Int->sum+i}
    for(i in list){
        accumulator = operation(accumulator,i)
    }
    accumulator eq 1111
}
fun foldRight(){
    val list = listOf('a','b','c','d')
    list.fold("*"){acc,elem->
        "($acc)+$elem"
    }eq "((((*)+a)+b)+c)+d"
    list.foldRight("*"){elem,acc->
        "$elem+($acc)"
    }eq "a+(b+(c+(d+(*))))"
}
fun reduceAndReduceRight(){
    val chars = "A B C D E".split(" ")
    chars.fold("*"){acc,e->"$acc $e"} eq "* A B C D E"
    chars.foldRight("*"){e,acc->"$acc $e"} eq "* E D C B A"
    chars.reduce{acc,e->"$acc $e"} eq "A B C D E"
    chars.reduceRight{e,acc->"$acc $e"} eq "E D C B A"
}
fun runningFold(){
    val list = listOf(11, 13, 17, 19)
    list.fold(7){sum,n->
        sum+n
    } eq 67
    list.runningFold(7){sum,n->
        sum+n
    } eq "[7, 18, 31, 48, 67]"
    list.reduce{sum,n->
        sum+n
    } eq 60
    list.runningReduce{sum,n->
        sum+n
    }eq "[11, 24, 41, 60]"

}
fun main(){
    runningFold()
}