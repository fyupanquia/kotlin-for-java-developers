package others

typealias FloatSet = Set<Float>
typealias MapWithStringKeys<T> = Map<String, T>
typealias Predicate<T> = (T) -> Boolean
fun <T> where (items:Sequence<T>, p:Predicate<T>) : Sequence<T> {
    return items.filter{x->p(x)}
}
typealias PropertyChangeHandler = (Object, String) -> Unit
class Bike{
    inner class wheel{

    }
}
typealias BikeWheel = Bike.wheel

class typealiases {
    var f : FloatSet = setOf(1.2f, 2.3f)
    var m: MapWithStringKeys<Float> = mapOf("hello".to(2.3f))
    var b = Bike()
    var wheel : BikeWheel =  b.wheel()
}