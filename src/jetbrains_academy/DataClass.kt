package jetbrains_academy

import java.util.Scanner

//do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    //implement your code here
    val nums = input.nextLine().split(" ")

    val box1 = Box(nums[0].toInt(), nums[1].toInt(), nums[3].toInt())
    val box2 = box1.copy(length=nums[2].toInt()) /* .copy 유용할듯! */

    println(box1)
    println(box2)
}

/* override toString,equals 등 유용한 것 많다! */