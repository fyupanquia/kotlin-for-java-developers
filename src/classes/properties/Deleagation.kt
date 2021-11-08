package classes.properties
import kotlin.properties.Delegates
import kotlin.reflect.KProperty;

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>):String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value:String) {
        println("$value has been assigned to '${property.name} in $thisRef'")
    }
}

class Person {
    var name: String by Delegate()
    val lazyvalue:String by lazy{
        println("lazyvalue initialized!")
        "test"
    }
    var otherName: String by Delegates.observable("John") {
        prop, old, new-> println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    var p = Person()
    p.name = "Dmitri"
    val s= p.name
    println(s)

    println(p.lazyvalue)
    println(p.lazyvalue)
    println(p.lazyvalue)


    p.otherName = "Frank"
    p.otherName = "William"
}