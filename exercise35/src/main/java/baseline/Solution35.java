/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.*;

public class Solution35 {

    private final Scanner sc = new Scanner(System.in);
    private final Random random =  new Random();

    public static void main(String[] args) {

        //Create instance of Solution35
        Solution35 solution = new Solution35();

        //Read in names from user                                               preformed by getNamesFromUser()
        List<String> nameList = solution.getNamesFromUser();

        //Generate random number to be used as the "winning" index              preformed by getRandomInteger()
        int winningIndex = solution.getRandomInteger(nameList.size());

        //Find name at particular index                                         preformed by findName()
        String winner = solution.findName(nameList, winningIndex);

        //Print winner
        System.out.printf("The winner is... %s.", winner);

    }

    private List<String> getNamesFromUser() {

        /*
        Prompts for the names of contestants, stopping only when the input is left blank.
        Returns all the names as a String List.
         */

        //Create a new list
        List<String> nameList = new ArrayList<>();

        //Loop
        while(true) {

            //Prompt user for name
            System.out.printf("%s", "Enter a name: ");

            //Read input
            String input = sc.nextLine();

            //Determine if input is blank
            if(Objects.equals(input, "")) {

                //Yes : Break loop
                break;

            }

            //Add input to list
            nameList.add(input);
        }

        //Return list
        return nameList;
    }

    public int getRandomInteger(int max) {

        /*
        Returns an random integer between 1 and a max value.
         */

        //Return random number between min and max
        return random.nextInt(max);

    }

    public String findName(List<String> names, int n) {

        /*
        Returns the name as a string of the element at a particular index of a list.
         */

        //Return the name that is the nth thing in the list
        return names.get(n);
    }
}
