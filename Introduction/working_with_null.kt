fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length>0) { // still can check if a variable is null
        return "String of length ${maybeString.length}"
    } else {
        return "Empty of null string"
    }
}

fun main() {
    println(describeString(null)) 
    println(describeString("12345678"))
}