package controledefluxoifelse

fun ofLegalAge(age: Int) : Boolean {
    if (age >= 18) {
        return true
    } else {
        return false
    }
}

fun ofLegalAge2(age: Int): Boolean {
    return (age >= 18)
}

fun ofLegalAge3(age: Int) : Boolean = (age >= 18)

// geography - 500
// mathematics - 600

fun courseFee(course: String): Double {
    if (course == "geography") {
        return 500.0
    } else {
        return 600.0
    }
}

fun courseFee2(course: String): Double {
    if (course == "geography") {
        return 500.0
    } else if (course == "mathematics") {
        return 600.0
    } else {
        return -1.0
    }
}

fun courseFee3(course: String): Double {
    var tuition = -1.0

    if (course == "geography") {
        tuition = 500.0
    } else if (course == "mathematics") {
        tuition = 600.0
    }

    return tuition
}


fun main() {

    println(ofLegalAge(20))
    println(ofLegalAge2(15))
    println(ofLegalAge3(18))
    println(courseFee("geography"))
    println(courseFee2("mathematics"))
    println(courseFee3("english"))






}