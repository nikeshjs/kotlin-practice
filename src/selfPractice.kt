// A program where a user uploads his/her marks in 5 subjects and then the progress report is shown at the end along with percentage and GPA scored.

fun main() {
    val subjects = listOf("Science", "Math", "Account", "Social", "English", "Nepali", "Byakaran", "Grammar", "Opt Math")
    var marks: MutableList<Double> = mutableListOf()

    for (i in 0..8) {
        print("Enter your marks in ${subjects[i]}: ")
        marks.add(readln().toDouble())
    }

    println("According to the inputs given: \n")
    println("===STUDENT'S PROGRESS REPORT===")
    for(i in 0..8){
        println("${subjects[i].padEnd(20)} --> ${marks[i]}")
    }

    val totalObtainedMarks = marks.sum()
    val totalFullMarks = 575.0
    val percentage = (totalObtainedMarks / totalFullMarks) * 100.0

    val gpa = when {
        percentage >= 93 -> 4.0   // A+
        percentage >= 90 -> 4.0   // A
        percentage >= 87 -> 3.7   // A-
        percentage >= 83 -> 3.3   // B+
        percentage >= 80 -> 3.0   // B
        percentage >= 77 -> 2.7   // B-
        percentage >= 73 -> 2.3   // C+
        percentage >= 70 -> 2.0   // C
        percentage >= 67 -> 1.7   // C-
        percentage >= 63 -> 1.3   // D+
        percentage >= 60 -> 1.0   // D
        else -> 0.0               // F
    }

    val grade = when{
        gpa >= 3.6 -> "A+"
        gpa >= 3.2 -> "A"
        gpa >= 2.8 -> "A-"
        gpa >= 2.4 -> "B+"
        gpa >= 2.0 -> "B"
        gpa >= 1.7 -> "B-"
        gpa >= 1.3 -> "C+"
        gpa >= 1.0 -> "C"
        gpa >= 0.7 -> "D+"
        gpa >= 0.0 -> "D"
        else -> "F"
    }

    println("\nTotal Obtained Marks: $totalObtainedMarks / $totalFullMarks")
    println("Percentage: ${"%.2f".format(percentage)}%")
    println("GPA: ${"%.1f".format(gpa)} / 4.0")
    println("GRADE: $grade")
    if(percentage >= 40.0){
        println("You have passed the exam.")
    }
    else{
        println("You have failed the exam.")
    }

}