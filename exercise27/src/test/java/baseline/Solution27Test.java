package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInput() {
        String expected = "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.";
        String actual = Solution27.validateInput("J","","A12-1234","ABDCE");
        assertEquals(expected, actual, "Example Output 1 Test\n");
    }
}