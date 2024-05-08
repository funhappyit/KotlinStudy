import atomictest.*
import java.lang.StringBuilder

fun main(){
    customLabel()
}

fun localFunctions(){
    val logMsg = StringBuilder()
    fun log(message: String) =
        logMsg.appendLine(message)
    log("Starting computation")
    val x = 42 //계산을 흉내 냄
    log("Computation result: $x")
    logMsg.toString() eq """
        Starting computation
        Computation result: 42
    """.trimIndent()
}
fun localExtensions(){
    fun String.exclaim() = "$this!"
    "Hello".exclaim() eq "Hello!"
    "Hallo".exclaim() eq "Hallo!"
    "Bonjour".exclaim() eq "Bonjour!"
    "Ciao".exclaim() eq "Ciao!"
}

class Session(
    val title: String,
    val speaker:String
)
val sessions = listOf(Session(
    "Kotlin Coroutines", "Roman Elizarov"
))

val favoriteSpeakers = setOf("Roman Elizarov")

fun localFunctionReference(){
    fun interesting(session: Session): Boolean{
        if(session.title.contains("Kotlin") && session.speaker in favoriteSpeakers){
            return true
        }
        return false
    }
    sessions.any(::interesting) eq true
}
fun returnFromFun(){
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""
    for (it in list) {
        result+="$it"
        if(it == value){
            result eq "123"
            return
        }
    }
    result eq "Never gets here"
}
fun labeledReturn(){
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""
    list.forEach{
        result += "$it"
        if(it == value) return@forEach
    }
    result eq "12345"
}
fun customLabel(){
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""
    list.forEach tag@{
        result += "$it"
        if(it == value) return@tag
    }
    result eq "12345"
}

