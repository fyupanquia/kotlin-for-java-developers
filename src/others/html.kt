package others

abstract class Element {
    abstract fun render(builder: StringBuilder, indent: String)

    override fun toString(): String{
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}

class TextElement(val text:String):Element(){
    override fun render(builder:StringBuilder, ident:String){
        builder.append("$ident$text\n")
    }
}

abstract class Tag(val name:String): Element(){
    val children = arrayListOf<Element>()
    val attributes = hashMapOf<String, String>()

    protected fun <T:Element> initTag(tag:T, init: T.()-> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String){
        builder.append("$indent<$name${renderAttributes()}>\n")
        for(c in children){
            c.render(builder, indent+" ")
        }
        builder.append("$indent</$name>\n")
    }
    private fun renderAttributes():  String? {
        val builder = StringBuilder()
        for(a in attributes.keys){
            builder.append(" $a=\"${attributes[a]}\"")
        }
        return  builder.toString()
    }
}

abstract class TagWithText(name: String): Tag(name){
    operator fun String.unaryPlus(){
        children.add(TextElement(this))
    }
}

class HTML(): TagWithText("html"){
    fun head(init:  Head.()-> Unit) = initTag(Head(), init)
    fun body(init:  Body.()-> Unit) = initTag(Body(), init)
}
class Head(): TagWithText("head") {
    fun title(init: Title.()->Unit) = initTag(Title(), init)
}
class Body(): BodyTag("body")
class Title(): TagWithText("title")

abstract class BodyTag(name:String): TagWithText(name) {
    fun b(init: B.()->Unit) = initTag(B(), init)
    fun p(init: P.()->Unit) = initTag(P(), init)
    fun h1(init: H1.()->Unit) = initTag(H1(), init)
    fun a(href:String, init: A.()->Unit){
        val a = initTag(A(), init)
        a.href = href
    }
}
class B(): BodyTag("b")
class P(): BodyTag("p")
class H1(): BodyTag("h1")
class A(): BodyTag("a") {
    var href: String
        get() = attributes["href"]!!
        set(value){
            attributes["href"]=value
        }
}

fun html(init: HTML.()->Unit): HTML {
    val html = HTML()
    html.init()
    return html
}

fun render(args: Array<String>) =
    html{
        head{
            title{+"THIS IS THE TITLE OF THIS DOCUMENT"}
        }
        body {
            h1 {+"AN EXAMPLE OF A H1 TAG"}
            p {+"AN EXAMPLE OF A P TAG"}
            a(href="http://fyupanquia.com"){+"FRANK YUPANQUI ALLCCA"}
            p{
                +"This is some"
                b{+"mixed"}
                +"text. For more see the "
                a(href="http://kotlin-lang.org"){+"kotlin"}
                "project"
            }
            p{+"some text"}
            p {
                for(arg in args)
                    +arg
            }
        }
    }

fun main(args: Array<String>) {
    var arguments = arrayOf("FRANK","YUPANQUI","ALLCCA")
    println(render(arguments))
}