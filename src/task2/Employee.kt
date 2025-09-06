package task2

class Employee(name: String, age: Int, var position: String) : Person(name, age) {
    override var id: Int = 1

    //Ghi đè một phần
    override fun introduce() {
        super.introduce()
        println("I work as a $position.")
    }

    //Ghi đè hoàn toàn
    override fun birthday() {
        println("Congratulations on your new role as $position!")
    }
}