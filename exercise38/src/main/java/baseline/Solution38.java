/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution38 {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Solution38 sol = new Solution38();

        //Prompt user for input string                          getInputString()
        String input = sol.getInputString();

        //Chop up input string into a list                      convertInputStringToList()
        List<Integer> integerList = sol.convertInputStringToList(input);

        //Create a new list with just the even numbers          filterEvenNumbers()
        List<Integer> evenList = sol.filterEvenNumbers(integerList);

        //Print that list                                       printList()
        sol.printList(evenList);

    }

    private String getInputString() {

        //Prompt user to enter string
        System.out.printf("%s ", "Enter a list of numbers, separated by spaces:");

        //Read string, only stopping when there is a newline
        return sc.nextLine();

    }

    public List<Integer> convertInputStringToList(String input) {

        //Create new list
        List <Integer> integerList = new ArrayList<>();

        //Remove any element that is not an integer, adding the rest to the list
        char[] arr = input.toCharArray();
        for(char element : arr) if(Character.isDigit(element)) {
            integerList.add(Integer.parseInt(String.valueOf(element)));
        }

        return integerList;
    }

    public List<Integer> filterEvenNumbers(List<Integer> ogList) {

        List<Integer> newList = new ArrayList<>();

        //For all elements, if the element is an even number, add it to the output list
        for (int num : ogList) if(isEven(num)) newList.add(num);

        //Return the output list
        return newList;
    }

    public boolean isEven(int x) {
        if ((x % 2) == 0) {
            return true;//even
        } else {
            return false; //odd
        }
    }

    private void printList(List<Integer> list) {

        //Print "The even numbers are "
        System.out.printf("%s", "The even numbers are");

        //Iterate through list
            //Print element
        for(int num : list) {

            System.out.printf(" %d", num);

        }
        System.out.printf("%s%n", ".");
    }
}
