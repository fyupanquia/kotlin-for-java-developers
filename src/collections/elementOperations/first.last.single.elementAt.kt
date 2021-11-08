package collections.elementOperations

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3)
    println("first element is ${numbers.first()}")
    println("first element is ${numbers.first{it>2}}")
    //println("first element is ${numbers.first{it>10}}")//exception!
    println("first element is ${numbers.firstOrNull{it>10}}")//exception!
    println("*****")
    println(numbers.last())
    println(numbers.last {it<3})
    println("*****")
    val x = listOf(1)
    println(x.single())
    println(x.singleOrNull())
    //println(numbers.single()) exception!, single just for 1 element in collections
    println("three: ${numbers.single{it ==3}}")
    println("*****")
    println("element at position 1: ${numbers.elementAtOrNull(4)}")
    println("element at position 100: ${numbers.elementAtOrElse(100, { -it})}")

}