/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution34 {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Solution34 solution = new Solution34();

        //Generate ArrayList of employees with names from the assignment instructions
        List<String> employeeList = solution.getNewEmployeeList(new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"});

        //Print the list
        solution.printEmployeeList(employeeList);

        //Prompt for an employee name to be removed
        String targetEmployee = solution.getInput();
        System.out.printf("%n");

        //Remove that employee from the list
        employeeList = solution.removeEmployeeFromList(employeeList, targetEmployee);

        //Print the list
        solution.printEmployeeList(employeeList);

    }

    public List<String> getNewEmployeeList(String[] employeeNames) {

        /*
        Takes a passed in array of strings containing employee names and creates a ArrayList containing those names.
         */

        //Return employeeNames as ArrayList
        return new ArrayList<>(Arrays.asList(employeeNames));                                                           //Return the ArrayList

    }
    public List<String> removeEmployeeFromList(List<String> employeeList, String targetEmployee) {

        /*
        Removes the employee matching the string from the supplied list, and returns the new list.
         */

        //Remove employee from list
        employeeList.remove(targetEmployee);

        //Return new list w/o the employee in it
        return employeeList;

    }

    private void printEmployeeList(List<String> employeeList) {

        /*
        Prints the passed ArrayList (representing a list of employees) to the console.
         */

        //Print how many employees there are
        System.out.printf("There are %d employees:%n", employeeList.size());

        //Print each employee
        for(String str: employeeList) {
            System.out.printf("%s%n", str);
        }

    }
    private String getInput() {

        /*
        Prompts the user to enter something, and reads it in. Returns a string.
         */

        //Prompt console for input
        System.out.printf("%n%s", "Enter an employee name to remove: ");

        //Return user's string input
        sc.useDelimiter("\n");
        return sc.next();

    }
}
