package learn.kotlin.section3

import learn.kotlin.Utils

fun executeSection3Problem3() {
	val greeting = "Welcome, Hussam!"
	val isAvailable: Boolean = false

	val status = if (isAvailable) "Available" else "Not Available"
	Utils.printResult(3, 3, result = "$greeting You're $status")
}