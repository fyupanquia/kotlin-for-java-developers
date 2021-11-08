package functions

infix fun Double.averagedwith(other: Double):Double {
    return (this+other)/2.0
}

fun main(args: Array<String>) {
    val x = 'z' downTo 'a'
    print(x)
    val capitals = mapOf("Paris" to "France", "London" to "UK")
    println(capitals.keys)
    println(capitals.values)
    val a= 3.0
    val b= 10.0
    println("The average of $a and $b is ${a averagedwith b}")
}