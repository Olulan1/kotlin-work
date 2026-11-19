// Task 5.3.2: rollDice() function
import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDice(side: Int = 6, dieCount: Int = 1) {
	var sumTotal = 0; var sides = 6
	var sideCheck = true
	var result = 0
	if (side in setOf(4, 6, 8, 10, 12, 20, 100)) {
		sideCheck = true
	} else {
		sideCheck = false
	}
	if (sideCheck == false) {
		println("Error: cannot have a $side-sided die, rolling a d6 die instead.")
	} else {
		sides = side
	}
	for (i in 0..dieCount-1) {
		println("Rolling a d$sides...")
		result = Random.nextInt(1, sides + 1)
		println("You rolled $result, adding to sum!")
		sumTotal = sumTotal+result	
	}
	println("Sum total is: $sumTotal")
}
