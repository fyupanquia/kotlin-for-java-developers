fun main(args: Array<String>) {
    var_declarations()
}

fun var_declarations(){
    val a:Int=30
    val b:Long=123
    val c:Float=2.3f
    val d:Double = 12.5e5

    println("$a $b $c $d")
    // 30 123 2.3 1250000.0

    val f:StringBuffer = StringBuffer("frank")
    f.replace(0,1,"F")
    println(f)
}