import atomictest.*
import javax.swing.MenuElement

data class Message(
    val sender:String,
    val text: String,
    val isRead: Boolean
)
fun main(){
    sortWith()
}

fun propertyReference(){
    val messages = listOf(
        Message("Kitty","Hey!",true),
        Message("Kitty","Where are you?",false)
    )
    val unread = messages.filterNot ( Message::isRead )
    unread.size eq 1
    unread.single().text eq "Where are you?"
}
fun sortWith(){
    val messages = listOf(
        Message("Kitty","Hey!",true),
        Message("Kitty","where are you",false),
        Message("Boss","Metting today",false)
    )
    messages.sortedWith(compareBy(
        Message::isRead, Message::sender
    )) eq listOf(
        //우선은 읽지 않은 메시지가 보낸 사람 순서로 정렬된다.
        Message("Boss", "Meeting today", false),
        Message("Kitty", "Where are you?", false),
        Message("Kitty", "Hey!", true)
    )

}