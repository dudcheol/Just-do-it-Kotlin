import java.util.*

/**
- 3/5 -
주차장에 20개의 주차 공간(1~20번)이 있고, 처음에는 모두 비어있다.
사용자가 주차하길 원할 때, 프로그램은 가장 낮은 번호 주차 가능한 장소를 찾아야 한다.
사용자는 'park'와 'leave'명령어를 반복적으로 입력할 수 있고 프로그램을 종료하기 위해 'end'명령어를 입력할 수 있다.
만약 주차 장소가 가득 차 있고 자리가 아예 없다면, 프로그램은 'Sorry, parking lot is full.'이라는 메시지를 띄운다.
만약 주차 가능한 장소가 몇 개 있다면, 프로그램은 항상 가장 낮은 번호의 장소를 할당해야 한다.
 */

/**
- 4/5 -
create 명령어 추가 ex) create 3 -> Created a parking lot with 3 spots.
create 전에 park, leave 명령어 등장시 -> Sorry, parking lot is not created.
create 한 후에 다시 create를 한다면 -> parking state 리셋
status 명령어 추가 -> 현재 할당되어있는 지점들을 오름차순으로 출력
할당된 지점이 없다면 -> Parking lot is empty.
 */

/**
- 5/5 -
 * reg_by_color
- color를 매개변수로 삼아 특정 색상의 모든 차량 등록 번호 출력
- color 대소문자 가능
- 쉼표로 구분
- 순서는 status 명령과 같아야 함
해당 컬러가 없을 경우 -> No cars with color ${color.uppercase} were found.
 * spot_by_color
- 특정 색상의 모든 차량의 주차 공간 번호를 출력한다.
 * spot_by_reg
- 등록 번호를 기준으로 자동차가 위치한 지점 번호를 반환한다.
- 없는 경우 -> No cars with registration number ${차량 등록 번호} were found.

p.s 차량등록번호는 모두 유니크함
 */

class Spot() {
    var alloc: Boolean = false
    var num: Int = 0
    var name: String = ""
    var color: String = ""

    fun matchColor(color: String): Boolean = color.toUpperCase() == this.color.toUpperCase()

//    fun spotByColor(color: String): Boolean = color.toUpperCase() == this.color.toUpperCase()

    fun matchReg(reg: String): Boolean = reg.toUpperCase() == this.name.toUpperCase()
}

fun main() {
    val scanner = Scanner(System.`in`)
    var spot: Array<Spot>? = null
    var str: List<String> = listOf("init")

    while (str[0] != "exit") {
        str = scanner.nextLine().split(" ")

        when (str[0]) {
            "create" -> {
                spot = Array<Spot>(str[1].toInt()) { Spot() }
                var i = 1
                for (s in spot)
                    s.num = i++         // 초기화

                println("Created a parking lot with ${str[1]} spots.")
            }
            "park" -> {
                if (spot == null) {
                    println("Sorry, parking lot is not created.")
                } else {
                    var cnt = 0
                    for (i in spot.indices) {
                        if (!spot[i].alloc) {
                            spot[i].alloc = true
                            spot[i].name = str[1]
                            spot[i].color = str[2]
                            println("${spot[i].color} car parked on the spot ${spot[i].num}.")
                            break
                        }
                        cnt++
                    }
                    if (cnt == spot.size && spot[cnt - 1].alloc) {
                        println("Sorry, parking lot is full.")
                    }
                }
            }
            "leave" -> {
                if (spot == null) {
                    println("Sorry, parking lot is not created.")
                } else {
                    spot[str[1].toInt() - 1].alloc = false
                    println("Spot ${str[1]} is free.")
                }
            }
            "exit" -> {
                return
            }
            "status" -> {
                if (spot == null)
                    println("Parking lot is empty.")
                else {
                    var isEmpty = true
                    for (i in spot) {
                        if (i.alloc) {
                            println("${i.num} ${i.name} ${i.color}")
                            isEmpty = false
                        }
                    }
                    if (isEmpty) println("Parking lot is empty.")
                }
            }
            "reg_by_color" -> {
                if (spot == null)
                    println("Sorry, parking lot is not created.")
                else {
                    val list = ArrayList<String>()
                    for (i in spot.indices) {
                        if (spot[i].matchColor(str[1].toUpperCase())) {
                            list.add(spot[i].name)
                        }
                    }
                    if (list.isNotEmpty()) println(list.joinToString(", "))
                    else println("No cars with color ${str[1].toUpperCase()} were found.")
                }
            }
            "spot_by_color" -> {
                if (spot == null)
                    println("Sorry, parking lot is not created.")
                else {
                    val list = ArrayList<String>()
                    for (i in spot.indices) {
                        if (spot[i].matchColor(str[1].toUpperCase())) {
                            list.add(spot[i].num.toString())
                        }
                    }
                    if (list.isNotEmpty()) println(list.joinToString(", "))
                    else println("No cars with color ${str[1].toUpperCase()} were found.")
                }
            }
            "spot_by_reg" -> {
                if (spot == null)
                    println("Sorry, parking lot is not created.")
                else {
                    val list = ArrayList<String>()
                    for (i in spot.indices) {
                        if (spot[i].matchReg(str[1].toUpperCase())) {
                            list.add(spot[i].num.toString())
                        }
                    }
                    if (list.isNotEmpty()) println(list.joinToString(", "))
                    else println("No cars with registration number ${str[1].toUpperCase()} were found.")
                }
            }
        }
    }
}