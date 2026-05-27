fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val allCount = greenNumbers.count() + redNumbers.count()
    println(allCount)

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED// Write your code here
    println("Support for $requested: $isSupported")
}