package learn.kotlin.section2

import learn.kotlin.Utils
import kotlin.math.pow

const val PI = 3.14

fun executeSection2Problem3() {
	val radius = 5.0
	val area = calculateArea(radius = radius)

	Utils.printResult(
		2, 3, result = "The area of a circle with radius $radius m is $area m2"
	)
}

fun calculateArea(radius: Double): Double {
	return PI.times(radius.pow(2))
}
