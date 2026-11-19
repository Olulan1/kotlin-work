// Task 5.3.1: main program
import kotlin.random.Random
import kotlin.system.exitProcess
fun main(args: Array<String>) {
	val iteration = args.size
	val index = iteration-1
	
	if (iteration > 0) {
		val arr = arrayOf(0)
    		var xVals = true
		for (i in 0..index) {
			println("Index: $i")
			var parsedVal = 0
			try {
				parsedVal = args[i].toInt()
				arr[0] = parsedVal
			} catch (nfe: NumberFormatException) {
				xVals = false
			}
			if (xVals == true) {
				rollDie(parsedVal)
			} else {
				rollDie(0)
			}
			xVals = true
		}
	}
	else {
		println("No Integer entered! Integer required on command line!")
		exitProcess(1)
	}
}
