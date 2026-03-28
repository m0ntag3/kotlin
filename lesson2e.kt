// When statement - Equivalent to switch case in other languages where it checks a value against multiple conditions and executes the matching block.

fun main() {
    val marks = 70 

    when (marks){
        in 1..30 -> println("You Failed")
        in 31..50 -> println("Average")
        in 51..70 -> println("Above Average")
        in 71..100 -> println("You Passed")
        else -> ("Invalid score...!")
    }
}