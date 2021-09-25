/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.Scanner;

public class Solution29 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int rate = getRate();                           //Call getRate() to prompt and read in valid input
        System.out.printf("%s%n", getYears(rate));      //Print output string from getYears()

    }

    public static String getYears(int rate) {

        /*
        Calculates the number of years needed to double the initial investment.
        Returns string stating the number of years needed to double the initial investment.
        Formula : 72 / r
         */

        int years = 72/rate;
        return  String.format("It will take %d years to double your initial investment.", years);
    }

    private static int getRate() {

        /*
        Prompts for the rate of return and only accepts a numeric value
         */

        //Loop
            //Prompt "What is the rate of return? " & read for rate
            //If rate is a number and greater than 0, break the loop
            //Else, print "Sorry. That's not a valid input.\n"
        //Return rate

        String input;
        int rate;

        while(true){
            System.out.printf("%s", "What is the rate of return? ");
            input = sc.next();

            try {
                rate = Integer.parseInt(input);
                if(rate > 0){
                    break;  //exits loop if input does not create a NumberFormatException and is greater than 0
                }
                System.out.printf("Sorry. That's not a valid input.%n");
            }catch(NumberFormatException e) {       //uses an exception catch to detect if input is not an integer
                System.out.printf("Sorry. That's not a valid input.%n");
            }

        }

        return rate;
    }
}
