package nullables

import ranges.ranges

fun main(args: Array<String>) {
    nullable()
}

fun nullable(){
    var y:String? = null
    val len:Int = y?.length ?: 0
    println(len)

    //
    var z:String? = "don't worry this is a string"
    println(z!!.length)
}