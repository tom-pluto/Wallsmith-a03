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

import java.util.Scanner;

import static java.lang.String.format;

public class Solution31 {

    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        Solution31 solution = new Solution31();

        //Prompt and read in restingHR using getInput()
        int restingHR = solution.getInput("Enter resting heart rate: ");

        //Prompt and read in age using getInput()
        int age = solution.getInput("Enter age: ");

        //Build array containing KHR formula results
        int[] data = solution.getData(restingHR, age);

        //Call getOutput() and output result
        System.out.printf("%s", solution.getOutput(data, restingHR, age));

    }

    public int[] getData(int restingHR, int age) {

        /*
        Returns an array[9] with the results of Karvonen Heart Rate formula with each element storing the intensity
        55+(5n)
         */

        int[] data = new int[9];
        int i = 0;
        for (int intensity = 55; intensity <= 95; intensity += 5) {         //For loop incrementing intensity by 5
            data[i] = getTargetHeartRate(restingHR, age, intensity);            //Calls KHR formula and stores result
            i++;
        }

        return data;
    }


   public String getOutput(int[] data, int restingHR, int age) {

        /*
        Generates the wacky output table.
        Conceptually, it generates the table procedurally, moving from the top to the bottom.
        A loop is used to add the intensities to the output string, accessing the data[] array
         */

        StringBuilder output = new StringBuilder();                                         //input top half of table
        output.append(format("%nResting Pulse: %d%13s%d%n%n", restingHR, "Age: ", age));
        output.append(format("Intensity    | Rate%n-------------|--------%n"));
        for (int i = 0; i < 9; i++) {                                                       //add all the intensities
            output.append(format("%d%%          | %d bpm%n", 55 + (5 * i), data[i]));
        }

        return output.toString();                                                           //return the output string
    }


    private int getTargetHeartRate(int restingHR, int age, int intensity) {

        /*
        Returns the result of the following formula:
            (((220 - age) - restingHR) * intensity) + restingHR
         */

        return (int)Math.round((((220 - age) - restingHR) * (intensity/100.0)) + restingHR);
    }


    private int getInput(String prompt) {

        /*
        Prompts and reads in an input. Will only accept the input if it's an integer.
        Works by catching an exception thrown when parsing the input string into an integer.
            1. If the exception is thrown, the method will prompt and read in a new input
            2. If not, the input is returned as an integer.
         */

        while(true) {                                                                   //Loop
            System.out.printf("%s", prompt);                                            //Output prompt to console
            String input = sc.next();                                                   //Read console input to string
            try {
                return Integer.parseInt(input);                                         //Return the input as int
            } catch(NumberFormatException e) {                                              //If not an int, loop again
                System.out.printf("%s%n", "Please enter a valid numeric input.");
            }
        }
    }
}
