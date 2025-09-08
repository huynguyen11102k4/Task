package task2

fun interface PersonRepo {
    fun getPerson(id: Int): PersonInfo
}