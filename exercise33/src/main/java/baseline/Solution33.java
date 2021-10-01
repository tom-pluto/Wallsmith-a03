/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {

        //Create instance
        Solution33 solution = new Solution33();

        //Ask for user's question
        solution.askQuestion();

        //Print random response
        System.out.printf("%s", solution.getRandomResponse());
        
    }

    public String getRandomResponse() {
        
        /*
        Gets a random number 1-4 and uses it to choose between 4 responses:
                "Yes."       "No."        "Maybe."     "Ask again later."
         */

        int randomNumber = getRandomNumberBetween1And4();   //Get Random number

        if(randomNumber == 1) return "Yes.";                //If the random number equals 1, return "Yes."
        if(randomNumber == 2) return "No.";                 //If the random number equals 2, return "No."
        if(randomNumber == 3) return "Maybe.";              //If the random number equals 3, return "Maybe."
        else return "Ask again later.";             //If the random number equals 4, return "Ask again later."
    }
    public int getRandomNumberBetween1And4() {
        
        /*
        Creates a random number between 1 and 4 inclusive
         */

        return rand.nextInt(4)+1;

    }

    private void askQuestion() {
        
        /*
        Asks for a user's question, and then completes disregards it because WHO CARES LOL!
         */
        
        //Prompt user for question.
        System.out.printf("%s%n> ", "What's your question?");
        //Read in question into nothing because nobody cares what you have to say. They all just pretend to care.
        in.next();
    }

}
