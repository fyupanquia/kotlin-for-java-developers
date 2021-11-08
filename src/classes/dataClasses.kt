package classes

data class Humano(var name:String, val age:Int){

}

fun main(args: Array<String>) {
    var h = Humano("Dmitri", 123)
    println(h)


    var h2 = Humano("Dmitri", 123)
    println(h==h2)

    var h3 = h.copy()
    println(h === h3)

    val (name, age) = h
    println("$name, $age")

}