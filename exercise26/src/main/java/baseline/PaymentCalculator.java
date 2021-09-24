package baseline;

import static java.lang.Math.*;

public class PaymentCalculator {

    private final double i; //daily rate
    private final double b; //balance
    private final double p; //monthly payment

    //these classes are so dumb why is there an entire class for this why

    public PaymentCalculator(double iNew, double bNew, double pNew) {
        i = iNew;
        b = bNew;
        p = pNew;
    }

    public double calculateMonthsUntilPaidOff() {
        return ceil(-(1.0/30.0) * log(1+(b/p)*(1-pow(1+i, 30))) / log(1+i)); //how many months it will take to pay off a credit card balance
    }
}
