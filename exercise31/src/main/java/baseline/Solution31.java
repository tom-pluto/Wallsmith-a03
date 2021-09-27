/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 *
 *  Exercise 31 - Karvonen Heart Rate
 *  -   When you loop, you can control how much you increment the counter; you don't always have to increment by one.
 *
 *  -   When getting into a fitness program, you may want to figure out your target heart rate so you don't overexert
 *      yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program
 *      that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart
 *      rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example
 *      output. The formula is:
 *          TargetHeartRate = (((220 - age) - restingHR) * intensity) + restingHR
 *
 *  Constraints:
 *  -   Don't hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
 *  -   Ensure that the heart rate and age are entered as numbers. Don't allow the user to continue without entering
 *      valid inputs. Display the results in a tabular format.
 */

/*
Example Output
>   Resting Pulse: 65        Age: 22

>   Intensity    | Rate
>   -------------|--------
>   55%          | 138 bpm
>   60%          | 145 bpm
>   65%          | 151 bpm
>   70%          | 158 bpm
>   75%          | 165 bpm
>   80%          | 171 bpm
>   85%          | 178 bpm
>   90%          | 185 bpm
>   95%          | 191 bpm
 */

package baseline;

public class Solution31 {
    public static void main(String[] args) {

        //Prompt and read in restingHR using getInput()
        //Prompt and read in age using getInput()
        //Call getData() to build an array of heart rates from 55%-95%
        //Call getOutput() and output result

    }
    public static int[] getData(int restingHR, int age) {

        /*
        Returns an array[9] with the results of Karvonen Heart Rate formula:
            (((220 - age) - restingHR) * intensity) + restingHR
            - intensity = 55+(5*element) where element is the current element in the array[0-8]
         */

        //For loop incrementing intensity by 5 until it is larger than 95
            //Store value as result of targetHeartRate(restingHR, age, intensity)
            //Increment array element counter
        //Return array

        return null;
    }
    public static String getOutput(int[] data, int restingHR, int age) {

        /*
        Generates the wacky output table.
        Not totally set on how I want this to work, but it is going to work in two steps.
            1. Printing the stuff not reliant on the data[]
            2. Printing the stuff that I need to access data[] for
        I'll probably end up using the StringBuilder object thingy for simplicity, but I don't anticipate that this is
        going to be a challenge.
        I'll have to end up using string padding n' stuff, but it'll be okay.
         */

        //input top half of table + restingHR & age data
        //Increment through data array
            //add "55+(5*element)%     | data bpm"
        //Return output

        return "";
    }
    private static int getInput(String prompt) {

        /*
        Prompts and reads in an input. Will only accept the input if it's an integer.
        Works by catching an exception thrown when parsing the input string into an integer.
            1. If the exception is thrown, the method will prompt and read in a new input
            2. If not, the input is returned as an integer.
         */

        //Loop
        //Output prompt to console
        //Read console input
        //Determine if input is an integer
            //If yes, break the loop
            //If no, tell console to put in an integer
        //Return input

        return 0;
    }
}
