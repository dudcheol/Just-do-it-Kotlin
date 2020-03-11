import java.util.*

fun main() {
    println("White car has parked.\nYellow car left the parking lot.\nGreen car just parked here.")

    // 변수 스왑
    var a = 1
    var b = 2
    var c = a
    a = b
    b = c

    print(a)
    print(b)

    // data type
    val number: Int = 100
    println(number)

    // val은 바꿀 수 없다!
    var string = "Hello, World!"
    string = "Hello, Kotlin!"
    println(string)

    /**
     * Naming variables
     */
    var userHomeAddress = "best name"

    /**
     * 주석
     */
    //* asdf *//
    /*asdf*/
    /** asdf */
    //asdf

    val result = println("text")
    println(result)

    // 42를 입력받고 4를 출력하고싶을때, next사용해서 그것의 0번째를 접근한다. or .first 사용
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    println(str[0])
    println(str.toInt() <= 10)

    // 처음보는 문법
    println(10 in 1..100)

    var week : Boolean = scanner.next()!!.toBoolean()
    // 굳이 이럴필요없고, nextBoolean 쓰면 됨
    week = scanner.nextBoolean()
}
