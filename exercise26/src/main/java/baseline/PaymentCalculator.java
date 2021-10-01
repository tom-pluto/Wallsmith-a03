/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */


package baseline;

import static java.lang.Math.*;

public class PaymentCalculator {

    private final double i; //daily rate
    private final double b; //balance
    private final double p; //monthly payment

    public PaymentCalculator(double iNew, double bNew, double pNew) {
        i = iNew;
        b = bNew;
        p = pNew;
    }

    public double calculateMonthsUntilPaidOff() {
        return ceil(-(1.0/30.0) * log(1+(b/p)*(1-pow(1+i, 30))) / log(1+i)); //how many months it will take to pay off a credit card balance
    }
}
