package task2

class Doctor : Person {
    var specialization: String

    //Nếu không có primary constructor thì mọi constructor phụ phải gọi super()
    constructor(name: String, age: Int, specialization: String) : super(name, age) {
        this.specialization = specialization
    }

    override fun introduce() {
        super.introduce()
        println("I am a doctor specializing in $specialization.")
    }
}