fun main() {
    //val text: String = null //This is not possible, by default, not nullable

    val text2: String? = null
    if(text2 == null){
        println("This is the null value")
    }
    else{
        println(text2)
    }

    //We can do the same thing using safe call operator.
    println(text2?.length)  //?. is a safe call operator

    //println(text2!!.length) // !!. is not-null assertion operator.

    //Elvis operator (?:)
    val text3 = text2 ?: "Something"
    println(text3)

    //If the assigned value on the left is not null, that value will be assigned to text3. But, if text2 is null, it assigns the default value on the right to the text3 variable.



}