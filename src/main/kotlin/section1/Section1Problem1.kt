package learn.kotlin.section1

import learn.kotlin.Utils
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun executeSection1Problem1() {
	val formatter = DateTimeFormatter.ofPattern("E, dd MMM yyyy - hh:mm a", Locale.of("ar"))
	val formattedMoment = LocalDateTime.now().format(formatter)

	Utils.printResult(
		1, 1,
		result = "Hello, Hussam!\nYour moment is $formattedMoment",
	)
}