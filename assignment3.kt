fun main() {
    for (year in 2000..2025){
        println(year)
    }

    println("================")

    for (n in 100 downTo 1){
        println("$n")
    }

    // for loop creating an array of 7 counties and loop through them
    val counties = arrayOf("Kisumu", "Nairobi", "Mombasa", "Nakuru", "Nandi", "Turkana", "Kiambu")

    for (county in counties){
        println(county)
    }
}