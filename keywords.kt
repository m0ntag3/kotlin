// Open keyword
// Allow the parent class to be able to share its props and fxns with the child class.
// Removes parent class from the final state.

open class Car(){
    // Props
    val age = "new"
    val color = "dark emrald"

    // Behaviours
    open fun drive(){
        println("The car can drive at a top speed of 420km/h")
    }
    open fun brake(){
        println("The car can brake from 100km/h in 2.4 seconds covering 32 meters")
    }
}

class Chiron : Car(){
    fun luxury(){
        println("Bugatti is kinda luxurious but mainly sporty")
    }
    fun aero(){
        println("Bugatti is highly aerodynamic allowing it to reach top speeds of either 420 or 490.48km/h")
    }
}

// Override keyword
// Used by child class to tell the compiler about its intent to provide a specific implementation  for a member existing in the parent class.
// Overriding can be done on a val prop by a var only (Subclass can add a setter to a prop that only had a getter in the parent, but it cannot remove a setter that the parent already promised).
open class Shape(){
    open fun draw(){
        println("Drawing a generic shape")
    }
}

class Polygon : Shape(){
    override fun draw(){
        println("Drawing a polygon")
    }
}
// To stop further subclasses from overriding a method, you can mark the override as final
open class IDE(){
    open fun instance(){
        println("IntelliJ IDEA")
    }
}

class Examples : IDE(){
    override final fun instance(){
        println("Android Studio")
    }
}
// Super keyword
// Refers to the immediate parent class of current class
// Used to call a parent’s function, property, or constructor that has been overridden in the child class.
// Used when one has overridden a method but still wants the original logic from the parent to run
open class Robot {
    open fun move(){
        println("The robot moves in all directions.")
    }
}
class CombatRobot : Robot(){
    override fun move(){
        super.move()
        println("The robot also scans for targets.")
    }
}

fun main() {
    // Objects
    var myCar = Chiron()
    var myShape = Shape()
    val myBot = CombatRobot()
    var myIDE = IDE()

    // calling the functions
    myCar.brake()
    myCar.aero()
    myBot.move()
    myShape.draw()
    myIDE.instance()
}