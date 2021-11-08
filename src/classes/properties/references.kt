package classes.properties

import java.lang.reflect.Field
import java.lang.reflect.Method
import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty0
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

var x = 1
val y = 22


class Persona(var age:Int)


val String.lastChar : Char
    get() = this[length-1]


fun main(args: Array<String>) {
    val a: KMutableProperty0<Int> = ::x
    val b: KProperty0<Int> = ::y

    println(a.get())
    a.set(321)
    println(a.get())

    val strings = "this is fun".split(" ")
    println(strings.map(String::length))

    var persona = Persona(25)
    var age = Persona::age
    println(age.get(persona))

    var ls = String::lastChar
    println(ls.get("frank"))

    var javaGetter: Method? = Persona::age.javaGetter
    var filed: Field? = Persona::age.javaField

}