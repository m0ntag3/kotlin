fun main() {
    short()
    long()
}

fun short(){
    var points = -10000

    if (points in 0..100){
        println("You do not quality")
    }
    else if (points in 101..400) {
        println("You Win a Smartphone")
    }
    else if (points in 401..1000) {
        println("You win a Laptop")
    }
    else if (points > 1000) {
        println("You win a Trip to Canada")
    }
    else{
        println("Invalid")
    }
}

fun long(){
    var points = -700

    if (points >= 0 && points <= 100){
        println("You do not quality")
    }
    else if (points >= 101 && points <= 400){
        println("You Win a Smartphone")
    }
    else if (points >= 401 && points <= 1000){
        println("You win a Laptop")
    }
    else if (points >= 1001){
        println("You win a Trip to Canada")
    }
    else{
        println("Invalid")
    }
}