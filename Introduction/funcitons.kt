fun printMessage(message:String):Unit { // Unit <=> no return value
    println(message)
}

fun printMessageWithPrefix(message:String, prefix:String="Info") {
    println("[$prefix] $message")
}

fun sum(x:Int, y:Int):Int {
    return x+y
}

fun multiply(x:Int, y:Int): Int = x*y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix="Log", message="Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}