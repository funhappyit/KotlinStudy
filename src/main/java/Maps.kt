import atomictest.*
fun main(){
    contactMap()
}
fun mapTest(){
    val contants = mapOf(
        "Pi" to 3.141,
        "e" to 2.718,
        "phi" to 1.618
    )
    contants eq "{Pi=3.141, e=2.718, phi=1.618}"

    //키에 해당하는 값을 찾는다.
    contants["e"] eq 2.718
    contants.keys eq setOf("Pi","e","phi")
    contants.values eq "[3.141, 2.718, 1.618]"

    var s = ""
    //키-값 쌍을 이터레이션한다.
    for(entry in contants){
        s+="${entry.key}=${entry.value}"
    }
    s eq "Pi=3.141e=2.718phi=1.618"

    s = ""
    // 이터레이션을 하면서 키와 값을 분리한다.
    for((key,value) in contants)
        s+="$key=$value, "
    s eq "Pi=3.141, e=2.718, phi=1.618,"
}
fun mutableMap(){
    val m = mutableMapOf(5 to "five",6 to "six")
    m[5] eq "five"
    m[5] = "5ive"
    m[5] eq "5ive"
    m += 4 to "four"
    m eq mapOf(5 to "5ive",4 to "four", 6 to "six")
}
fun getValue(){
    val map = mapOf('a' to "attempt")
    map['b'] eq null
    capture { map.getValue('b')
    } eq "NoSuchElementException: " + "Key b is missing in the map."
   // map.getOrDefault('a',"??")
    map.getOrDefault('a',"??") eq "attempt"
    map.getOrDefault('b',"??") eq "??"
}
class Contact(
    val name: String,
    val phone: String
){
    override fun toString(): String {
        return "Contact('$name',$phone')"
    }
}
fun contactMap(){
    val miffy = Contact("Miffy","1-234-567890")
    val cleo = Contact("Cleo","098-765-4321")
    val contacts = mapOf(miffy.phone to miffy, cleo.phone to cleo)
    contacts["1-234-567890"] eq miffy
    contacts["1-111-111111"] eq null
}
