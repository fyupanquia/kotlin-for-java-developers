package functions

class Average {
    public operator fun invoke(vararg values:Double):Double {
        var sum = 0.0
        for (x in values)
            sum += x
        return sum / values.size
    }
}

fun main(args: Array<String>) {
    val a = Average()
    val avg = a(1.0,2.0,3.0)
    println(avg)

    operator fun String.invoke():String{
        return "("+this+")"
    }

    val two = "two"
    println("I have 2 ${two()}")

}