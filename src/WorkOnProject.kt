import java.util.*

fun main() {
    /*
    주차장에 20개의 주차 공간(1~20번)이 있고, 처음에는 모두 비어있다.
    사용자가 주차하길 원할 때, 프로그램은 가장 낮은 번호 주차 가능한 장소를 찾아야 한다.
    사용자는 'park'와 'leave'명령어를 반복적으로 입력할 수 있고 프로그램을 종료하기 위해 'end'명령어를 입력할 수 있다.
    만약 주차 장소가 가득 차 있고 자리가 아예 없다면, 프로그램은 'Sorry, parking lot is full.'이라는 메시지를 띄운다.
    만약 주차 가능한 장소가 몇 개 있다면, 프로그램은 항상 가장 낮은 번호의 장소를 할당해야 한다.
     */
    val scanner = Scanner(System.`in`)

    val spot = BooleanArray(20)
    var str: List<String> = listOf("init")

    while (str[0] != "exit") {
        str = scanner.nextLine().split(" ")

        when (str[0]) {
            "park" -> {
                var cnt = 0
                for (i in spot.indices) {
                    if (!spot[i]) {
                        spot[i] = true
                        println("${str[2]} car parked on the spot ${i + 1}.")
                        break
                    }
                    cnt++
                }
                if (cnt == 20 && spot[cnt - 1]) {
                    println("Sorry, parking lot is full.")
                }
            }
            "leave" -> {
                spot[str[1].toInt() - 1] = false
                println("Spot ${str[1]} is free.")
            }
            "exit" -> {
                return
            }
        }
    }

}