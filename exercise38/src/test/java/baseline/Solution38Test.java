/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */


package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution38")
class Solution38Test {

    private Solution38 test = new Solution38();

    @Test
    void convertInputStringToList() {

        String testInput = "1 2 3 4 5 6 7 8 9";
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> actual = test.convertInputStringToList(testInput);
        System.out.printf("expected = %s%n" +
                "actual = %s%n", expected, actual);
        assertEquals(expected, actual);

    }

    @Test
    void filterEvenNumbers() {

        List<Integer> testInput = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> expected = Arrays.asList(2,4,6,8);
        List<Integer> actual = test.filterEvenNumbers(testInput);
        System.out.printf("Expected : %s%n" +
                "Actual : %s%n", expected, actual);
        assertEquals(expected, actual);

    }

    @Test
    void isEven() {

        int testInput1 = 1;
        int testInput2 = 2;
        boolean expected1 = false;
        boolean expected2 = true;
        boolean actual1 = test.isEven(testInput1);
        boolean actual2 = test.isEven(testInput2);
        assertEquals(expected1, actual1, "Even case");
        assertEquals(expected2, actual2, "Odd case");

    }
}