package funcoesdestring

fun main() {

    val sentence = "Kotlin programming"

    // index - 0
    println(sentence[0])
    println(sentence.length)
    println(sentence.startsWith("Kot"))
    println(sentence.endsWith("."))

    println(sentence.substring(7))
    println(sentence.substring(7, 12))
    println(sentence.replace("i", "1"))

    println(sentence.uppercase())
    println(sentence.lowercase())
    println(sentence.contains("Kotlin"))

    sentence.isEmpty()
    println("      this removes blanks from the start and end     ".trim())
}