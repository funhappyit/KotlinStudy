import atomictest.*

open class House1(
    val address: String,
    val state: String,
    val zip: String
){
    constructor(fullAddress: String) :
            this(fullAddress.substringBefore(", "),
            fullAddress.substringAfter(", "),
            fullAddress.substringAfterLast(" "))
    val fullAddress: String
    get() = "$address, $state $zip"
}

class VacationHouse(
    address: String,
    state: String,
    zip: String,
    val startMonth: String,
    val endMonth: String
):House1(address,state,zip){
    override fun toString() =
        "Vacation house at $fullAddress "+
                "from $startMonth to $endMonth"
}
class TreeHouse(
    val name:String
):House1("Tree Street, TR 00000"){
    override fun toString() =
        "$name tree house at $fullAddress"
}
fun main(){
    val vacationHouse = VacationHouse(
        address = "8 Target St. ",
        state = "KS",
        zip = "66632",
        startMonth = "May",
        endMonth = "September")
    vacationHouse eq
            "Vacation house at 8 Target St., "+
            "KS 66632 from May to September"
    TreeHouse("Oak") eq
            "Oak tree house at tree Street, TR 00000"
}

