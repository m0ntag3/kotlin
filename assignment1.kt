// // Addition program
// fun main() {
// val number1 : Int = 23
// val number2 : Int = 17

// var sum : Int = number1 + number2
//     println(sum)
// }

// // Subtraction program
// fun mains() {
// val number3 : Int = 78
// val number4 : Int = 35

// var sub : Int = number3 - number4
//     println(sub)
// }

// The "Start Button"
fun main() {
    println("Starting the program...")
    
    // Calling the functions
    addNumbers()
    subtractNumbers()
    averaging()
    adult()
    whexp()
}

fun addNumbers() {
    val number1 : Int = 23
    val number2 : Int = 17
    val sum = number1 + number2
    println("Addition: $sum")
}

fun subtractNumbers() {
    val number3 : Int = 78
    val number4 : Int = 35
    val sub = number3 - number4
    println("Subtraction: $sub")
}

// The $sum/ $sub is a feature called STRING TEMPLATE.
// Writing $sum/ $sub is STRING INTERPOLATION.
    // $ - A trigger telling the compiler that the text that foolows is a variable name and not just plain text(string).
    // variable name(sum/ sub) - the data source that is looked back by Kotlin in order to find val sum = 40/ val sub = 43.
    // the result on the Teminal is the actual calculated answer replacing the $... placeholder.

// Conditional statements in Kotlin
    // IF statement/ expression
        // Statement

fun averaging() {
    val mark : Int = 89
    if (mark >= 50) {
        println("Above average")
    }
    else{
        println("Below average")
    }
}

        // Expression
fun adult() {
    val age : Int = 19
    val adult = if (age >= 18) "Adult" else "Child"
}

    // When expression
        // Doesn't need 'break' since it automatically stops after a match is found.
        // Handles multiple conditions as commas are used to group the conditions.
        // Uses in keyword for Ranges.
        // Uses is keyword to check for specific datatypes.

fun whexp() {
    val x = -11

    when (x) {
        1 -> println("x is 1")
        2, 3 -> println("x is 2 or 3")
        in 4..10 -> println("x is between 4 and 10")
        is Int -> println("x is an integer")
        else -> println("None of the above")
    }
}