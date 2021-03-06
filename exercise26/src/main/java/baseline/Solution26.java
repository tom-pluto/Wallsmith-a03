/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
ASSIGNMENT DESCRIPTION
"Months to Pay Off a Credit Card"
- It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring
  that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.
- Write a program that will help you determine how many months it will take to pay off a credit card balance. The
  program should then return the number of months needed (rounded up to the next integer value)
- The formula for this is:
    n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        where:
            n is the number of months.
            i is the daily rate (APR divided by 365).
            b is the balance.
            p is the monthly payment.

- Constraints
    -   Prompt for the card's APR. Do the division internally.
    -   Prompt for the APR as a percentage, not a decimal.
    -   Use a class called <PaymentCalculator> with a public method called <calculateMonthsUntilPaidOff>

- Example Output
    >   What is your balance? 5000
    >   What is the APR on the card (as a percent)? 12
    >   What is the monthly payment you can make? 100
    >   It will take you 70 months to pay off this card.
 */

package baseline;

import java.util.Scanner;

import static java.lang.String.format;

public class Solution26 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Solution26 solution = new Solution26();

        //Prompt for and read balance
        double balance = getBalance();

        //Prompt for and read apr
        double apr = getApr();

        //Prompt for and read monthlyPayment (monthly payment)
        double monthlyPayment = getMonthlyPayment();

        //Construct new PaymentCalculator class
        PaymentCalculator pC = new PaymentCalculator(apr,balance,monthlyPayment);

        //Call calculateMonthsUntilPayOff on the class & store result
        double months = pC.calculateMonthsUntilPaidOff();

        //Print result
        System.out.printf("%s%n", solution.getOutput(months));
    }

    private static double getMonthlyPayment() {
        System.out.printf("%s", "What is the monthly payment you can make? ");
        return sc.nextDouble();
    }

    private static double getApr() {
        System.out.printf("%s", "What is the apr on the card (as a percent)? ");
        return ((sc.nextDouble())/100)/365;
    }

    private static double getBalance() {
        System.out.printf("%s", "What is your balance? ");
        return sc.nextDouble();
    }

    public String getOutput(double months) {
        return format("It will take you %.0f months to pay off this card.", months);
    }
}

