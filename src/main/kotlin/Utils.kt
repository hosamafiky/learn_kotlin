package learn.kotlin

object Utils {
	const val BASE_SEPARATOR = "-------"
	fun problemHeader(section: Int, problem: Int) =
		"$BASE_SEPARATOR (Section $section,Problem $problem) $BASE_SEPARATOR\n"

	fun printResult(section: Int, problem: Int, result: Any) {
		print(problemHeader(section = section, problem = problem))
		if (result is List<*>) {
			result.map { it -> println(it) }
		} else {
			println(result)
		}
	}
}