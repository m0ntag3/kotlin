fun main(){
    val states = arrayOf("Kisumu", "Nairobi", "Mombasa", "Nakuru", "Nandi", "Turkana", "Kiambu")

    for (index in states.indices) {
        if (index == 0 || index == 1) {
            print("${states[index]} ")
        }
    }
}
