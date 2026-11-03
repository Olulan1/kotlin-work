// Task 4.3: 
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    
    if (args.size == 3) {
    	println(args[0])
    	val arr = arrayOf(0,0,0)
    	for (i in 0..2) {
    		try {
            		val parsedDouble = args[i].toDouble()
            		val parsedInt = parsedDouble.roundToInt()
		        /*println("The parsed int is $parsedInt")*/
		        arr[i] = parsedInt
       		} catch (nfe: NumberFormatException) {
       			println("Cannot be made to int.")
       		 }	
    	}
    	for (i in 0..2) {
    		val grade = arr[i]
    		println("Grade is "+grade)
    		when (grade) {
    			in 70 .. 100 -> println("Distinction")
    			in 40 .. 69 -> println("Pass")
    			else -> println("Fail")
    		}
    	}
    } else {
    	println("Error: 3 (spaced) values required on command line")
        exitProcess(1)
    }

}
