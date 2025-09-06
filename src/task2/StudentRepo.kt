package task2

//Object
object StudentRepo {
    private val students = mutableListOf<Student>()
    fun addStudent(student: Student) {
        students.add(student)
    }

    fun getAllStudents(): List<Student> {
        return students
    }
}