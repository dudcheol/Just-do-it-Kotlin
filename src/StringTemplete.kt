import java.util.*

fun main() {
    val s = "string"
    print("$s.first()")

    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = a + b

    // $c 대신 ${a+b} 도 가능함
    println("$a plus $b equals $c")

    // 이름, 성, 연령을 읽고 정보를 인쇄하는 프로그램을 작성한다.
    val fname = scanner.next()
    val sname = scanner.next()
    val age = scanner.nextInt()
    println("${fname.get(0)}. ${sname}, ${age} years old")

    // 문자열과 숫자 N. 문자열의 N번째 기호를 인쇄한다.
    val str = scanner.nextLine()
    val pos = scanner.nextInt()
    println("Symbol # ${pos} of the string \"${str}\" is '${str[pos - 1]}'")
}