package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution34")
class Solution34Test {

    Solution34 test = new Solution34();

    @Test
    @DisplayName("getEmployeeList()")
    void getNewEmployeeList() {

        String[] employeeNames = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList(employeeNames));
        ArrayList<String> actual = test.getNewEmployeeList(employeeNames);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("removeEmployeeFromList()")
    void removeEmployeeFromList() {

        String[] employeeNamesPre = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] employeeNamesPost = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};
        String targetEmployee = "Chris Jones";

        ArrayList<String> preDel = new ArrayList<String>(Arrays.asList(employeeNamesPre));

        ArrayList<String> expected = new ArrayList<String>(Arrays.asList(employeeNamesPost));
        ArrayList<String> actual = test.removeEmployeeFromList(preDel, targetEmployee);

        assertEquals(expected, actual);
    }
}