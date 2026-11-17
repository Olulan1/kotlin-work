// Task 5.1.1: main program
import kotlin.random.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {
	if (args.size == 2) {
		// println(args[0])
    		val arr = arrayOf("","")
    		var twoWords = true
		try {
			for (i in 0..1) {
		    		var parsedString = args[i]
		       		/*println("The parsed double is $parsedDouble")*/
				arr[i] = parsedString
		        }
       		} catch (nfe: NumberFormatException) {
       			println("Cannot be made to double.")
       			twoWords = false
       		 }
       		 if (twoWords == true) {
       		 	var x = anagrams(arr[0],arr[1])
       		 	println("Anagrams: $x")
       		}
	} else {
		exitProcess(1)
	}
}
