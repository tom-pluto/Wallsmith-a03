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

//DEAR GRADER: I'm assuming this assigment is requesting integers, so that's what I did. Wasn't clear though...

package baseline;

import java.util.Scanner;

public class Solution28 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Solution28 solution = new Solution28();

        int[] inputArray = solution.getInput();                 //Populate array by calling getInput()
        int total = solution.getSum(inputArray);                //Calculate total by calling getSum()
        System.out.printf("%s", solution.getOutput(total));     //Print output

    }
    public int getSum(int[] inputArray){

        /*
        Takes in an array and returns the sum of that array.
         */

        int sum = 0;                                //Initialize sum to 0
        for(int i : inputArray) sum += i;           //Increment through array, adding each element to sum
        return sum;                                 //Return sum
    }

    private String getOutput(int total){
        return "The total is "+total+".\n";
    }

    private int[] getInput() {

        /*
        Prompts the user for a number in 5 times, returning results in elements 0-4 inclusive of the passed array.
         */

        int[] inputArray = new int[5];

        for (int i = 0; i < 5; i++) {                           //Iterates through array
            System.out.printf("%s", "Enter a number: ");        //Prompt each iteration for a number
            inputArray[i] = sc.nextInt();                       //Read number into inputArray[i]
        }

        return inputArray;
    }
}
