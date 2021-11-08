package classes

interface  IFactory<T>{
    fun create(): T
}

class Pointer(var x:Double, var y:Double){
    companion object: IFactory<Point>{

        fun createCarterian(x:Double, y:Double): Point = Point(x,y)
        fun createPolar(x:Double, y:Double): Point = Point(x,y)
        override fun create(): Point {
            return Point(0.0,0.0)
        }
    }

}


class Ing() {
    companion object Frank {
        var name :String = "Frank"
        fun sayHello(){
            println("Hello fools!")
        }
    }
}
fun main(args: Array<String>) {
    var simplePoint = Pointer(1.0,2.0)
    var factoryPoint2 = Pointer.createPolar(3.0, Math.PI/2)
    var defaultPoint = Pointer.Companion.create()

    Ing.Frank.sayHello()
}