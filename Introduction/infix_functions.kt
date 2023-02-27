fun main() {
    infix fun Int.times(str:String) = str.repeat(this) // infix on Int
    println(2 times "Bye")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other:String) = Pair(this, other) // infix on String
    val myPair = "McLaren" onto "Lucas"
    println(myPair)


    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia  // infix notation works on memebers functions
}

class Person(val name:String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other:Person) {likedPeople.add(other)}
}
