// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
	var oneInt = true
	val arr = arrayOf(0)
	try {
    		val parsedInt = args[0].toInt()
       /*println("The parsed int is $parsedInt")*/
		arr[0] = parsedInt
	} catch (nfe: NumberFormatException) {
		println("Cannot be made to int.")
		oneInt = false
	 }	
	if (oneInt == true) {
		val limit = arr[0]
		var sum = 0
		var index = 0
		for (i in 1..limit step 2) {
			sum+=i
			index+=1
			println("Value "+"$index"+": $i")
		}
		println("Sum is: $sum")
		
	}
	else {
		println("Error: 1 integer value required on command line")
		exitProcess(1)
	}
}
