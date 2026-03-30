fun main() {
// Since an array onlt allows a single type of data to occupy the array one uses Array<Any> as the specified data type.
// e.g
val persondetails : Array<Any> = arrayOf("Terry", 21)
println(persondetails.joinToString())
}