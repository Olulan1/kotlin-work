// Task 4.3: 
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size == 3) {
        println("You have 3 args")
    } else if (args.size == 2) {
    	println("You have 2 args")
    } else if (args.size == 1) {
    	println ("You have 1 arg")
    } else {
    	println("You have failed args.")
    }
    
    if ((args[0] != null) && (args[1] != null) && (args[2] != null)) {
    	println(args[0])
    	for (i in 0..2) {
    		try {
            		val parsedInt = args[i].toInt()
		        println("The parsed int is $parsedInt")
       		} catch (nfe: NumberFormatException) {
       			println("Cannot be made to int.")
       		 }	
    	}
    } else {
    	println("Error: 3 integer values required on command line")
        exitProcess(1)
    }

}
