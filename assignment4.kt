import kotlin.math.pow
fun main(){
// A function accepting a parameter able to do the convertion of degrees celcius into Fahrenheit
    fun deg(celcius : Double ){
        
        var fahrenheit = (celcius * 1.8) + 32

        println("$celcius degrees celcius is equal to $fahrenheit fahrenheit")
    }
    deg(37.5)

        println("=============================")

    // Function able to calculate the compound interest of a person
    fun CI(principle : Int, rate : Double, time : Double){
         var compoundinterest = principle * ((1 + (rate/100)).pow(time))

        println("The compound interest is: Ksh. $compoundinterest")
    }
    CI(40000,3.5,2.0)
}