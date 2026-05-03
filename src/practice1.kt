//This is the program that lets user enter the roll number of a student and see the obtained marks details along with percentage and remarks.


val students = arrayOf("Nikesh", "Nirjala", "Niroj");   //Student's name
val roll = arrayOf(1,2,3);  //Roll number of students
val subjects = arrayOf("Science", "Math", "Social", "Opt Math", "Health");  //Name of subjects
val marks = arrayOf(
    arrayOf(70,65,98,44,56),
    arrayOf(22,35,68,45,76),
    arrayOf(69,36,45,99,58)
);

fun percentage(studentMarks: Array<Int>): Double {
    var total: Double = 0.0;
    for(mark in studentMarks){
        total += mark;
    }
    return (total/500)*100;
}

fun main(){
    var stdIndex: Int = -1;
    print("Enter the roll number of the student: ");
    val input = readLine()?.toInt();
    for(rollNumber in roll.indices){
        if(roll[rollNumber]==input) stdIndex = rollNumber;
    }
    if(stdIndex == -1) print("This is not valid roll number.")
    else{
        println("===================================")
        println("           STUDENT MARKS           ")
        println("===================================")
        println("Name: ${students[stdIndex]}")
        println("===================================")
        var allMarks = marks[stdIndex];
        for(i in subjects.indices){
            println("Marks in ${subjects[i]} = ${allMarks[i]}")
        }   //No i++ needed in Kotlin. Kotlin's for loop does it for us.

        var totalPercent = percentage(allMarks);
        println("Obtained percentage = $totalPercent");

        if(totalPercent < 40) println("FAIL")
        else println("PASS")

    }
}