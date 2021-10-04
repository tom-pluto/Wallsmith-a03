/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.*;

public class Solution37 {

    private final Scanner sc = new Scanner(System.in);
    private final Random rand = new Random();

    public static void main(String[] args) {

        Solution37 sol = new Solution37();

        //Get inputs from user
        int minLength = sol.getIntegerInput("What's the minimum length?");
        int numSpecialChar = sol.getIntegerInput("How many special characters?");
        int numNumbers = sol.getIntegerInput("How many numbers?");

        //Create password & print
        System.out.printf("Your password is %s%n", sol.generatePassword(minLength, numSpecialChar, numNumbers));
    }

    public String generatePassword(int min, int numSpecialChar, int numNumbers) {

        final List<Character> specialChars = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*' , '_', '+');
        final List<Character> letters = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        final List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

        List<Character> output = new ArrayList<>();

        //Add number of numbers to the string
        for (int i = 0; i < numNumbers; i++) {

            output.add(numbers.get(rand.nextInt(10)));

        }

        //Add number of special characters to the string
        for (int i = 0; i < numSpecialChar; i++) {

            output.add(specialChars.get(rand.nextInt(10)));

        }

        //Add number of letters to the string
        //(making sure there are at least as many letters as there are special characters and numbers)
        for (int i = 0; i < numSpecialChar+numNumbers; i++) {

            output.add(letters.get(rand.nextInt(26)));

        }
        while(output.size() < min) {

            output.add(letters.get(rand.nextInt(26)));

        }

        //Shuffle the string
        Collections.shuffle(output);

        //Create regular looking string
        StringBuilder sOutput = new StringBuilder();
        for (Character character : output) {
            sOutput.append(character);
        }

        //Return the string
        return sOutput.toString();

    }

    private int getIntegerInput(String prompt) {

        //Loop
        while(true) {

            //Prompt user
            System.out.printf("%s ", prompt);

            //Read input
            String input = sc.nextLine();

            //Attempt to convert input to int
            try {

                //Works : Return converted input
                return Integer.parseInt(input);

            } catch(NumberFormatException e) {

                //Fails : Print error Loop again
                System.out.printf("%s%n", "Please enter an integer input.");

            }
        }
    }
}
