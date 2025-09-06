package task2

/* Inheritance */
open class Person(var name: String, var age: Int) {
    open val id: Int = 0
    open fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }

    open fun birthday() {
        age++
        println("Happy Birthday $name! You are now $age.")
    }
}
