fun main() {
    // Below is a function able to add two numbers
    fun addition(){
        var number1 = 10
        var number2 = 20
        var sum = number1 + number2

        println("The sum of the numbers is:" + sum)
    }
        // println("Same output with")
        // println("The sum of the numbers is: $sum")

    addition()
    println("=====================")
    // Function able to multiply three numbers
    fun multiply(){
        var num1 = 3
        var num2 = 9
        var num3 = 5
        var product = num1 * num2 * num3

        println("The product of the numbers is: $product")
    }
    

    multiply()
    println("=====================")
    // Function that is able to find the largest and the smallest of the numbers
    fun size(){
    var x = 8
    var y = 6

    if (x > y){
        println("Biggest : $x")
        println("Smallest : $y")
    }
    else if (y > x) {
        println("Biggest : $y")
        println("Smallest : $x")
    }
    else{
        println("The numbers $x and $y are equal")
    }
    }

    size()
    println("=====================")
    // function to convert minutes to hours
    fun time(){
    var minutes = 179
    var hrmins = 60
    var hour = minutes / hrmins
    var rem = minutes % hrmins

    print("$minutes is equal to $hour hours and $rem minutes")
    }

    time()
}