package collections.partitioning.drop

fun main(args: Array<String>) {
    var seq = arrayOf(-2,-1,0,1,2)
    val (neg, others) = seq.partition { it<0 }
    println(neg)
    println(others)

    var numbers = arrayOf(3,3,2,2,1,1,2,2,3,3)
    println(numbers.drop(2).take(6)) //ignore 2 first items then take next 6 items

    println(arrayOf<Any>().take(2)) // it doesn't trough an error for empty colections

    println(numbers.takeWhile { it>1 }) // take till while it > 1 then ignore the rest
    println(numbers.dropWhile { it==3 }) // drop till while it =3 then return rest

    println(numbers.dropLast(4))
}