// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.random.Random
import kotlin.system.exitProcess
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
	val iteration = args.size
	
	if (iteration > 0) {
		for (i in 0..iteration-1) {
			try {
				var parsedInt = args[i].toInt()
				var output = grade(parsedInt)
				println("Result: $output")
			} catch (nfe: NumberFormatException) {
				println("Integer grade required!")
			}
		}
	}
	else {
		println("No grades entered! Integers required on command line!")
		exitProcess(1)
	}
}
