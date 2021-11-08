package smartcasts

fun main(args: Array<String>) {
    smart_casts()
}
fun smart_casts(){
    var s:String? = "defenitely string"
    if (s != null) {
        // not necessary to check the variable "!!.length", interpreter already know is a string definitely
        println(s.length)
    }

    var x:Cloneable = intArrayOf(1,2,3)
    //println(x.size)
    if (x is IntArray){
        println(x.size)
    }
}