// Task 5.1.2: main program
import kotlin.random.Random

fun main() {
    for (i in 0..10) {
    	var seed = Random.nextInt(0,100)
    	rollDie(seed)
    }
}
