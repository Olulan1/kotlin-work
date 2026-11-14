// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
import kotlin.String

fun main(args: Array<String>) {

    if (args.size == 3) {
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
    		var semiperimeter = 0.5; var area = 1.0
    		semiperimeter = semiperimeter*(arr[0]+arr[1]+arr[2])
    		for (i in 0..2) {
    			arr[i]=semiperimeter-arr[i]
    			area = area*arr[i]
    		}
    		area*=semiperimeter
    		area = sqrt(area)
    		if (area < 0) {area = area * -1}
    		var look = String.format("Area: %.5f",area)
    		look = look.trim()
    		print(look)
    	}

    } else {
    	println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }


}
