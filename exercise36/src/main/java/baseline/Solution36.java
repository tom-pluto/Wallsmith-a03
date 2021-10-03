/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.List;

public class Solution36 {

    //Private scanner declaration goes here

    public static void main(String[] args) {

        //Get input data from user                              getInputFromUser()
        //Print all the numbers given by the user               printAllNumbers()
        //Print the average                                     average()
        //Print the minimum                                     min()
        //Print the maximum                                     max()
        //Print the standard deviation                          std()

    }

    /*PROTOTYPED*/ public double average(List<Integer> integerList) {

        /*
        Calculates the average of every number in an List of integers
         */

        //I actually think I can do this in one line with some Java wizardry, but I'll write out the expected method

        //For every element of ingerList
            //sum += element
        //Average = sum/(length of integerList)
        //Return average

        return 0;
    }
    /*PROTOTYPED*/ public int min(List<Integer> integerList) {

        /*
        Returns the smallest thing in a list of integers
         */

        //Determine if integerList is populated
            //No : Return 0

        //Initalize record to the first element of the list

        //For every element in integerList
            //If the element is smaller than the record, set the record to the current element's value

        //Return the record

        return 0;
    }
    /*PROTOTYPED*/ public int max(List<Integer> integerList) {

        /*
        Returns the largest thing in a list of integers
         */

        //Determine if integerList is populated
            //No : Return 0

        //Initalize record to the first element of the list

        //For every element in integerList
            //If the element is greater than the record, set the record to the current element's value

        //Return the record

        return 0;
    }
    /*PROTOTYPED*/ public double std(List<Integer> integerList) {

        /*
        Returns the standard deviation
         */

        //Initalize totalSqDiffToMean to 0

        //Find the mean of integerList
        //For each data point:
            //Find the square of the distance from this point to the mean (sqDiffToMean)
            //Add sqDiffToMean to totalSqDiffToMean
        //Divide totalSqDiffToMean by the number of datapoints to find meanDiff
        //Return the square root of meanDiff

        return 0;
    }

    /*PROTOTYPED*/ private List<Integer> getManyStringsFromUser(String prompt) {

        /*
        Prompts the user with the passed string, reads an input, adds it to an array, and loops over again.
        The loop stops if the user enters the specific defined string, in this case it is "done"
         */

        //Create new blank integer list
        //Loop
            //Print prompt to console.
            //Read in the console input as a string.
            //Determine if string is equal to "done".
                //If true, break the loop.
            //Determine if the string is a integer
                //If yes, add that integer to the list
                //If not, print that the input is not a valid input
        //Return the list of inputs

        return null;
    }
    /*PROTOTYPED*/ private void printAllNumbers(List<Integer> integerList) {

        /*
        Prints all the integers in a list in the order they appear.
         */

        //Print "Numbers: " prior to listing elements
        //Loop that runs for as many elements are in integerList
            //Print element to console
        //Print newline to console

    }

}
