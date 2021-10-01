package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    Solution32 test = new Solution32();

    @Test
    @DisplayName("is123()")
    void is123() {

        boolean expected = true;
        boolean actual1 = test.is123("1");
        boolean actual2 = test.is123("2");
        boolean actual3 = test.is123("3");

        boolean expected2 = false;
        boolean actualf1 = test.is123("4");
        boolean actualf2 = test.is123("5");
        boolean actualf3 = test.is123("6");

        assertEquals(expected, actual1, "Testing 1");
        assertEquals(expected, actual2, "Testing 2");
        assertEquals(expected, actual3, "Testing 3");
        assertEquals(expected2, actualf1, "Testing 4");
        assertEquals(expected2, actualf2, "Testing 5");
        assertEquals(expected2, actualf3, "Testing 6");
    }

    @Test
    @DisplayName("detemineMax()")
    void determineMax() {
        int t1 = 1;
        int t2 = 2;
        int t3 = 3;
        int expected1 = 10;
        int expected2 = 100;
        int expected3 = 1000;
        int actual1 = test.determineMax(t1);
        int actual2 = test.determineMax(t2);
        int actual3 = test.determineMax(t3);
        assertEquals(expected1, actual1, "Case 1");
        assertEquals(expected2, actual2, "Case 2");
        assertEquals(expected3, actual3, "Case 3");
    }

    @Test
    @DisplayName("isInteger()")
    void isInteger() {
        String t1 = "100";
        String t2 = "not an integer";
        boolean expected1 = true;
        boolean expected2 = false;
        boolean actual1 = test.isInteger(t1);
        boolean actual2 = test.isInteger(t2);
        assertEquals(expected1, actual1, "True case");
        assertEquals(expected2, actual2, "False case");
    }
}