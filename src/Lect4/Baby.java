// Lect 4: Classes and Objects

package Lect4;
/*
 * Object oriented programming
 */

/*
 * Note:
 * 1. Class names are Capitalized
 * 2. 1 Class = 1 file // public class Baby -> Baby.java
 * 3. Having a main method means the class can be run
 */


// class Definition
public class Baby { 
    /* fields */
    String name;
    boolean isMale;
    double weight;
    double decibels;
    int numPoops = 0;

    Baby[] siblings;

    /* static */
    static int numBabiesMade = 0;

    /*constructor */
    Baby(){
        numBabiesMade += 1;
    }
    Baby(String myname, boolean maleBaby){
        name = myname;
        isMale = maleBaby;
    }
    
    /* methods */
    /* static */
    static int GetNumBabiesMade(Baby b){
        return Baby.numBabiesMade; // use CLASS.NAME
    }

    void poop(){
        numPoops += 1;
        System.out.println("Dear mother, " + "I have pooped. Ready the diaper.");
    }
    void sayHi(){
        System.out.println("Hi, my name is " + name);
    }

    void eat(double foodWeight) {
        if(foodWeight >= 0 && foodWeight < weight) {
            weight = weight + foodWeight;
        }
    }

    /* methods and references */
    void doSomething(int x, int[] ys, Baby b){
        x = 99;
        ys[0] = 99;
        b.name = "99";
    }



    public static void main(String[] args) {
        // Class Instance
        Baby shiloh = new Baby("Shiloh Jolie-Pitt",true);
        Baby knox = new Baby("Knox Jolie-Pitt",true);

        /* 
         * Accessing fields
         * Object.FIELDNAME
         */
        System.out.println(shiloh.name);
        System.out.println(shiloh.numPoops);
        
        /*
         * Calling Methods
         * Object.METHODNAME([ARGS])
         */
        shiloh.sayHi();
        shiloh.eat(1);

        knox.sayHi();

        int i = 0; // pass by value
        int[] j = {0}; // pass by reference
        Baby k = new Baby("50", true);
        k.doSomething(i, j, k);
        System.out.println("Answer:");
        System.out.println(" i = " + i + "\n j = " + j[0] + "\n k = " + k.name);
    
        /* static */
        Baby.numBabiesMade = 100;
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        
    }
}

/*
 * References vs Values
 * 
 * Primitive types are basic java types // pass by value
 * int, long, double, boolean, char, short, byte, float
 * 
 * Reference types are arrays and objects // pass by reference
 * String, int[], Baby,...
 * 
 * Objects are too big to fit in variable. They are stored somewhere else.
 * Variable stores a number that locates the object
 * The object's location is called a reference.
 * you can't use "==" compares the references.
 * 
 * Using "=" updates the reference
 */

/*
 * static types and methods
 * applies to fields and methods
 * means the field/method is defined for the class declaration, not unique for each instance
 */

