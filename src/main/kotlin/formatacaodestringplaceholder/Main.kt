package formatacaodestringplaceholder

import java.util.*

fun main() {
    val name = "John"
    println(name)

    println("Hello, $name")

    println("Hello, %s %s".format(name, name))
    // Placeholder

    // %s - String
    // %d - Int
    // %f - Float
    // %c - Char
    // %b - Boolean

    val value = 5
    val salary = 16855.95

    println("Value: %d - Salary: %f".format(value, salary))
    println("Value: %02d - Salary: %.2f".format(Locale.US,value, salary))

}