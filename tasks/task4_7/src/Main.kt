// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.*
import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.math.sin
import kotlin.random.Random

fun main(args: Array<String>) {
	/*
	
	with (filePath) {
	writeLines("Hi there.")
	}
	val fileContents = filePath.readText()
	val fileLines = filePath.readLines()
	with (filePath.useLines) {
    		for (line in fileLines) {
		println(line)
		}
	}*/
	val filePath = Path("src/kisses.txt")
	
	filePath.writer().use {
		for (i in 0..10) {
			var seed = Random.nextInt(0, 12) // [0,12[
			val result = buildString {
				for (n in 1..seed) {
					append('x')
				}
				
			}
			it.write(result+"\n")
		}
		it.write("EOF")	
		
	}
	
	
	
	filePath.useLines {
		var maxlen = 0
		var storedIndex = 1
		var lineIndex = 1
		for (line in it) {
			var linelen = line.length
			if (linelen > maxlen) {
				maxlen=linelen
				storedIndex=lineIndex
			}
			println("Line: "+line+", Length: $linelen")
			lineIndex+=1
		}
		println()
		println()
		println("Max line length: $maxlen, Line index: $storedIndex")
	}
	
	
		
	
}
