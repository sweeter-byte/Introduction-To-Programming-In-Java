// Lect 3: Loops,Arrays
package Lect3;
/* Good programming style
 *
 * The goal of good style is to make your code more readable
 * By you and by others
 * 
 * Rule #1: Use good(meaningful) names for variables and methods
 * Rule #2: Use indentation
 * Rule #3: Use whitespaces:
 *      (1)Put whitespaces in complex expressions.
 *      (2)Put blank lines to improve readability.
 * Rule #4: Don't duplicate tests
 */

/* Loops
 * while, for, break, continue
 * Embedded loops
 */

class embedded_loops{
    public static void printNumbers(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(" * ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] arguments){
        printNumbers();
    }
}

/* Arrays: an array is an indexed list of values
 * The index starts at zero and ends at length-1.
 * int[] values = new int[5];
 * int[] values; // array of int
 * int[][] values;  // int[] is a type
 * 
 * Array Initialization:(Only used when declare the variable)
 * int[] values = {12,24,-23,47};
 * 
 * int[] values = new int[12];
 * int size = values.length; //12
 * 
 * int[] values2 = {1,2,3,4,5}
 * int size2 = values2.length;
 */

class loop_output_array{
    public static void main(String[] arguments){
        int[] values = new int[5];

        // not initial
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

        for (int i = 0; i < values.length; i++){
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
        }
    }
}