// Kotlin classes are _final_ by default and are not available for inheritance
// memeber functions are _final_ by default and are not overridable
// use open to make class or memeber functions "public"

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}