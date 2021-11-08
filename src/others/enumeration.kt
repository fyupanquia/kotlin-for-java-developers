package others

enum class Direction {North, South, East, West}

enum class Color(val  rgb:Int){
    Red(0xff0000) {
        override fun example(): String {
            return "blood"
        }
    },
    Green(0x00ff00) {
        override fun example(): String {
            return "grass"
        }
    },
    Blue(0x0000ff) {
        override fun example(): String {
            return "sky"
        }
    };
    abstract  fun example(): String
}

fun main(args: Array<String>) {
val dir = Direction.East
    println(dir)
    var r = Color.Red
    println("r has the name ${r.name}, value ${r.rgb}, position ${r.ordinal}")
    println("r is the color of ${r.example()}")

    for (color in Color.values()){
        println(color)
    }

    println("value of red is ${Color.valueOf("Red").rgb}")
}