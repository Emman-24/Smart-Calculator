package stage5

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
        input.startsWith("/") -> {
            when (input) {
                "/exit" -> exitProgram()
                "/help" -> help()
                else -> println("Unknown command")
            }
        }

        else -> sumAndSubtraction(input)
    }
}

fun sumAndSubtraction(expression: String) {
    if (!isValidExpression(expression)) {
        println("Invalid expression")
        return
    }
    val num = expression.replace("+", "")
        .replace("- ", "-")
        .replace("--", "")
        .replace("  ", " ")
        .split(" ")
    println(num.sumOf { it.toInt() })
}

fun isValidExpression(expression: String): Boolean {
    val regex = Regex("^[+-]*[0-9]+( (([+\\-])+) -?[0-9]+)*\$")
    return expression.matches(regex)
}

fun exitProgram() {
    println("Bye!")
    exitProcess(0)
}

fun help() {
    println("The program calculates the sum and the subtractions of numbers")
}
