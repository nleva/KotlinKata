package kata

import java.util.*


fun main() {

    var person = Person().apply {
        firstName = "Ada"
        lastName = "Lovelace"
        birthDate = Calendar.getInstance()
            .apply {set(1815,11,10)}
            .time
        address = "London, England"
    }

    person.run{ "$firstName $lastName from $address" }.println()

    testCopy(person.copy(), person)
    testCopy(person.copyByAlso(), person)
    testCopy(person.copyByApply(), person)
    testCopy(person.copyByLet(), person)
    testCopy(person.copyByRun(), person)
}

private fun testCopy(copy: Person, person: Person) {
    assert(copy.firstName == person.firstName)
    assert(copy.lastName == person.lastName)
    assert(copy.birthDate == person.birthDate)
    assert(copy.address == person.address)
    assert(person !== copy)
}

fun Person.copy(): Person {
    var copy = Person()
    copy.firstName=this.firstName
    copy.lastName=this.lastName
    copy.birthDate=this.birthDate
    copy.address=this.address
    return copy
}

fun Person.copyByRun(): Person = Person().run{
    TODO("Implement kata.copy function using run function")
}
fun Person.copyByLet(): Person = Person().let{
    TODO("Implement kata.copy function using let function")
}
fun Person.copyByApply(): Person = Person().let{
    TODO("Implement kata.copy function using apply function")
}
fun Person.copyByAlso(): Person = Person().let{
    TODO("Implement kata.copy function using also function")
}

fun String.println() = println(this)

//-------------------------Palindromes-------------------------------------

fun String.isPalindrome(): Boolean {
    TODO("Implement palindrome check function")
}

fun Int.isPalindrome(base:Int): Boolean {
    TODO("Implement palindrome check function for int number with predefined base")
}

fun Int.isPalindrome(base1:Int, base2:Int): Boolean {
    TODO("Check if int number string representations is a palindrome in both bases")
}