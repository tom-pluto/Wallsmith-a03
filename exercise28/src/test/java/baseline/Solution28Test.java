/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution28")
class Solution28Test {

    @Test
    @DisplayName("getSum()")
    void getSum() {

        Solution28 solution = new Solution28();

        int[] caseExample = {1,2,3,4,5};

        int expected = 15;
        int actual = solution.getSum(caseExample);

        assertEquals(expected, actual, "Example Output Test\n");
    }
}