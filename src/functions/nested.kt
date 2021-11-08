package functions

fun solve_quadratic_equation(a:Double, b:Double, c:Double): Pair<Double, Double>{
    fun calculate_discriminant():Double{
        return b*b-4*a*c
    }
    val rootDisc = Math.sqrt(calculate_discriminant())
    return Pair( (-b+rootDisc)/(2*a), (-b-rootDisc)/(2*a) )
}

fun main(args: Array<String>) {
    val (x1, x2) = solve_quadratic_equation(1.0, 10.0, 16.0)
    print("x1:${x1} x2:${x2}")
}