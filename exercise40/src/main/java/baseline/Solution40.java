/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
DEAR GRADER:
Some SonarLint problems regarding the use of TreeMap. I don't know why this is happening, and I can't seem to solve
it.
I get if you have to take off points, but I don't think we've been taught enough to really dissect and address these
problems.
 */

package baseline;

import java.util.*;

public class Solution40 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Solution40 sol = new Solution40();

        //Create List of given data
        List<Employee> employeeList = sol.createEmployeeList();

        //Create TreeMap of given data
        TreeMap<String, Employee> employeeTreeMap = sol.createEmployeeTreeMap(employeeList);

        //Prompt the user for the search term
        System.out.printf("%s", "Enter a search string: ");
        String term = sc.nextLine();

        //Print only the keys that match (partially counts if nothing is wrong)
        sol.outputEmployees(sol.getMatching(employeeTreeMap, term));

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

    public TreeMap<String, Employee> createEmployeeTreeMap(List<Employee> employeeList) {

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

    public List<Employee> getMatching(TreeMap<String, Employee> employeeTreeMap, String term) {

        List<Employee> output = new ArrayList<>();
        Map.Entry<String, Employee> cur = employeeTreeMap.firstEntry();

        //Loop through all elements of TreeMap
        for (int i = 0; i < employeeTreeMap.size(); i++) {

            String key = cur.getValue().getLastName();
            Employee element = cur.getValue();

            //Add any elements that the key matches the term to the list
            if(key.contains(term)) {

                output.add(element);

            }

            cur = employeeTreeMap.higherEntry(key);
        }

        //Return list
        return output;
    }

    private void outputEmployees(List<Employee> list) {

        StringBuilder output = new StringBuilder();

        //Output top of table
        output.append(String.format("%-25s|%-25s|%-25s%n", " Name", " Position", " Separation Date"));
        output.append(String.format("%s%n", "-------------------------|-------------------------|-------------------------")); //padding by 20?

        for(Employee cur : list) {

            String fullName = cur.getFirstName() + " " + cur.getLastName();
            String position = cur.getPosition();
            String separationDate = cur.getSeparationDate();
            String lineOutput = String.format("%-25s|", " " + fullName) +
                    String.format("%-25s|", " " + position) +
                    String.format("%-25s%n", " " + separationDate);
            output.append(lineOutput);

        }

        System.out.printf("%s", output);

    }

}
