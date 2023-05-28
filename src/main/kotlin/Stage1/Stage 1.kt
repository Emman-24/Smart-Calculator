package Stage1

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }
    val firstNumber = numbers[0]
    val secondNumber = numbers[1]
    println(sumNumbers(firstNumber,secondNumber))
}

fun sumNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}