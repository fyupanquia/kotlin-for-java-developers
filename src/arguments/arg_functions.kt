package arguments
import functions.sumup
fun main(args: Array<String>) {
    val stuff = intArrayOf(1,2,3)
    println(sumup(*stuff,4,5,6))
}