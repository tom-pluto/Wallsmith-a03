package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution26Test {

    @Test
    void getOutput() {

        String expected = "It will take you 70 months to pay off this card.";
        String actual = Solution26.getOutput(70);
        assertEquals(expected, actual, "Example Output Test\n");

    }
}