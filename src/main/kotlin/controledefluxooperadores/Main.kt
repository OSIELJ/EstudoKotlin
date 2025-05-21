package controledefluxooperadores

fun main() {

    // ()
    // !
    // &&
    // ||
    // if (n in 1..50)  range
    // <, >


    val a = false
    val b = false
    val c = true
    val d = true

    if (a && b || c && d){
        println("true")
    }

    val value1 = 10
    val value2 = 15

    if (value1 > value2){
        println("greater")
    }else{
        println("lower")
    }
}