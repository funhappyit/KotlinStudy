import atomictest.*

open class GreatApe1{
    protected var energy = 0
    open fun call() = "Hoo!"
    open fun eat() {
        energy +=10
    }
    fun climb(x:Int){
        energy-=x
    }
    fun energyLevel()="Energy:$energy"
}

