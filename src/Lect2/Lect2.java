//Lect 2: More types, Methods, Conditionals
package Lect2; 
// Division("/") operates differently on integers and on doubles!

/* Conversion by casting
 * int a = (int) 18.7  // a = 18
 * double a = 2 / 3    // a = 0.0
 * double a = (double) 2 / 3  // a = 0.666...
 */

// Methods

class NewLine{
    public static void newLine(){
        System.out.println("");
    }

    public static void threeLines(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] arguments){
        System.out.println("Lines 1");
        threeLines();
        System.out.println("Line 2");
    }
}

// Parameters

class Square{
    public static void printSquare(int x){
        System.out.println(x*x);
    }

    public static void main(String[] aarguments){
        int value = 2;
        printSquare(value);
        printSquare(3);
        printSquare(value * 2);
    }
}

class Square2{
    public static void printSquare(int x){
        System.out.println(x*x);
    }

    public static void main(String[] arguments){
        //printSquare("hello");
        //printSquare(5.5);
        // parameters are wrong!
    }
}

class SquareChange{
    public static void printSquare(int x){
        System.out.println("printSquare x = " + x);
        x = x * x;
        System.out.println("printSquare x = " + x);
    }

    public static void main(String[] arguments){
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x);
    }
}

class Scope{
    public static void main(String[] arguments){
        int x = 5;
        int y = 0;
        if(x == 5){
            x = 6;
            y = 72;
            System.out.println("x = " + x + "y = " + y);
        }
        System.out.println("x = " + x + "y = " + y);
    }
}

/* Methods: Building Blocks
 * In Computer Science, this is called "abstraction"
 * Math.sin(x)
 * Math.pow(2,3)
 * ...
 */

/* Conditionals
 * if(CONDITIONS) {
 *    STATEMENTS
 * }
 */

class test_number{
    public static void test(int x){
        if(x > 5){
            System.out.println(x + " is > 5 ");
        }
        else if(x == 5){
            System.out.println(x + " equals 5");
        }
        else{
            System.out.println(x + " is < 5");
        }
    }

    public static void main(String[] arguments){
        test(6);
        test(5);
        test(4);
    }
}

/* Conversion by methods
 * int to String:
 * String five = 5; // ERROR!
 * String five = Integer.toString(5);
 * String five = "" + 5; // five = "5"
 * 
 * String to int:
 * int foo = "19"; // ERROR!
 * int foo = Integer.parseInt("18")
 */


/* Be careful about "Comparison operators"
 * Do NOT call "==" on doubles! EVER
 */