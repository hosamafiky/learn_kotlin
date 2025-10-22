package learn.kotlin.section3

import learn.kotlin.Utils
import java.awt.Color

fun executeSection3Problem4() {
	val colors = listOf(Color.BLACK, Color.CYAN, Color.RED, Color.WHITE, Color.DARK_GRAY).joinToString(", ") {
		color -> when (color) {
			Color.BLACK -> "BLACK"
			Color.CYAN -> "CYAN"
			Color.RED -> "RED"
			Color.WHITE -> "WHITE"
			else -> "UNKNOWN"
		}
	}

	Utils.printResult(3, 4, result = "The selected Colors is $colors")
}