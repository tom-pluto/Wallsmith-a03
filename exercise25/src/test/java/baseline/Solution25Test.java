/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    private final Solution25 solution25 = new Solution25();

    @Test
    void passwordValidator() {
        //given examples
        String s0 = "12345";
        assertEquals(0, solution25.passwordValidator(s0), "Strength 0 Test\n");
        String s1 = "abcdef";
        assertEquals(1, solution25.passwordValidator(s1), "Strength 1 Test\n");
        String s2 = "abc123xyz";
        assertEquals(2, solution25.passwordValidator(s2), "Strength 2 Test\n");
        String s3 = "1337h@xor!";
        assertEquals(3, solution25.passwordValidator(s3), "Strength 3 Test\n");
    }

}
