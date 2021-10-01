/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution33")
class Solution33Test {

    Solution33 test = new Solution33();

    @Test
    @DisplayName("getRandomResponse()")
    void getRandomResponse() {

        String actual = test.getRandomResponse();
        assertTrue(actual == "Yes."
                || actual == "No."
                || actual == "Maybe."
                || actual == "Ask again later.",
                "Testing if any valid response is given");

    }

    @Test
    @DisplayName("getRandomNumberBetween1And4()")
    void getRandomNumberMin1Max4() {

        //Epic loop to test randomness (which you cant but...)
        for (int i = 0; i < 10; i++) {
            int actual = test.getRandomNumberBetween1And4();
            assertTrue(actual >= 1 && actual <= 4, "Is it between 1 and 4?");
        }
    }
}