package generators

fun main(args: Array<String>) {
    val gen = generateSequence(1, {it+1})
    val numbers = gen.take(10)
    println(numbers.toList())
}