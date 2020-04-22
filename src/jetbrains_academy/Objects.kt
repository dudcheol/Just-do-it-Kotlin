package jetbrains_academy

fun main() {
    val input = readLine()!!
    // write code here
    println(
        if (input.isNotEmpty())
            when {
                input.first() == 'i' -> {
                    val ret = input.drop(1)
                    ret.toInt() + 1
                    // 이렇게도 작성 가능 : inpujt.drop(1).toInt()
                }
                input.first() == 's' -> {
                    val ret = input.drop(1)
                    ret.reversed()
                }
                else -> {
                    input
                }
            }
        else return
    )
}