fun main() {

    // var vs val: val is read only variable cannot be reassigned
    var neverNull: String = "This can't be null"
    neverNull = null // --  this can never work, Kotlin is null safe

    var nullable: String? = "You can keep a null here"

    nullable = null // this is fine
     
    var inferredNonNull = "The compiler assumes non-null"
    inferredNonNull = null 

    fun strLength(notNull:String):Int {
        return notNull.length
    }

    strLength(neverNull)
    strLength(nullable)
}