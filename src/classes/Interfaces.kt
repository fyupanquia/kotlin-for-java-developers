package classes


interface ISomething{
    fun doThings()

    var name:String
    val age:Int
    var foo:String
}

class Concrete(override var name:String, override var foo: String): ISomething{
    override val age:Int = 20
    override fun doThings(){

    }
}

fun main(args: Array<String>) {
    var c:ISomething = Concrete("frank", "bar")
    c.doThings()
    println(c.name)
}