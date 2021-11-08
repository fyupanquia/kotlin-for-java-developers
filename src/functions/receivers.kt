package functions

fun main(args: Array<String>) {


    val increaseBy = fun Int.(value:Int) = this + value
    val x = 1
    println("$x + 3 = ${x.increaseBy(3)}")
}