package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution35")
class Solution35Test {

    Solution35 test = new Solution35();

    @Test
    @DisplayName("getRandomInteger() : Boundaries") //getRandomInteger() must be a clingy boyfriend
    void getRandomInteger() {

        int test1_max = 10;
        int test2_max = 100;

        //computer go fast vroom brute force stupid test caveman ooga booga
        for (int i = 0; i < 1000; i++) {

            int test1_actual = test.getRandomInteger(test1_max);
            int test2_actual = test.getRandomInteger(test2_max);

            assertTrue(0 <= test1_actual && test1_actual <= test1_max-1, "Test 1");
            assertTrue(0 <= test2_actual && test2_actual <= test2_max-1, "Test 2");

        }
    }

    @Test
    @DisplayName("findName() : Access Correct Name From List")
    void findName() {

        List<String> test1_names = new ArrayList<>(Arrays.asList("Homer", "Bart", "Maggie", "Lisa", "Moe"));
        String test1_expected = "Maggie";
        String test1_actual = test.findName(test1_names, 2);
        assertEquals(test1_expected, test1_actual, "Test 1");

        List<String> test2_names = new ArrayList<>(Arrays.asList("Homer", "Bart", "Maggie", "Lisa", "Moe"));
        String test2_expected = "Homer";
        String test2_actual = test.findName(test2_names, 0);
        assertEquals(test2_expected, test2_actual, "Test 2");
    }
}