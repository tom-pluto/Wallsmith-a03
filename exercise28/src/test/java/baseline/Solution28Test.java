/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getSum() {

        int[] caseExample = {1,2,3,4,5};

        int expected = 15;
        int actual = Solution28.getSum(caseExample);

        assertEquals(expected, actual, "Example Output Test\n");
    }
}