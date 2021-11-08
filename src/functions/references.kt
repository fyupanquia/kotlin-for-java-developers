package functions

fun isOdd(x:Int) = x%2!=0
fun isOdd(s:String) = s=="odd"

fun main(args: Array<String>) {
    var numbers = generateSequence (1, {it+1}).take(5)
    println(numbers.filter{ isOdd(it)}.toList())
    println(numbers.filter(::isOdd).toList())

    val predicate : (String) -> Boolean = ::isOdd
    println(predicate("odd"))

    // f(g(x))
    fun <A, B,C> compose(f:(B)->C, g:(A)->B) : (A) -> C {
        return { x -> f(g(x))}
    }

    var strings = "this is a nice testing".split(" ")
    var oddLength = compose(::isOdd,String::length)
    print(strings.filter(oddLength))
}