package baseline;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

import baseline.Solution24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test{

    // true case
    private final String a1 = "note";
    private final String b1 = "tone";

    //false case
    private final String a2 = "coat";
    private final String b2 = "boat";

    //unequal case
    private final String a3 = "cats";
    private final String b3 = "car";

    @Test
    void test_isAnagram(){

        Solution24 solution = new Solution24();

        boolean actual1 = solution.isAnagram(a1, b1);
        boolean actual2 = solution.isAnagram(a2, b2);
        boolean actual3 = solution.isAnagram(a3, b3);

        assertTrue(actual1);
        assertFalse(actual2);
        assertFalse(actual3);

    }

    @Test
    void test_determineOutput() {

        Solution24 solution = new Solution24();

        String expected1 = "\""+a1+"\" and \""+b1+"\" are anagrams.\n";
        String actual1 = solution.determineOutput(a1, b1);
        assertEquals(expected1, actual1);

        String expected2 = "\""+a2+"\" and \""+b2+"\" are not anagrams.\n";
        String actual2 = solution.determineOutput(a2, b2);
        assertEquals(expected2, actual2);

        String expected3 = "\""+a3+"\" and \""+b3+"\" are not anagrams.\n";
        String actual3 = solution.determineOutput(a3, b3);
        assertEquals(expected3, actual3);
    }
}