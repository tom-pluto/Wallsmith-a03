/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution26 Tests")
class Solution26Test {

    @Test
    @DisplayName("Testing output")
    void getOutput(){

        Solution26 solution = new Solution26();

        String expected = "It will take you 70 months to pay off this card.";
        String actual = solution.getOutput(70);
        assertEquals(expected, actual, "Example Output Test\n");

    }
}