import atomictest.*

class Book1(
    val title: String,
    val authors: List<String>
)

fun main(){
    val books = listOf(
        Book1("1984", listOf("George Orwell")),
        Book1("Ulysses", listOf("James Joyce"))
    )
    books.map { it.authors }.flatten() eq listOf("George Orwell", "James Joyce")
    books.flatMap { it.authors } eq listOf("George Orwell", "James Joyce")

}

