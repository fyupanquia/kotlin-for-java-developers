package classes

interface IPrinter{
    fun print()
}
interface IScanner{
    fun scan()
}
class Printer: IPrinter{
    override fun print() {
       println("printing....")
    }
}

class Scanner: IScanner{
    override fun scan() {
        println("scanning....")
    }
}

class MultiFunctionDevice0 : IPrinter, IScanner{
    val printer = Printer()
    val scanner = Scanner()

    override fun scan() {
        scanner.scan()
    }

    override fun print() {
        printer.print()
    }
}

class MultiFunctionDevice(printer:IPrinter = Printer(), scanner:IScanner=Scanner()): IPrinter by printer, IScanner by scanner {

}

fun main(args: Array<String>) {
    val mfd0 = MultiFunctionDevice0()
    mfd0.print()
    mfd0.scan()

    val mfd = MultiFunctionDevice()
    mfd.print()
    mfd.scan()

}