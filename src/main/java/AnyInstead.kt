import atomictest.*

class AnyHolder(private val value:Any){
    fun getValue(): Any = value
}

class Dog1{
    fun bark() = "Ruff!"
}
fun main(){
    val holder = AnyHolder(Dog1())
    val any = holder.getValue()

    val genericHolder = GenericHolder(Dog1())
    val dog = genericHolder.getValue()
    dog.bark() eq "Ruff!"

}