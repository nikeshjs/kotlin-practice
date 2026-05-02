fun main() {
    var x = 1;
    while(x < 3){
        print(if(x==1) "Yab" else "Dab");
        print("ba");
        x++;
    }
    print("Do");
}

//Datatypes in detail
var num1 = 1; //Implicitly declared as Int
var num2: Short = 1; //Explicit declaration
var num3: Long = 1;
var num4 = 1L; //Also declared like this
var num5 = 2.0; //Double as default
var num6 = 2.0F; //Declared as float

//Another important thing:
var num = 2; //Int
var number: Long = num;  //This creates an error as number is Long and num is Int. Type mismatch
var number: Long = num.toLong(); //Makes sure both are of the same datatype and holds reference to the same value