import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    repeat(5) {
        println("learn kotlin")
    }

    /**
     * Write a program that reads a line and prints it 10 times on a new line. A line may consist of multiple words separated by spaces.
     */
    val message = scanner.nextLine()
    repeat(10) {
        println(message)
    }

    /**
     * 검출기는 기계에서 생산된 부품의 크기를 기준 표준과 비교한다.
     * 부품의 크기가 크면 고정시키기 위해 보낼 수 있으며, 검출기는 숫자 1을 출력한다.
     * 부품의 크기가 작으면 Reject로 제거되고, 검출기는 -1이라는 숫자를 출력한다.
     * 부품이 완벽하면 준비된 제품으로 박스에 전송되고 검출기는 0을 출력한다.
     * n개의 부품 수를 입력으로 삼는 프로그램을 작성한 다음 검출기 인쇄의 순서를 기록한다.
     * 프로그램은 한 줄에 3개의 숫자를 출력하는 것으로, 준비된 부품의 수, 고칠 부품의 수, 그리고 불합격의 수를 출력하는 것이다.
     */
    var larger: Int = 0
    var smaller: Int = 0
    var perfect: Int = 0

    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            1 -> larger++
            -1 -> smaller++
            0 -> perfect++
        }
    }
    println("$perfect $larger $smaller")


    /**
     * 가장 큰 수 출력
     */
    var max = Integer.MIN_VALUE
    repeat(scanner.nextInt()) {
        val current = scanner.nextInt()
        if (current % 4 == 0) max = Math.max(max, current)
    }
    println(max)
}