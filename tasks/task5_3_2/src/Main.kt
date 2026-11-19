// Task 5.3.2: main program
import kotlin.random.Random
import kotlin.system.exitProcess


fun main(args: Array<String>) {
	val iteration = args.size
	val index = iteration-1
	println("Test0")
	rollDice()
	println("Test1")
	rollDice(4,5)
	println("Test2")
	rollDice(side=2,6)
	println("Test3")
	rollDice(1,dieCount=2)
	println("Test6")
	rollDice(dieCount=1,side=2)
	println("Test7")
	rollDice(side=8,dieCount=2)
	println("User input test")
	
	if (iteration > 0) {
		val arr = arrayOf("")
    		var xVals = true
		var parsedVal = ""
		try {
			parsedVal = args[0]
			arr[0] = parsedVal
		} catch (nfe: NumberFormatException) {
			xVals = false
		}
		if ((xVals == true) && (parsedVal.contains("d") == true)) {
			var sidesDice = parsedVal.split('d')
			println(sidesDice)
			var parsedInt = 0
			var intArr = arrayOf(0,0)
			for (i in 0..1) {
				try {
					parsedInt = sidesDice[i].toInt()
					intArr[i] = parsedInt
				} catch (nfe: NumberFormatException) {
					if (i == 0) {intArr[i] = 1}
					else {intArr[1] = 6}
				}
			}
			var conCat = rollDice(intArr[1], intArr[0])
		} else {
			println("Test failed")
		}
		
	} else {
		println("No Integer entered! Integer required on command line!")
		exitProcess(1)
	}
}
