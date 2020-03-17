import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // 계속 입력받다가 0을 만나면 지금까지 입력받았던 수 중 가장 큰 수를 출력
    var flag = true
    var max = Integer.MIN_VALUE
    while (flag) {
        val number = scanner.nextInt()
        if (number == 0)
            flag = false
        else
            max = Math.max(max, number)
    }
    println(max)


    // n이 짝수이면 반으로 나누고, 홀수이면 3을 곱하고 1을 더한다. 결과적으로 1이 나올 때까지 이 작업을 반복하십시오.
    var num = scanner.nextInt()
    print("$num ")
    while (num != 1) {
        if (num % 2 == 0) {
            num = num / 2
        } else {
            num = num * 3 + 1
        }
        print("$num ")
    }


    // 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 5 ... 의 일부를 인쇄하는 프로그램을 작성(반복은 숫자 자체와 동일함)
    // 프로그램의 입력은 프로그램이 출력해야 하는 순서의 요소들의 수
    var cnt = 0
    val end = scanner.nextInt()
    var currentNum = 1
    while (cnt < end) {
        for (i in 0 until currentNum) {
            print("$currentNum ")
            if (++cnt == end) break
        }
        currentNum++
    }
}