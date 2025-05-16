package criacaodefuncoes

fun helloWorld(){
    println("Hello World")
}

fun helloPerson(name: String){
    println("Hello $name !")
}

fun medium(numberOne: Int, numberTwo: Int): Int {
    val medium = (numberOne + numberTwo) / 2
    return medium
}

fun main() {
    helloWorld()
    helloPerson("Shiranui")
    println(medium(10, 8))
}