class AlienSpecies(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int
){
    fun describe()=
        "$name with $eyes eyes, "+
          "$hands hands and $legs legs"
}
class Scientist(val name:String){
    override fun toString(): String {
        return "Scientist('$name')"
    }
}


fun main(){
//    val kevin = AlienSpecies("Zigerion",2,2,2)
//    val mortyJr =  AlienSpecies("Gazorpian",2,6,2)
//    println(kevin.describe())
//    println(mortyJr.describe())
//    val krombopulosMichael =  AlienSpecies("Gromflomite",2,6,2)
//    println(krombopulosMichael.describe())
    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)

}
