package collections
data class Person(var name:String, var age:Int)

fun main(args: Array<String>) {
    val people = listOf(
        Person("Frank",25),
        Person("Pepe",28),
        Person("Diana",25),
        Person("Frank",30),
        Person("Bruce",28),
    )

    val byName: Map<String, List<Person>> = people.groupBy(Person::name)
    println(byName)


    val byAgeNames = people.groupBy({it.age}, {it.name})
    for(i in byAgeNames){
        println("These people are ${i.key} years old")
        for(name in i.value){
            println(name)
        }
    }
}