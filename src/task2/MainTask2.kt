package task2

fun main() {
    //Class & Object
    val student1 = Student("Hy", 20)
    student1.displayInfo()
    StudentRepo.addStudent(student1)
    println(StudentRepo.getAllStudents())

    //Constructor
    val car = Car("Toyota", "Camry")
    car.displayInfo()
    val bike = Bike("Wave", "Alpha")
    val square = Rectangle(5.0)
    println(square.area())

    //Inheritance
    val employee = Employee("Huy", 20, "Intern Android Dev")
    employee.introduce()
    employee.birthday()

    //Interface & Abstract class
    val teacher = Teacher("Toi", 40, "Math")
    println(teacher.getInfo())
    val cat = Cat()
    cat.sound()
    cat.sleep()

    /* Class Types */
    //Data class
    val room1 = Room(101, 2)
    val room2 = Room(101, 2)
    println(room1)
    println("Equal? ${room1 == room2}")
    println("Room hashCode: ${room1.hashCode()}")
    //Enum class
    println("Day: ${Day.MONDAY}")
    //Sealed class
    val ketQua1: KetQua = KetQua.ThanhCong("Thành công!")
    val ketQua2: KetQua = KetQua.ThatBai("Thất bại!")
    val ketQua3: KetQua = KetQua.KhongXacDinh
    ketQua1.inRa()
    ketQua2.inRa()
    ketQua3.inRa()
    //Nested & Inner class
    val nested = Outer.Nested()
    nested.nestedFunction()
    val inner = Outer().Inner()
    inner.innerFunction()
    val school = School()
    school.helloStudent("Charlie")

    //Singleton & Companion Object
    println(Department.getDepartmentInfo())
    val university = University.create("HUST")
    println("University: ${university.name}")
}