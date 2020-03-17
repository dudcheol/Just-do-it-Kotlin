import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)

    val a = 10
    val b = 11

    // 모든 if표현은 when으로 쓸 수 있습니다.
    // 인수없이 when을 사용하면 모든 분기 조건은 부울 식이어야합니다.
    // when에서 하나 이상의 분기를 실행할 수 없습니다.
    when {
        a < 2 -> print(1)
        b > 3 -> print(2)
        a < b -> print(3)
    } // 정답: 2

    /**
     *
    Harry Potter needs our help while identifying which qualities characterize each house.
    Read a string that represents a house and output the following:

    if it is "gryffindor", output "bravery";
    if it is "hufflepuff", output "loyalty";
    if it is "slytherin", output "cunning";
    if it is "ravenclaw", output "intellect";
    otherwise, output "not a valid house".
     */
    print(
        when (scanner.next()) {
            "gryffindor" -> "bravery"
            "hufflepuff" -> "loyalty"
            "slytherin" -> "cunning"
            "ravenclaw" -> "intellect"
            else -> "not a valid house"
        }
    )

    // 넓이구하기
    val shape = scanner.next()
    print(
        when (shape) {
            "triangle" -> {
                val a = scanner.nextDouble()
                val b = scanner.nextDouble()
                val c = scanner.nextDouble()

                0.25 * sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c))
            }
            "rectangle" -> {
                scanner.nextDouble() * scanner.nextDouble()
            }
            "circle" -> {
                scanner.nextDouble().pow(2.0) * 3.14
            }
            else -> {
            }
        }
    )
}