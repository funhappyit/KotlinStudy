import atomictest.*
import Material.*

enum class Material{
    Geramic, Metal, Plastic
}

class GardenItem(val name:String){
    var material: Material = Plastic
    constructor(
        name:String, material: Material
    ) : this(name){
        this.material = material
    }
    constructor(
        material: Material
    ):this("Strange Thing",material)
    override fun toString() = "$material $name"
}
fun main(){
    GardenItem("EIF").material eq Plastic
    GardenItem("Snowman").name eq "Snowman"
    GardenItem("Gazing Ball",Metal) eq "Metal Gazing Ball"
    GardenItem(material = Geramic) eq "Geramic Strange Thing"

}

