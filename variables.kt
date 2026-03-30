fun main() {
    accessibility1()
    accessibility2()
    calculateTotal()
}

    // Global Variables (Top-level Properties)- Declared outside of any class/functions, usually at the very top of the file. It is "public" and can be accessed from anywhere in the file.
        // Scope: Accessible from anywhere in the same package (and other packages if marked public).
        // Lifetime: They live as long as the application is running.
        // Usage: Best for constants or configuration settings that the entire app needs to know.

        // e.g
        // Global Variable (Top-level)
    val platformName = "Android" 

    fun accessibility1() {
        println(platformName) // Accessible here
    }

    fun accessibility2() {
        println(platformName) // Also accessible here
    }

    // Local Variables - Declared inside a block of code, such as a function, a for loop, or an if statement.
        // Scope: Only visible within the curly braces { } where they are defined.
        // Lifetime: They are created when the function is called and "die" (cleared from memory) as soon as the function finishes.
        // Usage: Best for temporary data, like calculations or loop counters.

        // e.g
fun calculateTotal() {
    val taxRate = 0.16 // Local variable
    println(taxRate) 
}

// println(taxRate) // ERROR: taxRate is not visible outside the function
