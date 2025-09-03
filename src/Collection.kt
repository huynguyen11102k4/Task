fun listExample() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    items.forEach { item -> println(item) }
    items.forEach { println(it) }
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}

fun setExample() {
    val numbers = setOf(1, 2, 3, 4, 5, 5, 4)
    println(numbers)
    val fruits = listOf("banana", "avocado", "apple", "kiwi", "apple")
    val fruitSet = fruits.toSet()
    println(fruitSet)
}

fun mapExample() {
    val numbers = mapOf("one" to 1, "two" to 2, "three" to 3)
    for ((key, value) in numbers) {
        println("$key = $value")
    }
    numbers.forEach { (key, value) -> println("$key = $value") }
    numbers.forEach { println("${it.key} = ${it.value}") }
    val fruits = listOf("banana", "avocado", "apple", "kiwi", "apple")
    val fruitCount = fruits.groupingBy { it }.eachCount()
    println(fruitCount)
}

fun main() {
    listExample()
    setExample()
    mapExample()
}