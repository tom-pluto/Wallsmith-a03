package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution29")
class Solution29Test {

    @DisplayName("getYears()")
    @Test
    void getYears() {
        Solution29 solution = new Solution29();
        String expected = "It will take 18 years to double your initial investment.";
        String actual = solution.getYears(4);
        assertEquals(expected, actual, "Example Output Test\n");
    }
}