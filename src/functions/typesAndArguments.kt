package functions
fun triple (x:Int) = x*3
fun calculate_wages(hours_worked:Int=160, hourly_rate:Double=100.0) = hours_worked*hourly_rate

fun sumup(vararg values:Int) : Int {
    return values.sum()
}

fun main(args: Array<String>) {
    println("4*3= ${ triple(4)}")
    println("pay ${calculate_wages(hourly_rate = 50.0)}")
}