package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution37")
class Solution37Test {

    private Solution37 test = new Solution37();

    @Test
    @DisplayName("generatePassword()")
    void generatePassword() {

        String actual1 = test.generatePassword(10,5,5);
        String actual2 = test.generatePassword(8,2,2);
        System.out.printf("actual 1 = %s%n" +
                "actual 2 = %s", actual1, actual2);
        assertNotEquals(actual1, actual2, "Do two random generated strings match?");
    }
}