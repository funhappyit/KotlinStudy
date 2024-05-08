//d이 클래스는 상속될 수 있다.
import atomictest.*

open class GreatApe{
    val weight = 100.0
    val age = 12
}

open class Bonobo : GreatApe()
class Chimpanzee: GreatApe()
class BonoboB:Bonobo()

fun GreatApe.info() = ""
