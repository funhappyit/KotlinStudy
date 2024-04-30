import atomictest.*
data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)
data class Key(val name: String, val id:Int)
fun main(){
    val korvo: Key = Key("Korvo",19)
    korvo.hashCode() eq -2041757108
    val map = HashMap<Key,String>()
    map[korvo] = "Alien"
    println(map[korvo])
    map[korvo] = "Alien"
    map[korvo] eq "Alien"
    val set = HashSet<Key>()
    set.add(korvo)
    set.contains(korvo) eq true
  //  val set = HashSet<Key>()
 //   set.add(korvo)
//   set

}