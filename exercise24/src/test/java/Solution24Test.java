import baseline.Solution24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test{

    // true case
    private final String a1 = "note";
    private final String b1 = "tone";

    //false case
    private final String a2 = "coat";
    private final String b2 = "boat";

    //unequal case
    private final String a3 = "cats";
    private final String b3 = "car";

    @Test
    void test_isAnagram(){
        boolean actual1 = Solution24.isAnagram(a1, b1);
        boolean actual2 = Solution24.isAnagram(a2, b2);
        boolean actual3 = Solution24.isAnagram(a3, b3);
        assertTrue(actual1);
        assertFalse(actual2);
        assertFalse(actual3);
    }

    @Test
    void test_determineOutput(){
        String expected1 = "\""+a1+"\" and \""+b1+"\" are anagrams.\n";
        String actual1 = Solution24.determineOutput(a1, b1);
        assertEquals(expected1, actual1);

        String expected2 = "\""+a2+"\" and \""+b2+"\" are not anagrams.\n";
        String actual2 = Solution24.determineOutput(a2, b2);
        assertEquals(expected2, actual2);

        String expected3 = "\""+a3+"\" and \""+b3+"\" are not anagrams.\n";
        String actual3 = Solution24.determineOutput(a3, b3);
        assertEquals(expected3, actual3);
    }
}