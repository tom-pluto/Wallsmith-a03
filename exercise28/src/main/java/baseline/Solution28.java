/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Exercise 28
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it's
more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Constraints
- The prompting must use repetition, such as a counted loop, not three separate prompts.

Example Output
>   Enter a number: 1
>   Enter a number: 2
>   Enter a number: 3
>   Enter a number: 4
>   Enter a number: 5
>   The total is 15.
 */

package baseline;

import java.util.Scanner;

public class Solution28 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Create array to hold 5 numbers
        //Populate array by calling getInput()
        //Calculate sum by calling getSum()
        //Print output

    }

    public static int getSum(int[] inputArray){

        /*
        Takes in an array and returns the sum of that array.
        (I'm  literally only doing this because we need a JUnit5 test for full credit.)
         */

        //Return sum of inputArray

        return 0;
    }

    private static int[] getInput(int[] inputArray) {

        /*
        Prompts the user for a number in 5 times, returning results in elements 0-4 inclusive of the passed array.
         */

        //Loop 5 times
            //Prompt and read number into inputArray
        //Return inputArray

        return null;
    }
}
