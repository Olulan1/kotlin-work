// Task 5.3.1: rollDie() function
import kotlin.random.Random

fun rollDie(sides: Int) {

    if (sides in setOf(4, 6, 8, 10, 12, 20, 100)) {

        println("Rolling a d$sides...")

        val result = Random.nextInt(1, sides + 1)

        println("You rolled $result")

    }

    else {

        println("Error: cannot have a $sides-sided die, rolling a d6 die instead.")
	val result = Random.nextInt(1, 6 + 1)

        println("You rolled $result")

    }

}
