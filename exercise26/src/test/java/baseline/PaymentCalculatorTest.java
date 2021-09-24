package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    private final double i_test1 = 12.0/365.0;
    private final double b_test1 = 5000;
    private final double p_test1 = 100;

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator test = new PaymentCalculator(i_test1, b_test1, p_test1);

        double expected = 70;
        double actual = test.calculateMonthsUntilPaidOff();
        assertEquals(expected, actual, 0.0000000001);
    }
}