package functions

fun <T> max(collection:Collection<T>, less:(T,T,)->Boolean ): T? {
    var max:T? = null
    for  (x in collection)
        if(max==null || less(max, x))
            max = x
    return max
}

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1,2,3,0,20,100)
    println(max(numbers, {x,y -> x<y}))
}