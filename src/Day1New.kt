val name = "Nikesh"
val age = 22
val location = "Harisiddhi"
var customerCount = 10
fun main(){
    println("Hello, my name is $name. I am $age years old. I live in $location.")
    println(++customerCount)
    println(++age)  //This will lead to error because age is declared as val (immutable)
}

//Use val always. Val is read-only. Var is used only when needed. It declares a mutable variable. Contents of val cannot be changed. But of var, it can be changed.

