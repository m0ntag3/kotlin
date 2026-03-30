fun main(args: Array<String>) {
    // Looping from a higher number to a lower number using for loop

    // Program able to countdown from 10 to 1
    for (x in 10 downTo 1){
        println("$x")
    }

    println("==================")

    // A program finding the odd number from 20 to 10
    for (y in 20 downTo 10){
        if (y % 2 != 0){
            println("The number $y is an odd number")
        }
    }
}