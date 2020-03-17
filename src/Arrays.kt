fun main() {
    // 첫 번째 요소와 마지막 요소를 교체하십시오
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    println("${numbers[0]} / ${numbers.last()}")

    if (numbers.isNotEmpty()) {
        val fnum = numbers[0]
        numbers[0] = numbers.last()
        numbers[numbers.lastIndex] = fnum
    }

    println("${numbers[0]} / ${numbers.last()}")
}