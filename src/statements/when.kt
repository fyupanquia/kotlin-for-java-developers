package statements

fun main(args: Array<String>) {
    whenstatement()
}
fun get_mexican_code() : Int { return 11 }
fun whenstatement(){
    val code = 200

    when (code) {
        44 -> println("UK")
        45-> println("PE")
        56,57 -> println("GE")
        get_mexican_code() -> println("MX")
        in 1..100 -> println("Unknow country code")
        else -> println("Invlaid country code")
    }


    val z:Any = "foo"
    when(z) {
        is Int -> println("INT!")
        is String -> println("STRING!")
        else -> println("Don't know how to handle")
    }
}