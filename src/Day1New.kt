val name = "Nikesh"
val age = 22
val location = "Harisiddhi"
var customerCount = 10

val one = 100u
val two = 100f
val three: Float = 23.0f
val four: Double = 23.5
val five: Int = 0   //Explicitly typing the variable and initializing

//Use val always. Val is read-only. Var is used only when needed. It declares a mutable variable. Contents of val cannot be changed. But of var, it can be changed.

fun main(){
    println("Hello, my name is $name. I am $age years old. I live in $location.")
    println(++customerCount)
}
