// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
	var x = ""
	var y = ""
	
	if (args.size != 1) {
		println("Error: filename required as sole argument")
	        exitProcess(1)
       } else if (args.size == 2) {
       		x = arg1
       		y = arg2
       		println(x)
       		println(y)
	} else if (args[0]) {
		exitProcess(1)
	}
    // required argument available here, as args[0]
    // Why's there a time limit?
    
}
