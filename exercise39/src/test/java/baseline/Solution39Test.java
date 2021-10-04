/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution39")
class Solution39Test {

    private final Solution39 test = new Solution39();
    private List<Employee> givenEmployeeList;
    private TreeMap<String, Employee> expectedTreeMap;

    @BeforeEach
    void beforeEach() {

        givenEmployeeList = new ArrayList<>();
        givenEmployeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        givenEmployeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        givenEmployeeList.add(new Employee("Michaela", "Michaelson","District Manager", "2015-12-19"));
        givenEmployeeList.add(new Employee("Jake","Jacobson", "Programmer", ""));
        givenEmployeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        givenEmployeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        expectedTreeMap = new TreeMap<>();
        expectedTreeMap.put("Johnson",
                new Employee("John", "Johnson", "Manager", "2016-12-31"));
        expectedTreeMap.put("Xiong",
                new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        expectedTreeMap.put("Michaelson",
                new Employee("Michaela", "Michaelson","District Manager", "2015-12-19"));
        expectedTreeMap.put("Jacobson",
                new Employee("Jake","Jacobson", "Programmer", ""));
        expectedTreeMap.put("Jackson",
                new Employee("Jacquelyn", "Jackson", "DBA", ""));
        expectedTreeMap.put("Webber",
                new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

    }

    @Test
    void createEmployeeList() {

        List<Employee> actual = test.createEmployeeList();

        for (int i = 0; i < givenEmployeeList.size(); i++) {
            System.out.printf("Expected: %s %n" + "Actual: %s %n", givenEmployeeList.get(i).getFirstName(), actual.get(i).getFirstName());
            assertEquals(givenEmployeeList.get(i).getFirstName(), actual.get(i).getFirstName());
            //assuming if first names are right, everything is. but if this was REAL production code id test more
        }
    }

    @Test
    void createEmployeeTreeMap() {

        TreeMap<String, Employee> actual = (TreeMap<String, Employee>) test.createEmployeeTreeMap(givenEmployeeList);

        System.out.printf("Expected: %s %n" + "Actual: %s %n", expectedTreeMap.firstEntry().getKey(), actual.firstEntry().getKey());
        assertEquals(expectedTreeMap.firstEntry().getKey(), actual.firstEntry().getKey());

    }
}