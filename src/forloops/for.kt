package forloops

fun main(args: Array<String>) {
    forloop()
}
fun forloop(){
    for (a in (10 downTo  1)) print("${a} ")
    println("")
    val ints = intArrayOf(4,3,2,1)
    for((index, value) in ints.withIndex())
        println("$index:\t$value")
    val capitals = mapOf("Lima" to "Peru", "London" to "UK" )
    for ((capital, country) in capitals) {
        println("$capital is the capital of $country")
    }
}