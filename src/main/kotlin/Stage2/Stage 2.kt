package Stage2

import kotlin.system.exitProcess

fun main() {
    while (true) {
        val input = readLine()!!.trim()
        when {
            input.isBlank() -> continue
            input == "/exit" -> exitProgram()
            else -> getNumbers(input.split(" ").mapNotNull { it.toIntOrNull() })
        }
    }
}

fun getNumbers(listNum: List<Int>) {
    when(listNum.size){
        1 -> println(listNum[0])
        2 -> println(sumNumbers(listNum[0], listNum[1]))
    }
}

fun sumNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun exitProgram() {
    println("Bye!")
    exitProcess(1)

}

