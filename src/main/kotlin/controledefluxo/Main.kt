package controledefluxo

fun isInTheMorning(morning: Boolean){
    if (morning){
        println("Wake up!!")
    }
}



fun main() {

    isInTheMorning(true)
    isInTheMorning(false)

    val str = "kotlin programming"
    if (str.contains("kotlin")){
        println("Contains kotlin")
    }
}