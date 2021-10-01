/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PaymentCalculator Tests")
class PaymentCalculatorTest {

    @Test
    @DisplayName("Testing calculateMonthsUntilPaidOff()")
    void calculateMonthsUntilPaidOff() {

        double i_test1 = 0.12 / 365.0;
        double b_test1 = 5000.0;
        double p_test1 = 100.0;

        PaymentCalculator test = new PaymentCalculator(i_test1, b_test1, p_test1);

        double expected = 70;
        double actual = test.calculateMonthsUntilPaidOff();
        assertEquals(expected, actual, 0.0000000001, "Example Output Test\n");

    }
}