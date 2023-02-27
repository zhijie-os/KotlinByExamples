// declare a class named "Customer" without any properties, attributes or constructors
class Customer

// create Contact with two attributes val id:Int and email:String, and set constructor
class Contact(val id:Int, var email: String)

fun main() {
    // val customer = Customer()

    val contact = Contact(1, "mary@gmail.com")
    println(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)
}