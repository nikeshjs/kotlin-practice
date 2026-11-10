//Control flow in Kotlin
/*
Kotlin provides 'if' and 'when' for conditional statements. Prefer using 'when' because it makes the code easier to read, less error-prone and makes it easier to add another branch.
 */
import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
    if(firstResult == secondResult) {
        println("You win :)")
    }
    else{
        println("You lose :(")
    }
    //You can write this same code without curly braces for a single line of executable line after conditions.

    if(secondResult > firstResult)
        println("second is bigger.")
    else
        println("first is bigger.")

    println(if (firstResult > secondResult) firstResult else secondResult)  //This is also valid.
}
