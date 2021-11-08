package statements

fun main(args: Array<String>) {
    if_statements()
}
fun if_statements(){
    val age = 30
    val name = if (age<20) "frank" else if (age<30) "william" else "bruce"
    println(name)
}