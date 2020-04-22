package jetbrains_academy

// 생성자 사용
class Point2D {
    var x: Double
    var y: Double

    constructor(x: Double, y: Double) {
        this.x = x
        this.y = y
    }
}
// 위와 같다
class Pint2D2(val x: Double, val y: Double)

// reddit.com 주소와 2005년 기초 연도로 사이트를 반환하는 jetbrains_academy.makeReddit() 기능을 구현하라
class Site(val address: String, val foundationYear: Int)

fun main() {
    println(makeReddit().address)
    println(makeReddit().foundationYear)
}

fun makeReddit() = Site("reddit.com", 2005)