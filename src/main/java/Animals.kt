class Giraffe
class Bear
class Hippo
class Dog{
    fun bark() = "yip!";
}
class Cat{
    fun meow() = "mrrrow!"
}
class Hamster{
    fun speak() = "Squeak!"
    fun exercise() =
        this.speak()+ //'this'로 한정함
                speak()+ //'this' 없이 호출함
                "Running on wheel"
}
class Cup{
    var percentFull =0
}

class Cup2{
    var percentFull =0
    val max = 100
    fun add(increase:Int):Int{
        percentFull+=increase
        if(percentFull> max)
            percentFull = max
        return percentFull
    }
}
val constant = 42
var counter = 0
fun inc(){
    counter++
}
class House{
    var sofa: String = ""
}

fun main(){
    val house = House()
    house.sofa = "Simple sleeper sofa: $89.00"
    println(house.sofa)
    house.sofa = "New leather sofa: $3,099.00"
    print(house.sofa)
}