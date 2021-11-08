package generators

fun main(args: Array<String>) {
    val seq: Sequence<Int> = generateSequence ( 1, {it+1} )
    val numbers: Sequence<Int> = seq.take(4)

    val squares : Sequence<Int> = numbers.map{it*it}
    println(squares.toList())

    val sentence = "This a nice sentence"
    val wordLengths = sentence.split(" ").map{it.length}.asSequence()
    println(wordLengths.toList())
    
    
    val wordsWithLength = sentence.split(" ").map{
        object{
            val length = it.length
            val word = it
        }
    }

    for (wl in wordsWithLength) {
        println("${wl.word} has length ${wl.length}")
    }

    val wordLengthPairs = sentence.split(" ").associate { it.to(it.length) }
    for (wl in wordLengthPairs){
        println(wl)
    }

    val sequences = listOf("red,green,blue", "orange","white,pink")
    val allwords = sequences.flatMap{it.split(",")}

    print(allwords)

    val objects = arrayOf("house","car","bicycle")
    val colors = arrayOf("red","green","blue")

    val pairs = objects.flatMap { o-> colors.map{ c -> "$c $o"}  }
    print(pairs)
}
