package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInput() {

        String expected1 = "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.\n";
        String actual1 = Solution27.validateInput("J","", "ABDCE", "A12-1234");
        String expected2 = "There were no errors found.\n";
        String actual2 = Solution27.validateInput("John","Johnson", "55555", "TK-4321");

        assertEquals(expected1, actual1, "Example Output 1 Test\n");
        assertEquals(expected2, actual2, "Example Output 2 Test\n");

    }
}