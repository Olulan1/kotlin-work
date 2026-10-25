// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
	var x = ""
	var y = ""

	if (args[0] && !(args[1])) {
		x = args[0]
		print(x)
	} else if (args[0] && args[1] ) {
		x = args[0]
		y = args[1]
		print(x)
		print(y)
	} else {
		println("Error: filename required as sole argument")
	        exitProcess(1)
	}
    // required argument available here, as args[0]
    // Why's there a time limit?
    
}
