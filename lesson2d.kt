fun main() {

    meaning()
    averaging()
}

fun meaning(){
    val marks = -20

    if (marks in 0..29){
        println("You Failed")
    }
    else if (marks in 30..50) {
        println("Average")
    }
    else if (marks in 51..70) {
        println("Above Average")
    }
    else if (marks in 70..100){
        println("You Passed")
    }
    else{
        println("Invalid score")
    }
}

fun averaging() {
    val marks = -20

    if (marks < 0 || marks > 100) {
        println("Invalid score")
    }
    else if (marks > 0 && marks <= 30){
        println("You Failed")
    }
    else if (marks > 30 && marks <= 50){
        println("Average")
    }
    else if (marks > 50 && marks <= 70){
        println("Above Average")
    }
    else{
        println("You Passed")
    }
    
}