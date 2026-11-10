fun main() {
    val obj = "1"
    val obj2 = "S"
    when(obj) {
        "Yes" -> println("One")
        "Hello" -> println("Hii")
        else -> println("Whatever")
    }

    //When can be used as a statement or as an expression. The above example: when is used as statement.
    val result = when(obj2) {
        "W" -> "Up"
        "A" -> "Left"
        "S" -> "Down"
        "D" -> "Right"
        else -> "Incorrect movement key."
    }
    println(result)

    //When can also be used with and without subject. The above examples use subject. If not used, the expression will be like:
    // val result = when { obj2 == "W" -> "Up"}
}