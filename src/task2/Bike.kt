package task2

//Primary Constructor with Initializer Block
class Bike(val brand: String, val type: String) {
    init {
        println("$brand $type")
    }
}