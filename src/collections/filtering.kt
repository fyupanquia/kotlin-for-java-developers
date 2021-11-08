package collections

fun main(args: Array<String>) {

    val seq = generateSequence (1, {it +1})
    val numbers = seq.take(10).toList()
    println(numbers)

    val evenNumbers  = numbers.filter { it%2==0 }
    println(evenNumbers)
    val notDivBy3  = numbers.filterNot { it%3==0 }
    println(notDivBy3)

    val oddSquares = numbers.map{it*it}.filterNot{it%2==0}
    println(oddSquares)

    val values = arrayOf<Any>(1,2.5,3,4.56)
    val wholeNumbers = values.filter{it is Int}
    println(wholeNumbers)

    val moreValues = arrayOf<Int?>(1,2,3,null,4,5)
    val nonNullValues = moreValues.filterNotNull()
    println(nonNullValues)
}