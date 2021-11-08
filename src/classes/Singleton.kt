package classes

class  Point(var x:Double, var y:Double)

object PointFactory{
    fun NewCarterianPoint(x:Double, y:Double) : Point{
        return Point(x,y)
    }
    fun NewPolarPoint(rho:Double, theta:Double) : Point{
        return Point(rho*Math.cos(theta),theta*Math.sin(theta))
    }
}

fun main(args: Array<String>) {
    // var pf = PointFactory()
    // var point = pf.NewPolarPoint(3.0, Math.PI/2)
    var point = PointFactory.NewPolarPoint(3.0, Math.PI/2)
    println(point)
}