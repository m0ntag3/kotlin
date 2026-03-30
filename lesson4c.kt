fun main() {
    // Functions with parameters
    // Parameters are inputs that get passed as arguments when invoking functions.
    // NOTE: For parameters to work their datatypes must be specified

    fun greeting(name : String) {
        println("Hello there $name , hope you had a nice day")
    }
    // When function is invoked, the name is passed as an argument.

    greeting("Richardo")
    greeting("Lecler")

    println("=============================")

    // An example of a function able to calculate the BMI of a person
    fun BMI(weight: Double, height : Double) {
        val ans = weight / (height * height)

        println("The BMI of the person is: " + ans)
    }
    BMI(78.8, 1.58)
    BMI(62.5, 1.75)

    println("=============================")
    // Function accepting parameters and checks whether a given number is odd or even.
    fun parity(x : Int) {
        if (x % 2 == 0) {
            println("The number $x is even")
        }
        else{
            println("The number $x is odd")
        }
    }
    parity(5)
    parity(8)

    println("=============================")

}