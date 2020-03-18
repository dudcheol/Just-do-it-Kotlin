import java.util.*
import kotlin.collections.HashSet

fun main() {
    val scanner = Scanner(System.`in`)

    for (i in 1..4) {
        loop@ for (j in 1..3) {
            for (k in 1..2) {
                if (i == 2 || j == 3 || k == 2) break@loop // loop를 종료
                print("$k")
            }
        }
    }

    // 단어를 읽고 이 단어에 없는 글자를 모두 인쇄하는 프로그램을 쓰세요. 소문자만 계산된다.
    val word = scanner.nextLine()
    for (i in 'a'..'z') {
        if (word.contains(i)) {
            continue
        }
        print(i)
    }

    // 단어를 읽고 첫 번째 숫자를 인쇄하는 프로그램을 작성하십시오. 단어에 적어도 한 자리가 있다는 것을 보증한다.
    val  word2 = scanner.nextLine()
    for(i in word2){
        if (i.isDigit()){
            print(i)
            break;
        }
    }

    // 배틀쉽 게임의 작은 버전을 만들어 보자. 5행(X)과 5열(Y)의 필드가 있고,
    // 총 25개의 셀이 있다. 1셀 크기의 선박 3척의 좌표(X, Y)를 읽고 새 선박에 사용할 수 있는 모든 행(X)과 열(Y)을 인쇄하는 프로그램을 작성한다.
    // 비어 있는 줄과 열에만 새 배를 배치할 수 있다는 뜻이다.
    // 모든 입력 좌표는 공간과 분리되어 있다. 동일한 방법으로 출력을 분리하십시오. 행(X)과 열(Y)을 서로 다른 두 행으로 인쇄하십시오.
    val space = Array(6, { BooleanArray(6) }) // 2차원배열 선언방법
    val nums = scanner.nextLine().split(" ")
    for (i in 0..nums.lastIndex step 2) {
        // i = 행
        for(k in 1..5){
            space[nums[i].toInt()][k] = true
        }
        // i+1 = 열
        for(k in 1..5){
            space[k][nums[i+1].toInt()] = true
        }
    }

    val row = HashSet<Int>()
    val col = HashSet<Int>()

    for(i in 1..5){
        for(j in 1..5){
            if(!space[i][j]){
                row.add(i)
                col.add(j)
            }
        }
    }
    row.sorted()
    col.sorted()

    for(i in row) {
        print("$i")
        if(!(i==row.last())) print(" ")
        else println()
    }

    for(i in col) {
        print("$i")
        if(!(i==col.last())) print(" ")
        else println()
    }
}