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
}
