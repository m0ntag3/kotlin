class  Person{
    // attributes/ xtics/ props of a person
    var name = "Kendrick"
    var age = 24
    var weight = 65
    var height =1.78

    // Behaviours/ actions
    fun walk(){
        println("The person can walk")
    }
    fun speak(){
        println("The person can speak")
    }
    fun play(){
        println("The person can play")
    }
    fun learn(){
        println("The person can learn")
    }
}

fun main() {
    // Object is a real-world thing
    // An object is instantiated/ obtained from/ emanated from created from class
    // For accessibility of the props/ behaviours of class we require to have an onject.

    // Below is the created object
    var myObject = Person()

    // Below we use the dot separator to access either the function or the properties.
    myObject.walk()
    myObject.learn()
    myObject.play()

    println("The age of the person is: "+ myObject.age)
    println("The weight of the person is: "+myObject.weight)
    println("The height of the person is: " +myObject.height)
    
}