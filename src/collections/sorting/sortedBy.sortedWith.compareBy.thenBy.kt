package collections.sorting

import java.util.*
data class Person(var name:String, var age:Int)
fun main(args: Array<String>) {
    val rand = Random()
    val randomValues = generateSequence { rand.nextInt(10) -5 }.take(10).toList()

    println(randomValues)
    println(randomValues.sorted())
    println(randomValues.sortedDescending())

    var people = listOf(
        Person("Adam",36),
        Person("Boris",18),
        Person("Clarine",36),
        Person("Adam",20),
        Person("Jack",20),
    )
    println("*****")
    println(people)
    println(people.sortedBy{ it.name})
    println("*****")
    println(people.sortedWith(compareBy(Person::age,Person::name))) // sort by age then name
    println(people.sortedWith(compareBy({it.name},{it.age}))) // sort by name then age
    println("*****")
    println(people.sortedWith(compareBy<Person>{it.age}.thenByDescending { it.name } )) // sort by age the desc by name
}