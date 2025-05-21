package controledefluxooperadores

fun main() {

    // ()
    // !
    // &&
    // ||

    val a = false
    val b = false
    val c = true
    val d = true

    if (a && b || c && d){
        println("true")
    }

    val value1 = 10
    val value2 = 15

    if (10 > 15){
        println("greater")
    }else{
        println("lower")
    }
}