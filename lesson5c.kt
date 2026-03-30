//  Inheritance is where the child class obtains the props and the behaviours of another class (Parent Class)

open class Animal{
    // Props
    var name = "Name"

    // Behaviours
    fun walk(){
        println("The animal can walk")
    }
    fun sleep(){
        println("The animal can sleep")
    }
}

// Below class inherits from the super/ parent class Animal
class Dog : Animal(){
    fun bark(){
        println("The dog likes to bark")
    }
}

fun main() {
    // An object
    var myDog = Dog()

    // Accessing the behaviours of the dog
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}
