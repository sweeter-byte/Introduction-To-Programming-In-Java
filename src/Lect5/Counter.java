// Lect5: Access Control, Class Scope, Packages, Java API

package Lect5;

public class Counter{
    int myCount = 0; // Object Counter
    static int ourCount = 0; // Class Counter
    void increment() {
        myCount++;
        ourCount++;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.increment();
        counter1.increment();
        counter2.increment();
        System.out.println("Counter 1: " + counter1.myCount + " " + counter1.ourCount);
        System.out.println("Counter 2: " + counter1.myCount + " " + counter2.ourCount);
    }
}