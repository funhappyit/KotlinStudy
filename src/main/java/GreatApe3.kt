import atomictest.*

open class GreatApe3(
     val weight: Double,
     val age:Int
)

open class Bonobo3(weight: Double, age: Int): GreatApe3(weight,age)

class Chimpanzee3(weight: Double, age: Int): GreatApe3(weight,age)

class BonoboB3(weight: Double,age: Int):Bonobo3(weight,age)

fun GreatApe3.info() = "wt: $weight age: $age"

fun main(){
     GreatApe3(100.0, 12).info() eq "wt: 100.0 age: 12"
     Bonobo3(110.0, 13).info() eq "wt: 110.0 age: 13"
     Chimpanzee3(120.0, 14).info() eq "wt: 120.0 age: 14"
     BonoboB3(130.0, 15).info() eq "wt: 130.0 age: 15"
}