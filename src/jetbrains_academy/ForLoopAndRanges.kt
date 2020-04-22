package jetbrains_academy

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    for (i in 'z' downTo 'e' step 200) {
        println(i)
    }

    // n개 자리 숫자의 합
    var sum: Int = 0
    for (i in 1..scanner.nextInt()) {
        sum += scanner.nextInt()
    }
    println(sum)


    // n개의 수 중 가장 작은 수 출력
    var min = Integer.MAX_VALUE
    for(i in 1..scanner.nextInt()){
        min = Math.min(min, scanner.nextInt())
    }
    println(min)


    // n개의 수 중 가장 큰 두 수의 곱 출력
    val list = mutableListOf<Int>()
    for (i in 1..scanner.nextInt()) {
        list.add(scanner.nextInt())
    }
    list.sortWith(Collections.reverseOrder())
    println(
        if (list.size > 1) list[0] * list[1]
        else list[0]
    )
}