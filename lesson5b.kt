
class Circle{
    // Properties
    var radius = 7
    var pie = 3.14
    var diameter = 14

    // Behaviours
    fun circleArea(){
        val areaOfCircle = pie * radius * radius

        println("The area of the cirle is: " + areaOfCircle)
    }
    fun circleCircumference(){
        val circumference = 2 * pie * radius

        println("The circumference of the circle is: " + circumference)
    } 
}

// Class for a rectangle, finding the area and perimeter of rectangle
class Rectangle{
    // Props
    var length = 40
    var width = 20

    // Behaviours
    fun rectangleArea(){
        var areaOfRectanlge = length * width

        println("The area of the rectangle is: " + areaOfRectanlge)
    }

    fun rectanglePerimeter() {
        var perimeterOfRectangle = 2 * (length + width)

        println("The perimeter of the rectangle is: " + perimeterOfRectangle)
    }

}


fun main() {
    // Below is our object
    var myCircle = Circle()
    var myRectangle = Rectangle()

    myCircle.circleArea()
    myCircle.circleCircumference()

    myRectangle.rectangleArea()
    myRectangle.rectanglePerimeter()
}
