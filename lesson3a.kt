fun main() {
    // looping structures
    // For loop
        // used to execute a block of code/ statement a number of times until a condition is met.

        for (number in 1..10){
            println("The count is: $number")
        }

        println("==================")

        // A for loop able to print from 50 to 65
        for (num in 50..65){
            println("The count is: $num")
        }

        println("==================")

        // Incrementing for loop using steps
        for (n in 20..40 step 2){
            // println(n)
            println("$n")
        }

        println("==================")

        // odd numbers in the range given
        for (y in 20..40 ){
            if (y % 2 != 0){
                println("$y")
            }
        }

        println("==================")

        // Factorial - Product of all positive integers from 1 to the specified number, e.g number =  x factorial => 1 * 2 * 3 * ... * x

        // for loop generating the multiplication table of 5 from 1 to 5
        for (z in 1..5){
            var r = 5
            var product = r * z

            println("$r * $z = $product")
        }

        println("==================")

        // A program able to find the factorial of number 5
        val h = 5
        var factorial = 1

        for (u in 1..h){
            factorial *= u
        }
        println("Factorial of $h is $factorial")

        println("OOOOOOOOOORRRRRRRRRRRR")
        var fact = 1
        for (i in 1..5){
            fact = fact * i
        }
        println("Factorial of 5 is $fact")

}
