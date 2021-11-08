package ranges

fun main(args: Array<String>) {
    ranges()
}

fun ranges(){
    //val a:IntRange = 1..10
    val a:IntProgression = 1.rangeTo(10).reversed()
    for (x in a) println(x)
    println("")
    var b = 10 downTo 1
    for (y in b) println(y)
    println("")
    val m= 8
    val n=-3
    val c = IntRange(Math.min(m,n), Math.max(m,n))
    for (z in c) println(z)
    println()
    val d = 24 downTo 0 step 3
    for (x in d) println(x)
}