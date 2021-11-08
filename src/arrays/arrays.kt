package arrays



fun main(args: Array<String>) {
    arrays()
}


fun arrays() {
    var names: Array<String> = arrayOf("Frank", "William")
    names[1]="Bruce"
    println(names.toList())

    var ages: IntArray = intArrayOf(10,11,12,13)
    println(ages.toList())

    val doubles = Array(10, {2.0})
    println(doubles.toList())

    val squares:Array<String> = Array(10, {(it*it).toString()})
    println(squares.toList())
}
