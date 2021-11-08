package collections

import java.lang.Math.pow

fun main(args: Array<String>) {
    val numbers = generateSequence(1, {it +1}).take(10).toList()
    println(numbers)
    println(numbers.joinToString("->"))

    println("sum (reduce) = ${numbers.reduce{x, p-> x+ p}}")
    println("product (reduce) = ${numbers.reduceRight
    {x, 
        p->   
            print("$x * $p\n") 
            x * p
    }}")

    println("sum = ${numbers.sum()}, average = ${numbers.average()}")
    println("sum of squares = ${numbers.sumBy{it * it}}")
    println("sum of roots = ${numbers.sumByDouble { Math.sqrt(it.toDouble()) }}")

    println("sum (fold) = ${numbers.fold(0, {x,y -> x+ y})}")
    println("product (fold) = ${numbers.fold(1, {x,y -> x*y})}")


    var three = numbers.take(3)
    println("poly = ${numbers.foldIndexed(0, {i,p,c ->
        var xp = pow(3.0, (2-i).toDouble()).toInt()
        println("i=$i xp=$xp c=$c")
        c*xp+p
    })}")


    println("three.fold = ${three.fold(0, {p,x -> (p+x)*(p+x)})}")
    println("three.foldRight = ${three.foldRight(0, {p,x -> (p+x)*(p+x)})}")
}