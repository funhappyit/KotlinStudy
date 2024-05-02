import atomictest.*

fun main(){
    filterEven(listOf(1,2,3,4)) eq
            listOf(2,4)
}

fun basicLambda(){
    val list = listOf(1,2,3,4)
    val result = list.map({n:Int -> "[$n]"})
    result eq listOf("[1]","[2]","[3]","[4]")
}

fun joinToString(){
    val list = listOf(9, 11, 23, 32)
    list.joinToString(" "){"[$it]"} eq "[9] [11] [23] [32]"
}

fun filterEven(nums:List<Int>):List<Int>{
    val result = mutableListOf<Int>()
    for(i in nums){
        if(i%2 == 0){
            result += i
        }
    }
    return result
}
