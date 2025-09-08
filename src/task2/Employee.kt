package task2

open class Employee(name: String, age: Int, var position: String) : Person(name, age) {
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

    inner class department(var deptName: String) {
        fun showDepartment() {
            //Gọi hàm introduce() của lớp cha Person
            println("${super@Employee.introduce()} works in the $deptName department.")
        }
    }
}