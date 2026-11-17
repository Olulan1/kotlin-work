import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.system.exitProcess
import kotlin.math.roundToInt
import kotlin.random.Random

fun rollDie(sides: Int) {

    if (sides in setOf(4, 6, 8, 10, 12, 20, 100)) {

        println("Rolling a d$sides...")

        val result = Random.nextInt(1, sides + 1)

        println("You rolled $result")

    }

    else {

        println("Error: cannot have a $sides-sided die")

    }

}

fun main(args: Array<String>) {
	rollDie(100)
}

/*
class WorldTest {
    @Test
    fun doTest() {
        assertEquals("World", World.get())
    }

    @Test
    fun shouldFail() {
        assertTrue(false)
    }

}*/
