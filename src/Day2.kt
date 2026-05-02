fun main() {
    var x = 1;
    while(x < 3){
        print(if(x==1) "Yab" else "Dab");
        print("ba");
        x++;
    }
    print("Do");

    var array1 = arrayOf(1,2,3);    //Start of array operation
    print(array1.size);
    val array2 = arrayOf(4,5,6);    //Array declared with val stores the reference of only one array. If the same variable name is used for another array, it won't happen
    //Array declared with var updates its reference with the new one. Same array name can refer to different arrays.

    //Although both are different in reference, the array's values itself can be updated in both cases.
    array1[0] = 7;
    array2[0] = 9; //Index 0 of both arrays are updated with the new one.

    //Datatypes in detail
    var num1 = 1; //Implicitly declared as Int
    var num2: Short = 1; //Explicit declaration
    var num3: Long = 1;
    var num4 = 1L; //Also declared like this
    var num5 = 2.0; //Double as default
    var num6 = 2.0F; //Declared as float

    //Another important thing:
    var num = 2; //Int
    //var number: Long = num; This creates an error as number is Long and num is Int. Type mismatch
    var number: Long = num.toLong(); //Makes sure both are of the same datatype and holds reference to the same value

    //toByte(), toLong(), toShort(), toDouble(), toInt(), toFloat()








}


