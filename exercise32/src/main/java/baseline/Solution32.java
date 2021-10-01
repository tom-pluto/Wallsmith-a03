/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Exercise 32 - Guess the Number Game
    Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number
    between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between
    1 and 1000.
    Prompt for the difficulty level, and then start the game.
    The computer picks a random number in that range and prompts the player to guess that number.
    Each time the player guesses, the computer should give the player a hint as to whether the number is too high or
    too low.
    The computer should also keep track of the number of guesses.
    Once the player guesses the correct number, the computer should present the number of guesses and ask if the player
    would like to play again.
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {

    private static final Scanner sc = new Scanner(System.in);
    private static final String PLEASE_ENTER_A_VALID_INPUT = "Please enter a valid input.";     //SonarLint made me do this.
    private static final Random rand = new Random();

    public static void main(String[] args) {

        Solution32 solution = new Solution32();

        //Print out Welcome Message
        System.out.printf("%s%n", "Let's play Guess the Number!");

        //Call startRandomGame() to start the main game loop
        solution.startRandomGame();

    }

    private void startRandomGame() {

        /*
        Handles multiple replaying of the random game. Prompts for difficulty before generating answer and starting.
        At the end, the game will ask the user if they would like to play again. If yes, the method loops.
         */

        while(true) {
            playRandomGame(generateRandomInt(getMax()));
            String answer = getYN();
            if(answer.equals("N")) return;
        }
    }

    private String getYN() {

        /*
        Prompts the user if they want to play again and ONLY accepts a Y or N response (non-case sensitive)
         */

        while(true) {
            System.out.printf("%s ", "Do you wish to play again (Y/N)?");       //Prompt user
            String answer = sc.next();                                          //Read input
            answer = answer.toUpperCase();                                      //Make capital

            if(answer.equals("N") || answer.equals("Y"))                        //If input is "Y" or "N"
                return answer;                                                      //Return input
            else                                                                //Otherwise
                System.out.printf("%s%n", PLEASE_ENTER_A_VALID_INPUT);           //Prompt user to enter valid input
        }
    }

    private int getMax() {

        /*
        Gets the difficulty from the user (using getDifficult()) and then converts it to the maximum random
        number (using detemineMax())
         */
        return determineMax(getDifficulty());
    }

    private int getDifficulty() {
        /*
        Prompts the user for the difficulty level, and only accepts the input if it's 1, 2, or 3
         */
        int difficulty;
        while(true) {
            System.out.printf("%n%s ", "Enter the difficulty level (1, 2, or 3):");
            String input = sc.next();

            String enterValid = PLEASE_ENTER_A_VALID_INPUT;
            try {
                difficulty = Integer.parseInt(input);   //will throw NumberFormatException to be caught if invalid
                if(difficulty == 1 || difficulty == 2 || difficulty == 3) {
                    break;
                    //Is valid!
                }
                else {
                    System.out.printf("%s%n", enterValid);
                    //Tries again
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s%n", enterValid);
                //Tries again
            }
        }
        return difficulty;
    }

    public boolean is123(String input) {

        /*
        Determines if the passed string is the integers 1, 2, or 3
         */

        //Tests if the input is an integer
        if(isInteger(input)) {

            //Convert to integer
            int num = Integer.parseInt(input);

            //Test if number is 1 2 or 3
            return num == 1 || num == 2 || num == 3;
        }
        else //not a integer
            return false;
    }

    public int determineMax(int difficulty) {

        /*
        Returns the corresponding max random number for requested difficulty.
        1 : 10
        2 : 100
        3 : 1000
         */

        if(difficulty == 1) {
            return 10;
        }
        else if(difficulty == 2) {
            return 100;
        }
        else {
            return 1000;
        }
    }

    private void playRandomGame(int answer) {

        /*
        Runs the random game with the answer being passed to it. Different from startGame() since this simply runs the
        game and does not generate an answer or asks to play again.
         */

        int tries = 0;
        int guess = getIntegerInput("I have my number. What's your guess? ");

        while(true) {
            tries++;

            //I originally had an if else tree here, but SonarLint didn't like it. Not sure why...
            if(guess > answer) {   //If guess is too high
                guess = getIntegerInput("Too high. Guess again: ");
            }
            if(guess < answer) {   //If guess is too low
                guess = getIntegerInput("Too low. Guess again: ");
            }
            if(guess == answer) {  //If guess is correct
                System.out.printf("You got it in %d guesses!%n%n", tries);
                break;
            }
        }
    }

    private int getIntegerInput(String prompt) {

        /*
        Prints a prompt and reads in an input from the console. Only returns the input if it is an integer.
         */

        while(true) {
            System.out.printf("%s", prompt);        //Prompts user for input
            String input = sc.next();               //Read input
            try {                                   //Tries to convert to integer
                return Integer.parseInt(input);         //Returns if valid
            } catch(NumberFormatException e) {
                System.out.printf("%s%n", PLEASE_ENTER_A_VALID_INPUT);
            }
        }
    }

    public boolean isInteger(String input) {

        /*
        Determines if a passed string input is a valid integer. If yes, returns true. If not, returns false.
         */

        try {
            Integer.parseInt(input);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }

    }

    private int generateRandomInt(int max) {

        /*
        Generates random number between integers min and max.
         */

        return rand.nextInt(max);
    }
}
