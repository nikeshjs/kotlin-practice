//Lists, sets and maps
/*
1. Lists store items in the order they are added and allow for duplicate items.
2. When creating any collections, Kotlin can infer the type of items stored. To declare the type explicitly, add the type with angled brackets <> after the declaration.
 */
fun main(){
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes) //[triangle, square, circle]

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("pentagon")
    println(shapes) //pentagon is added at last as it is mutable.

    println(shapes.size)    //4
    println("First item: ${readOnlyShapes.first()}")
    println("First item: ${readOnlyShapes.last()}")
    println("Last item: ${readOnlyShapes[readOnlyShapes.size - 1]}")
    println("First item: ${readOnlyShapes[0]}")
    //These all do the same thing. The specification is different.
    println("Read only List has ${readOnlyShapes.size} shapes.")
    //The difference between size and count(): size --> property, count() --> function. size --> O(1) and count() --> 0(n). If we want total number directly, use size. But, if certain conditions has to be applied, use count() function.

    val first = listOf(20, 30, 40, 50, 60, 70, 80)
    println(first.size)     //7
    println(first.count{it >= 50})   //4

    println("triangle" in shapes)   //true
    //To check an item in the list, use 'in' operator.

    shapes.remove("triangle")
    println("triangle" in shapes)   //false now because triangle is removed
    //any item can be removed with this function at any index.

    //Sets are unordered and only store unique items, does not allow duplicates.
}
