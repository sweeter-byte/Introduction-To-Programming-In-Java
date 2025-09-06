// This is related scource code to the lecture material
// Lecture 1: Types,Variables,Operators

// First Program

class Hello{
    public static void main(String[] arguments){
        System.out.println("Hello world.");
    }
}

// Second Prgram

class Hello2{
    public static void main(String[] argumens){
        System.out.println("Hello world.");
        System.out.println("Line number 2");
    }
}

/* Types  : Kinds of values that can be stored and manipulated
 * boolean: Truth value(true or false)
 * int    : Integer(0,-1,56)
 * double : Real number(3.14,2.79)
 * String : Text("Hello","good job!")
 */

/* Variables: Named location that stores a value of one particular type
* TYPE NAME: String foo
*/

/* Assignment
 * Use = to give variables a value
 * Can be combined with a variable declaration
 */

class Hello3{
    public static void main(String[] arguments){
        String foo = "Good Job!";
        System.out.println(foo);
        foo = "Bad Job!";
        System.out.println(foo);
    }
}

/* Operators     : Symbols that perform simple computations
 * Assignments   : =
 * Addition      : +
 * Subtraction   : -
 * Multiplication: *
 * Division      : /
 */

// Order of Operations Follows standard math rules

class DoMath{
    public static void main(String[] arguments){
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);
        score = score / 2;
        System.out.println(score);
    }
}

class DoMath2{
    public static void main(String[] arguments){
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);
        double copy = score;
        copy = copy / 2;
        System.out.println(copy);
        System.out.println(score);
    }
}

// String Concatenation(+)

class string_concatenation{
    public static void main(String[] arguments){
        String text = "hello " + "world";
        text = text + " number " + 5;
        System.out.println(text);
    }
}