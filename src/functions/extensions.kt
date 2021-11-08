package functions

fun <T> ArrayList<T>.swap(index1:Int, index2:Int){
    val temp = this[index1]
    this[index1] =this[index2]
    this[index2] =temp
}

fun Any?.print(){
    if(this== null) println("object is null")
    else println("object is ${this.toString()}")
}

fun main(args: Array<String>) {
    val myList = arrayListOf(1,2,3)
    myList.swap(0,2)
    println(myList)

    myList.print()
    val s:String? = null
    s.print()
}