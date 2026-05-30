fun main() {
    //Collections in Kotlin

    //List: listOf(), mutableListOf()
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val allCount = greenNumbers.count() + redNumbers.count()
    println(allCount)


    //Set: setOf(), mutableSetOf()
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED// Write your code here
    println("Support for $requested: $isSupported")

    //Map: mapOf(), mutableMapOf()
    val number2word: MutableMap<Int, String> = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")// Write your code here
    val n = 2
    println("$n is spelled as '${number2word[n]}'")


    //Use of 'when' keyword

    print("Enter the button: ")
    val button = readLine()

    val action = when(button){
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }

    println(action)
}