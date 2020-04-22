package jetbrains_academy

import java.util.*

fun main() {
    val a = 10
    val b = 12
    val range = a..b - 1 // 답: 10..11

    println(range)

    // 첫 번째 숫자가 두 번째와 세 번째(포함) 사이에 있으면 참 아니면 거짓을 리턴
    val sc = Scanner(System.`in`)
    val target = sc.nextInt();
    val source1 = sc.nextInt();
    val source2 = sc.nextInt();
    if (target >= source1 && target <= source2) println(true)
    else println(false)

    // => 모범답안 "in"을 활용하자! 또, if문이 값을 리턴하므로 그것도 활용하면 좋다!
    println(if (target in source1..source2) "true" else "false")
}