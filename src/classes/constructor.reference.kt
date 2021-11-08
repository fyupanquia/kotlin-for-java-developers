package classes


fun <T> makeAndPrint(generator:()->T){
    val x : T = generator()
    println(x.toString())
}

fun main() {
    makeAndPrint (::Person)
}