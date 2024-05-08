import atomictest.*

class Airport(private val code:String){
    open class Plane{
        //자신을 둘러싼 클래스의 private 프로퍼티에 접근할 수 있다.
        fun contact(airport: Airport)=
            "Contacting ${airport.code}"
    }
    private class PrivatePlane3:Plane()
    fun privatePlane1():Plane = PrivatePlane3()
}