import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    var sum = 0
    for (num in numbers) {
        sum += num
    }

    for (i in numbers.lastIndex downTo 0) {
        sum += numbers[i]
    }

    // n개의 숫자 중 숫자 m이 몇 개 있는지 출력
    val size = scanner.nextInt()
    val list = mutableListOf<Int>()
    for (i in /*0 until size*/ list.indices) {
        list.add(scanner.nextInt())
    }
    var cnt = 0
    val target = scanner.nextInt()
    for (i in list) {
        if (i == target) cnt++
    }
    println(cnt)


    // n개의 숫자들을 배열 내에서 하나씩 밀리게 저장하고 출력
    val nums = IntArray(scanner.nextInt())
    for (i in nums.indices) {
        nums[i] = scanner.nextInt()
    }
    val lnum = nums.last()
    for (i in nums.lastIndex downTo 0) {
        if (i == 0)
            nums[i] = lnum
        else
            nums[i] = nums[i - 1]
    }
    for(i in nums)
        print("$i ")


    // n개의  숫자를 배열 내에서 m씩 밀리게 저장하고 출력
    val arys = IntArray(scanner.nextInt())
    for (i in arys.indices) {
        arys[i] = scanner.nextInt()
    }
    val rotate = scanner.nextInt() % arys.size

    val answer = IntArray(arys.size)
    for (i in answer.indices) {
        if (i + rotate >= answer.size)
            answer[i + rotate - arys.size] = arys[i]
        else
            answer[i + rotate] = arys[i]
    }
    for (i in answer)
        print("$i ")
}