fun main() {
    //  Variable - A container storing data/ values.
    // Initializers they are divided into two in Kotlin i.e:
        // val -  (used in equialence to const). It's immutable/ unchangable.
        // var -  (used in equialence to let). It's mutable/ changable.

        val name = "Collins Paul Kirira Kumina" // String - A series of characters inside qoutes.
        val number1 = 5 // Interger - A whole number
        val number2 = 40.6 // Double - A number with a decimal.

        var letter = "K" // Char - A single letter of the alphabet

        val isRegistered = true // Boolean - Evaluates to either true or false.

        println(name)
        println(number1)
        // println - prints the vars/ vals on their own lines.
        // print - prints the vars/vals on the same line/ side by side
        println(number2)
        println(letter)
        println(isRegistered)

        // When the datatype is not declared by the user, Kotlin allocates each datatype equal amounts of space therefore misusing the available storage space on the machine.
}