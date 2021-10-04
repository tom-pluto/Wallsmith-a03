/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution27")
class Solution27Test {

    /*
    I asked Dr. Hollander if having just one JUnit5 test was okay here, and he said it should be fine if I'm testing the
    "master" function that validates everything. No issues appeared when I ran this test, so I didn't feel the need
    to make a test for EVERY validation method that I had. Hope this is okay, plz no lose point <3
    */

    @Test
    @DisplayName("validateInput()")
    void validateInput() {

        Solution27 solution = new Solution27();

        String expected1 = """
                The first name must be at least 2 characters long.
                The last name must be at least 2 characters long.
                The last name must be filled in.
                The employee ID must be in the format of AA-1234.
                The zipcode must be a 5 digit number.
                """;
        String actual1 = solution.validateInput("J","", "ABDCE", "A12-1234");
        String expected2 = "There were no errors found.\n";
        String actual2 = solution.validateInput("John","Johnson", "55555", "TK-4321");

        assertEquals(expected1, actual1, "Example Output 1 Test\n");
        assertEquals(expected2, actual2, "Example Output 2 Test\n");

    }
}