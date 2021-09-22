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
    void test_passwordValidator() {
        assertEquals(0, Solution25.passwordValidator(s0));
        assertEquals(1, Solution25.passwordValidator(s1));
        assertEquals(2, Solution25.passwordValidator(s2));
        assertEquals(3, Solution25.passwordValidator(s3));
    }

    @Test
    void test_createOutput() {
        assertEquals("The password '12345' is a very weak password.", Solution25.createOutput(s0, 0));
        assertEquals("The password 'abcdef' is a weak password.", Solution25.createOutput(s1, 1));
        assertEquals("The password 'abc123xyz' is a strong password.", Solution25.createOutput(s2, 2));
        assertEquals("The password '1337h@xor!' is a very strong password.", Solution25.createOutput(s3, 3));
    }
}
