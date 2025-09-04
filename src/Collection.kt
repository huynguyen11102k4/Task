fun main() {
    listExample()
    setExample()
    mapExample()
}
fun listExample() {
    val items = listOf("apple", "banana", "mango")
    for (item in items) {
        print("$item ")
    }
    println()
    items.forEach { item -> print("$item ")}
    println()
    items.forEach { print("$it ") }
    println()
    val fruits = listOf("banana", "avocado", "apple", "mango")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { print("$it ") }
    println()
    fruits.reduce { acc, s -> "$acc, $s" }
    val num = listOf(1, 2, 3, 4, 5)
    println(num.all { it > 0 })
    println(num.any { it > 3 })
    println(num.count { it > 3 })
    println(num.find { it > 3 })
    println(num.findLast { it > 3 })
    println(num.maxOrNull())
    println(num.minOrNull())
    println(num.sum())
    println(num.fold(10) { acc, i -> acc + i })
}

fun setExample() {
    val num = setOf(1, 2, 3, 4, 5, 5, 4)
    println(num)
    val fruits = listOf("banana", "avocado", "apple", "mango", "apple")
    val fruitSet = fruits.toSet()
    println(fruitSet)
    val fruitSet2 = fruits.toSortedSet()
    println(fruitSet2)
    val num2 = setOf(3, 4, 5, 6, 7)
    println(num.intersect(num2))
    println(num.union(num2))
    println(num.subtract(num2))
    println(num2.subtract(num))
}

fun mapExample() {
    val num = mapOf("one" to 1, "two" to 2, "three" to 3)
    for ((key, value) in num) {
        println("$key = $value")
    }
    num.forEach { (key, value) -> println("$key = $value") }
    num.forEach { println("${it.key} = ${it.value}") }
    val fruits = listOf("banana", "avocado", "apple", "mango", "apple")
    val fruitCount = fruits.groupingBy { it }.eachCount()
    println(fruitCount)
    val fruitCount2 = fruits.groupBy { it.startsWith("a") }
    println(fruitCount2)
}
