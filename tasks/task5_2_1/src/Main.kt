// Task 5.2.1: main program
// 
    		
import kotlin.random.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {
	if (args.size == 1) {
		// println(args[0])
    		val arr = arrayOf(0.0)
    		var word = true
		try {			
	    		var parsedDouble = args[0].toDouble()
	       		/*println("The parsed double is $parsedDouble")*/
			arr[0] = parsedDouble
		} catch (nfe: NumberFormatException) {
       			println("Cannot be made to double.")
       			word = false
       		 }
       		 if (word == true) {
       		 	var area = circleArea(arr[0])
       		 	var perimeter = circlePerimeter(arr[0])
       		 	var look = String.format("%.4f",area)
    			look = look.trim()
       		 	println("Circle area: $look")
       		 	look = String.format("%.4f",perimeter)
       		 	println("Circle perimeter $look")

       		}
	} else {
		exitProcess(1)
	}
}
