// Task 4.2: use of if and ranges

fun main() {
    println("Pizza time \nA. Pepperoni \nB. Sausage & Ham \nC. Meat Feast (all of the above) \nD. Hawaiian (B with Pineapple)")
    var valid = false
    var choice = ""
    while (valid == false) {
    	println("What's your choice?")
    	choice = readln().lowercase() // gives "a"
    	when (choice) {
    	in "a".."d" -> valid = true
    	else        -> println("Invalid! Not in range!")
    	}
    }
    var order = if (choice == "a") {
    	println("Pepperoni selected!")
    } else if (choice == "b") {
    	println("Sausage n Ham, on the way!")
    } else if (choice == "c") {	
    	println("Meat Feast incoming!")
    } else {
    	println("Oh... you want a Hawaiian? Enjoy ig...")
    }
}
    
