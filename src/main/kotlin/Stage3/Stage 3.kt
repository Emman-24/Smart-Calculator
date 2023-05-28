package Stage3

import kotlin.system.exitProcess

fun main() {
    while (true) {
        val input = readln().trim()
        processInput(input)
    }
}

fun processInput(input: String) {
    when {
        input.isBlank() -> return
        input == "/exit" -> exitProgram()
        input == "/help" -> help()
        else -> sumCalculation(input)
    }
}

fun sumCalculation(input: String) {
    val sum = input.split(" ").sumOf { it.toInt() }
    println(sum)

}

fun exitProgram() {
    println("Bye!")
    exitProcess(0)
}

fun help() {
    println("The program calculates the sum of numbers")
}