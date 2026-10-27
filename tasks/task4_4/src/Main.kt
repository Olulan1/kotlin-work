// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size == 3) {
        println("You have 4 args")
    } else if (args.size == 2) {
    	println("You have 3 args")
    } else if (args.size == 1) {
    	println ("You have 2 args")
    } else {
    	println("You have 0 args.")
    }

}
