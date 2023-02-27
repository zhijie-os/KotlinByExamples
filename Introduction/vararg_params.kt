fun main() {
    fun printAll(vararg messages:String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好") 

    fun printAllWithPrefix(vararg messages:String, prefix:String) {
        for (m in messages) println(prefix+m)
    }

    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries) // spread * operator to pass the array into another function, like ...? 
    }

    log("Hello", "Hallo", "Salut", "Hola", "你好")
}