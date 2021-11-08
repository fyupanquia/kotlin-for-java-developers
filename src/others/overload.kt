package others

data class Vector(var x:Int, var y:Int) {
    operator fun plus(other:Vector) : Vector {
        return Vector(x+other.x, y+other.y)
    }
}

fun main(args: Array<String>) {
    var v1 = Vector(3,4)
    var v2 = Vector(11,3)
    println(v1+v2)
}