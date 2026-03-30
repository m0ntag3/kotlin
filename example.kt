fun main() {
    range()
    ifuse()
    withIndex()
}


fun range() {
    val counties = arrayOf("Kisumu", "Nairobi", "Mombasa", "Nakuru", "Nandi", "Turkana", "Kiambu")

    for (county in 0..1){
        println(counties[county])
    }
}


fun ifuse() {
    val states = arrayOf("Kisumu", "Nairobi", "Mombasa", "Nakuru", "Nandi", "Turkana", "Kiambu")

    for (state in states.indices){
        if (state == 0 || state == 1) {
            println(states[state])
        }
    }
}


fun withIndex() {
    val districts = arrayOf("Kisumu", "Nairobi", "Mombasa", "Nakuru", "Nandi", "Turkana", "Kiambu")

    for ((index, value)in districts.withIndex()){
        if (index in 0..1){
            println("Index $index is $value")
        }
    }
}
    