package functions.lambda

fun main(args: Array<String>) {

    var product = {x:Int , y:Int -> x*y}
    println("2*3= ${product(2,3)}")
    val product2:(Int, Int) -> Int = {x,y -> x*y}
    println("2*3= ${product2(2,3)}")

    val numbers = listOf(7,1,3,4)
    val n1 = numbers.count({x -> x>3})
    println(n1)
    // "it" is the implicit name for the iterable variable
    val n2 = numbers.count{it>3}
    println(n2)

    var sum = 0
    numbers.forEach{ sum += it}
    println("The sum of $numbers is $sum")
}