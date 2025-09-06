package task2

//Companion Object (giống static trong Java)
class University(val name: String) {
    companion object {
        fun create(name: String): University {
            return University(name)
        }
    }
}