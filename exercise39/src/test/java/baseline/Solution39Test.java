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
    private final List<Employee> expectedEmployeeList = new ArrayList<>();
    private final TreeMap<String, Employee> expectedEmployeeTreeMap = new TreeMap<>();

    @BeforeEach
    void beforeEach() {

        expectedEmployeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        expectedEmployeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        expectedEmployeeList.add(new Employee("Michaela", "Michaelson","District Manager", "2015-12-19"));
        expectedEmployeeList.add(new Employee("Jake","Jacobson", "Programmer", ""));
        expectedEmployeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        expectedEmployeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        expectedEmployeeTreeMap.put("Johnson",
                new Employee("John", "Johnson", "Manager", "2016-12-31"));
        expectedEmployeeTreeMap.put("Xiong",
                new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        expectedEmployeeTreeMap.put("Michaelson",
                new Employee("Michaela", "Michaelson","District Manager", "2015-12-19"));
        expectedEmployeeTreeMap.put("Jacobson",
                new Employee("Jake","Jacobson", "Programmer", ""));
        expectedEmployeeTreeMap.put("Jackson",
                new Employee("Jacquelyn", "Jackson", "DBA", ""));
        expectedEmployeeTreeMap.put("Webber", new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

    }

    @Test
    void createEmployeeList() {

        List<Employee> actual = test.createEmployeeList();

        assertEquals(expectedEmployeeList, actual);

    }

    @Test
    void createEmployeeTreeMap() {

        TreeMap<String, Employee> actual = test.createEmployeeTreeMap(expectedEmployeeList);

        assertEquals(expectedEmployeeTreeMap, actual);

    }
}