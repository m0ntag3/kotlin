// pg. 26
// A program using If statement to find if a given year is a leap year or not
fun main(){

    leap()
    num()
}

fun leap(){
    val year = 2006

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("The year $year was a leap year")
    }
    else{
        println("The year $year was an ordinary(non-leap)year")
    }
}

//  A program checking whether a number is even or odd
fun num() {
    val numeral = 10

    if (numeral % 2 == 0){
        println("This is an even number")
    }
    else{
        println("This is an odd number")
    }
}
// Looping structures in Kotlin

// Array in Kotlin