import java.util.*

fun main(args: Array<String>) {
    // println(if (true) if (false) { "A" } else "B")

    // 코틀린은 3항연산자가 없는 대신, if문이 값을 리턴한다. 리턴하는 값은 맨 마지막줄에 있는 것으로 한다
    println(
        if (2 % 2 == 0) "EVEN"
        else "ODD"
    )

    val year = 2100

    println(
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    "Leap"
                } else {
                    "Regular"
                }
            } else {
                "Regular"
            }
        } else {
            "Regular"
        }
    )

    // 윤년구하기
    println(
        if (year in 1900..3000 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) "Leap"
        else "Regular"
    )

    // 체스말이 만나는지 파악하기
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    println(
        if ((Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2) || (Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1)) {
            "YES"
        } else "NO"
    )

    // 세 수가 삼각형을 만드는가?
    val ary = DoubleArray(3)
    for (i in 0..2) {
        ary[i] = scanner.nextDouble()
    }
    Arrays.sort(ary)
    println(
        if (Math.pow(ary[2], 2.0) <= Math.pow(ary[0], 2.0) + Math.pow(ary[1], 2.0)) "YES"
        else "NO"
    )
}