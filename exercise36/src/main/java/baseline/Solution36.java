/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.round;

public class Solution36 {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Create instance of Solution36
        Solution36 sol = new Solution36();

        //Get input data from user using getInputFromUser()
        List<Integer> integerList = sol.getIntegerListFromUser("Enter a number: ");

        //Print all the numbers given by the user using printAllNumbers()
        System.out.printf("%s%n", sol.generateStringOutput(integerList));

        //Print the average using average()
        System.out.printf("The average is %.1f%n", sol.average(integerList));

        //Print the minimum using min()
        System.out.printf("The minimum is %d%n", sol.min(integerList));

        //Print the maximum using max()
        System.out.printf("The maxmimum is %d%n", sol.max(integerList));

        //Print the standard deviation using std()
        System.out.printf("The standard deviation is %.2f%n", sol.std(integerList));

    }

    public double average(List<Integer> integerList) {

        /*
        Calculates the average of every number in an List of integers
         */

        //I actually think I can do this in one line with some Java wizardry, but I'll write out the expected method

        //Initalize sum to 0
        int sum = 0;

        //For every element of ingerList, add the element to sum
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }

        //Calculate and return average
        return sum/integerList.size();
    }
    public int min(List<Integer> integerList) {

        /*
        Returns the smallest thing in a list of integers
         */

        //If integerList is empty, return 0
        if(integerList.isEmpty()) return 0;

        //Initalize record to the first element of the list
        int record = integerList.get(0);

        //For every element in integerList, set the record to the current element if it is smaller
        for (int i = 0; i < integerList.size(); i++) if(integerList.get(i) < record) record = integerList.get(i);

        //Return the record
        return record;

    }
    public int max(List<Integer> integerList) {

        /*
        Returns the largest thing in a list of integers
         */

        //If integerList is empty, return 0
        if(integerList.isEmpty()) return 0;

        //Initalize record to 0
        int record = 0;

        //For every element in integerList, set the record to the current element if it is bigger
        for (int i = 0; i < integerList.size(); i++) if(integerList.get(i) > record) record = integerList.get(i);

        //Return the record
        return record;
    }
    public double std(List<Integer> integerList) {

        /*
        Returns the standard deviation
         */

        //Initalize totalSqDiffToMean to 0
        double totalSqDiffToMean = 0;

        //Find the mean of integerList
        double mean = average(integerList);

        //For each data point:
        for (int i = 0; i < integerList.size(); i++) {

            double val = integerList.get(i);

            //Find the square of the distance from this point to the mean and add to totalSqDiffToMean
            totalSqDiffToMean += Math.pow(val - mean, 2);

        }

        //Divide totalSqDiffToMean by the number of datapoints to find meanDiff
        double meanDiff = (double) totalSqDiffToMean/ (double) integerList.size();

        //Return the square root of meanDiff
        return Math.sqrt(meanDiff);
    }

    private List<Integer> getIntegerListFromUser(String prompt) {

        /*
        Prompts the user with the passed string, reads an input, adds it to an array, and loops over again.
        The loop stops if the user enters the specific defined string, in this case it is "done"
         */

        //Create new blank integer list
        List<Integer> integerList = new ArrayList<>();

        //Loop
        while(true) {

            //Print prompt to console.
            System.out.printf("%s", prompt);

            //Read in the console input as a string.
            String input = sc.nextLine();

            //If string is equal to "done", break the loop
            if(input.equals("done")) break;

            //Determine if the string is a integer
            try{

                //If yes, add that integer to the list
                integerList.add(Integer.parseInt(input));

            } catch(NumberFormatException e) {

                //If not, print that the input is not a valid input
                System.out.printf("%s%n", "Please enter integer inputs only.");

            }
        }

        //Return the list of inputs
        return integerList;

    }
    private String generateStringOutput(List<Integer> integerList) {

        /*
        Prints all the integers in a list in the order they appear.
         */

        StringBuilder output = new StringBuilder();

        //Add "Numbers: " to output prior to listing elements
        output.append("Numbers: ");

        //If integerList is empty, return output.
        if(integerList.isEmpty()) return output.toString();

        //Loop that runs for as many elements are in integerList
        for (int i = 0; i < integerList.size(); i++) {

            //Add element to output
            output.append(String.format("%d", integerList.get(i)));

            //If num does not equal the last element, add a comma and space to console
            if(i != integerList.size()-1) output.append(", ");
        }

        //Return output
        return output.toString();
    }

}
