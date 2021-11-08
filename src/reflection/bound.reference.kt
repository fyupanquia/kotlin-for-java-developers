package reflection

fun main(args: Array<String>) {
    var r: Regex = "\\d+".toRegex()
    var isNumber = r::matches
    var general = Regex::matches

    println(isNumber("321"))
    println(general(r, "321"))

    val strings = listOf("foo", "123", "1")
    println(strings.filter(isNumber))
}