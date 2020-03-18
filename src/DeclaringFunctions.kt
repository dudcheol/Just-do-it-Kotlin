import java.util.*


// IsGreater라는 함수를 작성하여, 1번째와 2번째 인수의 합이 3번째 인수와 4번째 인수의 합보다 크면 true를 반환하고, 그렇지 않으면 false를 반환한다.
fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int) = number1 + number2 > number3 + number4

// 3개의 정수 숫자를 가지고 그 합을 반환하는 sum이라는 함수를 써라.
fun sum(a: Int, b: Int, c: Int) = a + b + c

// 영어 글자가 모음인지 확인하는 함수를 쓰세요. 입력문자는 어떤 경우에도 될 수 있다. 'y'자를 모음으로 간주하지 마십시오. 당신의 기능은 Char type의 값을 취하여 Boolean을 반환하는 것이다.
fun isVowel(letter: Char): Boolean {
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u')
    return vowels.contains(letter.toLowerCase())
}
// 더 간단한 답
fun isVowel2(letter: Char) = letter.toLowerCase() in "aeiou"

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))

    val letter = scanner.next()[0]

    println(isVowel2(letter))
}
