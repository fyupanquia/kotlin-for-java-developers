package exceptions

fun main(args: Array<String>) {
    val v = arrayOf(1,2,3)

    try {
        println(v[10])
    } catch (e:ArrayIndexOutOfBoundsException) {
        println("we failed with ${e.toString()}")
    }finally {
        println("anyway")
    }

    val text = "123f"
    val number:Int? =try { text.toInt()}catch(e:NumberFormatException){null}
    println(number)
}