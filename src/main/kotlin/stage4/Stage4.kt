package stage4

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
        else -> calculateExpression(input)
    }
}

fun calculateExpression(expression: String) {
    val num = expression.replace("+", "")
        .replace("- ", "-")
        .replace("--", "")
        .replace("  ", " ")
        .split(" ")
    println(num.sumOf { it.toInt() })
}

fun exitProgram() {
    println("Bye!")
    exitProcess(0)
}

fun help() {
    println("The program calculates the sum of numbers")
}