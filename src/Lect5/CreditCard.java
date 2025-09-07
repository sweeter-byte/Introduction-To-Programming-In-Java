// Access Control

package Lect5;

public class CreditCard{
    String cardNumber;
    double expenses;
    public void charge(double amount) {
        expenses = expenses + amount;
    }

    public String getCardNumber(String password) {
        if(password.equals("SECRET!3*!")) {
            return cardNumber;
        }
        return "jerkface";
    }
}

/*
 * Public vs. Private
 * Public: others can use this
 * Private: only the class can use this
 * public/private applies to any field or method
 */

/*
 * Why Access Control
 * Protect private information (sorta)
 * Clarify how others should be use your class
 * Keep implementation separate from interface
 */