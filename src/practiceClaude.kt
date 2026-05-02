//This is the same program as in practice1.kt but modified and refactored by Claude.

fun percentage(studentMarks: Array<Int>): Double {
    var total = 0
    for (mark in studentMarks) {
        total += mark
    }
    return (total / 500.0) * 100
}

fun getRemarks(percent: Double): String {
    return when {
        percent >= 80 -> "Distinction"
        percent >= 60 -> "First Division"
        percent >= 45 -> "Second Division"
        percent >= 40 -> "Pass"
        else -> "FAIL"
    }
}

fun main() {
    val students = arrayOf("Nikesh", "Nirjala", "Niroj")
    val roll = arrayOf(1, 2, 3)
    val subjects = arrayOf("Science", "Math", "Social", "Opt Math", "Health")
    val marks = arrayOf(
        arrayOf(70, 65, 98, 44, 56),
        arrayOf(22, 35, 68, 45, 76),
        arrayOf(69, 36, 45, 99, 58)
    )

    print("Enter the roll number of the student: ")
    val input = readLine()?.toIntOrNull()

    if (input == null) {
        println("Invalid input. Please enter a number.")
        return
    }

    val stdIndex = roll.indexOf(input)

    if (stdIndex == -1) {
        println("No student found with roll number $input.")
        return
    }

    val allMarks = marks[stdIndex]
    val totalPercent = percentage(allMarks)
    val remarks = getRemarks(totalPercent)

    println("===================================")
    println("         STUDENT MARKS             ")
    println("===================================")
    println("Name : ${students[stdIndex]}")
    println("Roll : $input")
    println("===================================")

    for (i in subjects.indices) {
        println("${subjects[i].padEnd(10)} : ${allMarks[i]}")
    }

    println("===================================")
    println("Percentage : ${"%.2f".format(totalPercent)}%")
    println("Remarks    : $remarks")
    println("===================================")
}