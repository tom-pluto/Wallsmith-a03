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

public class Solution32 {

    public static void main(String[] args) {

        //Display welcome message
        //Call startRandomGame

    }

    private static void startRandomGame() {

        /*
        Handles multiple replaying of the random game. Prompts for difficulty before generating answer and starting.
        At the end, the game will ask the user if they would like to play again. If yes, the method loops.
         */

        //Loop
            //Prompt for difficulty
            //If difficulty == 1
                //max = 10
            //If difficulty == 2
                //max = 100
            //If difficulty == 3
                //max = 1000
            //answer = generateRandomInt(1, max)
            //Prompt for user to play again
                //If yes    : do nothing and loop again
                //If no     : break loop
    }

    private static void playRandomGame(int answer) {

        /*
        Runs the random game with the answer being passed to it. Different from startGame() since this simply runs the
        game and does not generate an answer or asks to play again.
         */

        //Prompt user for their initial guess
        //Loop
            //Read in userGuess
            //If userGuess > answer
                //Print that guess is too large and to guess again
                //Increment n
            //If userGuess < answer
                //Print that the guess is too large and to guess again
                //Increment n
            //If userGuess == answer
                //Print that they got the guess right in n guesses
                //Break loop
    }

    private static int generateRandomInt(int min, int max) {

        /*
        Generates random number between integers min and max.
         */

        //Range = (max - min) + 1
        //Return (int)(Math.random() * Range) + min

        return 0;
    }
}
