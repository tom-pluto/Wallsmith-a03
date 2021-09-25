package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void getYears() {
        String expected = "It will take 18 years to double your initial investment.";
        String actual = Solution29.getYears(4);
        assertEquals(expected, actual, "Example Output Test\n");
    }
}