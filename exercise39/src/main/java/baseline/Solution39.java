/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution39 {

    public static void main(String[] args) {

        Solution39 sol = new Solution39();

        //Generate the set of employees first as a list     createEmployeeList()
        List<Employee> employeeList = sol.createEmployeeList();

        //Convert the list to a TreeMap                     createEmployeeTreeMap()
        TreeMap<String, Employee> employeeTreeMap = (TreeMap<String, Employee>) sol.createEmployeeTreeMap(employeeList);

        //Output the TreeMap as a table                     outputEmployeeTreeMap()
        sol.outputEmployeeTreeMap(employeeTreeMap);

    }

    public List<Employee> createEmployeeList() {

        //Create new list
        List<Employee> employeeList = new ArrayList<>();

        //Hardcode in given data set
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Employee("Michaela", "Michaelson","District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake","Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        //Return constructed data set
        return employeeList;

    }

    public SortedMap<String, Employee> createEmployeeTreeMap(List<Employee> employeeList) {

        //Create empty TreeMap
        TreeMap<String, Employee> employeeTreeMap = new TreeMap<>();

        //For each element of employeeList
        for(Employee element : employeeList) {

            //Add that employee to the TreeMap, with the lastName as the key
            employeeTreeMap.put(element.getLastName(), element);
        }

        //Return the TreeMap
        return employeeTreeMap;

    }

    private void outputEmployeeTreeMap(TreeMap<String, Employee> employeeTreeMap) {

        StringBuilder output = new StringBuilder();

        //Output top of table
        output.append(String.format("%-25s|%-25s|%-25s%n", " Name", " Position", " Separation Date"));
        output.append(String.format("%s%n", "-------------------------|-------------------------|-------------------------")); //padding by 20?

        //Start at topmost entry
        Map.Entry<String, Employee> curr = employeeTreeMap.firstEntry();

        //Loop and output contents of top of TreeMap
        for (int i = 0; i < employeeTreeMap.size(); i++) {

            //Form full name
            String fullName = curr.getValue().getFirstName() + " " + curr.getValue().getLastName();

            //Get position
            String position = curr.getValue().getPosition();

            //Get separation date (can be empty!)
            String separationDate = curr.getValue().getSeparationDate();

            String lineOutput = String.format("%-25s|", " " + fullName) +
                    String.format("%-25s|", " " + position) +
                    String.format("%-25s%n", " " + separationDate);
            output.append(lineOutput);

            //Move working map entry to the next highest
            curr = employeeTreeMap.higherEntry(curr.getValue().getLastName());
        }

        System.out.printf("%s", output);

    }
}
