class Wombat
class Alien(name:String){
    val greeting = "Poor $name!"
}
class MutableNameAlien(var name:String)

class FixedNameAlien(val name:String)



fun main(){
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")
    alien1.name = "Parasite"
}