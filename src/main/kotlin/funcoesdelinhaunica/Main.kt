package funcoesdelinhaunica

fun helloPerson(name: String) = println("Hello $name!!")

fun medium(numberOne: Int, numberTwo: Int): Int = (numberOne + numberTwo) / 2

fun sum(numberOne: Int, numberTwo: Int) =  numberOne + numberTwo

fun main() {

    helloPerson("Shiranui")
    println(medium(10, 8))
    println(sum(2,2))

}