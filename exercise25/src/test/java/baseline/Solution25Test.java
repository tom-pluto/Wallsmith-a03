package baseline;

import baseline.Solution25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    //given examples
    private final String s0 = "12345";
    private final String s1 = "abcdef";
    private final String s2 = "abc123xyz";
    private final String s3 = "1337h@xor!";

    @Test
    void passwordValidator() {
        //these work tho
        assertEquals(0, Solution25.passwordValidator(s0), "Strength 0 Test\n");
        assertEquals(1, Solution25.passwordValidator(s1), "Strength 1 Test\n");
        assertEquals(2, Solution25.passwordValidator(s2), "Strength 2 Test\n");
        assertEquals(3, Solution25.passwordValidator(s3), "Strength 3 Test\n");
    }

    @Test
    void createOutput() {
        //not sure why these are failing
        assertEquals("The password '12345' is a very weak password.\n", Solution25.createOutput(s0, 0), "Strength 0 Test\n");
        assertEquals("The password 'abcdef' is a weak password.\n", Solution25.createOutput(s1, 1), "Strength 1 Test\n");
        assertEquals("The password 'abc123xyz' is a strong password.\n", Solution25.createOutput(s2, 2), "Strength 1 Test\n");
        assertEquals("The password '1337h@xor!' is a very strong password.\n", Solution25.createOutput(s3, 3), "Strength 1 Test\n");
    }
}
