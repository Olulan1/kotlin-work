import kotlin.random.Random
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
// expression body
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}
// block body
fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

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

fun main() {
    println("Hello, ${World.get()}!")
    rollDie(100)
    println(circleArea(4.0))
}

/*
New template
import kotlin.random.Random
import kotlin.system.exitProcess
fun main(args: Array<String>) {
	val iteration = args.size
	
	if (iteration > 0) {
		for (i in 0..iteration) {
			try {
			} catch (nfe: NumberFormatException) {
			
			}
		}
	}
	else {
		println("No grades entered! Integers required on command line!")
		exitProcess(1)
	}
}

*/
