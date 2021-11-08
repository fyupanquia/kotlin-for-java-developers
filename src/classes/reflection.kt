package classes
import kotlin.reflect.KClass
//data class Person(var name:String, var age:Int)

open class Base(x:Int)
class Derived(x:Int) : Base(x)

fun process(b:Base) {
    if(b is Derived){
        println(b::class.qualifiedName)
    }
}

fun main(args: Array<String>) {
    val c: KClass<Person> = Person::class
    println(c.qualifiedName)
    println(c.members.map{it.name})
    println("Is it companion? ${c.isCompanion}")
    println("*****")

    var j:Class<Person> = c.java
    println(j.simpleName)
    println("*****")

    var z:Base = Derived(123)
    process(z)
}