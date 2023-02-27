// generic class
// E is the generic element, can be replaced by any other characters like T
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element:E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E =  elements.removeAt(elements.size - 1)
    
    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// utility function to create mutable stacks

fun <E> mutableStackOf(vararg elements:E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    // for loop like rust, but need brackets ()
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
