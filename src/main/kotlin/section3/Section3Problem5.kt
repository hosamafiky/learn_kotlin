package learn.kotlin.section3

import learn.kotlin.Utils

fun executeSection3Problem5() {

	val favoriteFoods: List<String> = listOf("Pizza", "Burger", "Chicken", "Broast")

	/// JUNIOR WAY
	Utils.printResult(
		3, 5, result = listOf(
			"First Food: ${favoriteFoods[0]}", "Second Food: ${favoriteFoods[1]}", "Third Food: ${favoriteFoods[2]}"
		)
	)

	/// SENIOR WAY
	val formattedFoods = favoriteFoods.mapIndexed { index, food ->

		val position = when (index) {
			0 -> "First"
			1 -> "Second"
			2 -> "Third"
			else -> "${index + 1}th"
		}

		"$position Food: $food"

	}


	Utils.printResult(
		3, 5, result = formattedFoods.joinToString("\n")
	)
}