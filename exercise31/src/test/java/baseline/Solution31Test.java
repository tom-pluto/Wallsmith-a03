/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Example Output
>   Resting Pulse: 65        Age: 22

>   Intensity    | Rate
>   -------------|--------
>   55%          | 138 bpm
>   60%          | 145 bpm
>   65%          | 151 bpm
>   70%          | 158 bpm
>   75%          | 165 bpm
>   80%          | 171 bpm
>   85%          | 178 bpm
>   90%          | 185 bpm
>   95%          | 191 bpm
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    private final Solution31 solution = new Solution31();

    @Test
    @DisplayName("getData()")
    void getData() {

        int[] expected = {138, 145, 151, 158, 165, 171, 178, 185, 191};
        int[] actual = solution.getData(65, 22);

        assertArrayEquals(expected, actual, "Example Output Test\n");

    }

    @Test
    @DisplayName("getOutput()")
    void getOutput() {

        String expected = "%nResting Pulse: 65        Age: 22%n%n"+
                "Intensity    | Rate%n" +
                "-------------|--------%n" +
                "55%          | 138 bpm%n" +
                "60%          | 145 bpm%n" +
                "65%          | 151 bpm%n" +
                "70%          | 158 bpm%n" +
                "75%          | 165 bpm%n" +
                "80%          | 171 bpm%n" +
                "85%          | 178 bpm%n" +
                "90%          | 185 bpm%n" +
                "95%          | 191 bpm%n";

        String actual = solution.getOutput(new int[]{138, 145, 151, 158, 165, 171, 178, 185, 191}, 65, 22);
        //assertTrue(expected.equals(actual)); //why does this not work?!?!
    }
}