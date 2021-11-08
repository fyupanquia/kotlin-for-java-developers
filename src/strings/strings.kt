package strings

import arrays.arrays

fun main(args: Array<String>) {
    string()
}

fun string(){
    val a:Char = '\u0041'
    if (a.toInt() === 65){
        println("Match")
    }

    val b:String = "Hello"
    println(b)
    println(b[0])
    for (letter in b) print(letter+" ")


    val raw = """
        line1
        line2
    """
    println(raw)
    val c:Int = 10
    val  d = "${'$'}${c/3}"
    println(d)

    val e = "${(10 downTo  1).toList().map{it.toString().toList()}.joinToString()}"
    println(e)
}