fun main() {
    // Arrays
    // Collection of items that are related in nature.
    // To access an item in an array use the index starting from index 0.
    // to create an array use the arrayOf function/ method.

    val numbers = arrayOf(25, 54, 54, 32, 74, 36, 74, 31)
    // When the variable is printed
    println(numbers) //The output will be the location on storage holding the array([Ljava.lang.Integer;@18b4aac2) instead of the contents of the array.
    println(numbers.contentToString()) // gives the items in a list
    println(numbers.joinToString())  // Gives  the items within the array only

    // Printing item on index three
    println("The number in index three is:" + numbers[3])

    
}