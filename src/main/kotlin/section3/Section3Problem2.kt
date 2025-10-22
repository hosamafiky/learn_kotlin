package learn.kotlin.section3

import learn.kotlin.Utils

fun executeSection3Problem2() {
	val height: Double = 26.0
	val width: Double = 13.0

	val area = height.times(width)

	Utils.printResult(3, 2, result = "The area of the rectangle is $area m\u00B2.")
}