fun main() {
    operator fun Int.times(str:String) = str.repeat(this) // * is times 
    println(2 * "Bye")

    operator fun String.get(range:IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14]) // [] is the get operator
}