package classes

open class  Someone(var name:String){
    open fun talk(){
        println("Hi, I'm $name")
    }
}

class Manager(name:String, var subordinates:List<Someone>): Someone(name){
    override fun talk() {
        println("What's up guys! I'm $name I've got ${subordinates.size} subordinates")
    }
}

fun main(args: Array<String>) {
    var jhon = Someone("jhon")
    jhon.talk()

    var boss = Manager("Frank", listOf(jhon))
    boss.talk()
}