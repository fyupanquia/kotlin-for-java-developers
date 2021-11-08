package classes

class Human (var name:String, val age:Int) {
    init {
        println("Human inited with $name and $age")
    }
}

fun main(args: Array<String>) {
    var h = Human("Frank", 25)
    println("My name is ${h.name} and I'm ${h.age} years old")
    h.name = "William" //var
    //h.age= 26 //val
}