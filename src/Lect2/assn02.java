// 6.092: Assignment 2
package Lect2;

class FooCorporation{
    public static void valid_test(double basepay, double worktime){
        if(basepay < 8.00){
            System.err.println("The basePay " + basepay + " is less than minimum wage!");
        }

        if(worktime > 60.0){
            System.err.println("The workTime " + worktime + " is more than 60!");
        }
    }

    public static double pay(double basepay, double worktime){
        valid_test(basepay, worktime);
        if(worktime <= 40){
            return basepay * worktime;
        }
        else{
            return basepay * 40.0 + (worktime - 40.0) * 1.5 * basepay;
        }
    }

    public static void test(String name, double basepay, double worktime){
        System.out.println(name + ": ");
        System.out.println("Total Pay: " + pay(basepay, worktime));
    }

    public static void main(String[] arguments){
        test("Employee 1",7.50,35);
        test("Employee 2",8.20,47);
        test("Employee 3",10.00,73);
    }
}