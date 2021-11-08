package classes

class Person {
     var name:String = ""
    var age:Int = -1

    val canVote:Boolean
        get() = age>16

    var ssn = "00000000"
        get() = field
        set(value) {
            println("$name's SSN changed")
            field = value
        }
}

fun main(args: Array<String>) {
    val me = Person()
    println(me.name)
    me.name = "Dmitri"
    me.age = 12

    println("${me.name} can${if (!me.canVote) "not" else ""} vote ")

    me.ssn = "11111111"
}