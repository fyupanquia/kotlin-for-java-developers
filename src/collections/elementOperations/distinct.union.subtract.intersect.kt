package collections.elementOperations
data class Person(var name:String, var age:Int)

fun main(args: Array<String>) {
    val word1 = "helloooo".toCharArray().toList()
    val word2 = "help!".toCharArray().toList()

    println(word1.distinct())
    println(word1.intersect(word2))
    println("*****")
    println(word1.union(word2))
    println(word1.subtract(word2))

    val people = listOf(
        Person("John",20),
        Person("Jill",20),
        Person("John",35),
    )
    println("*****")
    println("distinct by name ${people.distinctBy{it.name}}")
    println("distinct by age ${people.distinctBy{it.age}}")
}