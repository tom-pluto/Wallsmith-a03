/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Employee")
class EmployeeTest {

    private final Employee testEmployee = new Employee("Thomas", "Wallsmith", "God", "9999-99-99");

    @Test
    void getFirstName() {
        String expected = "Thomas";
        assertEquals(expected, testEmployee.getFirstName());
    }

    @Test
    void getLastName() {
        String expected = "Wallsmith";
        assertEquals(expected, testEmployee.getLastName());
    }

    @Test
    void getPosition() {
        String expected = "God";
        assertEquals(expected, testEmployee.getPosition());
    }

    @Test
    void getSeparationDate() {
        String expected = "9999-99-99";
        assertEquals(expected, testEmployee.getSeparationDate());
    }
}