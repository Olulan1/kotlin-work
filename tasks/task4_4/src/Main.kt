// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {

    if (args.size == 3) {
    	println(args[0])
    	val arr = arrayOf(0.0,0.0,0.0)
    	var threeDoubles = true
    	for (i in 0..2) {
    		try {
            		val parsedDouble = args[i].toDouble()
	        /*println("The parsed double is $parsedDouble")*/
		        arr[i] = parsedDouble
       		} catch (nfe: NumberFormatException) {
       			println("Cannot be made to double.")
       			threeDoubles = false
       		 }	
    	}
    	if (threeDoubles == true) {
    		// table initialisation
    		val t = Terminal()
    		t.println(table {
			header { row("Celsius", "Fahrenheit") }
			
		
    	
	    		val initial = arr[0]
	    		val max = arr[1]
	    		val increment = arr[2]
	    		var overFlow = false
	    		var indexLocation = initial
	    		var convertedResult = 0.0
	    		while (overFlow == false) {
	    			println(indexLocation)
	    			if (indexLocation > max) {
	    				overFlow = true
	    				indexLocation-=increment}
	    			else {
	    				convertedResult = ((indexLocation * 9) / 5) +32
	    				body { row(indexLocation, convertedResult) }
	    				indexLocation = indexLocation+increment
	    				
	    				}
	    		}
	    		println("Final value was: $indexLocation")
	    		println("Max value was: $max")
	    	})
	}
    		
    	
    	
    } else {
    	println("Error: 3 (spaced) values required on command line")
        exitProcess(1)
    }


}
