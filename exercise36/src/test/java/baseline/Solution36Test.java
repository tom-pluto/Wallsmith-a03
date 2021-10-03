package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution36 Testing")
class Solution36Test {

    private Solution36 test = new Solution36();
    private List<Integer> test1_integerList = new ArrayList(Arrays.asList(new int[]{100, 200, 1000, 300}));

    @Test
    @DisplayName("average() Test")
    void average() {

        double test1_expected = 400.0;
        double test1_actual = test.average(test1_integerList);

        System.out.printf("test1_expected = %.2f %ntest1_actual = %.2f", test1_actual, test1_expected);
        assertEquals(test1_expected, test1_actual, 0.0000000001, "Test 1");

    }

    @Test
    @DisplayName("min() Test")
    void min() {

        int test1_expected = 100;
        int test1_actual = test.min(test1_integerList);

        System.out.printf("test1_expected = %d %ntest1_actual = %d", test1_actual, test1_expected);
        assertEquals(test1_expected, test1_actual, "Test 1");

    }

    @Test
    @DisplayName("max() Test")
    void max() {

        int test1_expected = 1000;
        int test1_actual = test.min(test1_integerList);

        System.out.printf("test1_expected = %d %ntest1_actual = %d", test1_actual, test1_expected);
        assertEquals(test1_expected, test1_actual, "Test 1");

    }

    @Test
    @DisplayName("std() Test")
    void std() {

        double test1_expected = 353.55;
        double test1_actual = test.std(test1_integerList);

        System.out.printf("test1_expected = %.2f %ntest1_actual = %.2f", test1_actual, test1_expected);
        assertEquals(test1_expected, test1_actual, 0.0000000001, "Test 1");

    }
}