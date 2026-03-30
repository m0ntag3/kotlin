fun main(){
    val counties = arrayOf("Kisumu", "Nairobi", "Mombasa", "Nakuru", "Nandi", "Turkana", "Kiambu")

    for (county in counties) {
        if(county == "Nairobi" || county == "Kisumu"){
            print("$county ")
        }
    }
}