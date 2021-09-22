/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 *
 *  Exercise 24 - Anagram Checker
 *
 *  - Enter two strings and I'll tell you if they are anagrams:
 *  - Enter the first string: note
 *  - Enter the second string: tone
 *  - "note" and "tone" are anagrams.
 *
 *  Constraints:
 *  - Implement the program using a function called <isAnagram> which takes in two
 *    words as its arguments and returns true or false
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");

        System.out.print("Enter the first string: "); // Prompt for & read in string a
        String a = sc.next();

        System.out.print("Enter the second string: "); // Prompt for & read in string b
        String b = sc.next();

        String output = determineOutput(a, b);
        System.out.printf("%s", output);
    }

    public static String determineOutput(String a, String b) {

        String result;

        if(isAnagram(a, b)) {    // If isAnagram(a, b) == True
            result = "\""+a+"\" and \""+b+"\" are anagrams.\n"; // Set output to say a and b are anagrams
        }
        else { // Else
            result = "\""+a+"\" and \""+b+"\" are not anagrams.\n"; // Set output to say a and b are anagrams
        }

        return result;
    }

    public static boolean isAnagram(String a, String b){

        if(a.length() != b.length()) {      // If the length of the two strings are not the same
            return false;                       // Return False
        }

        char[] sortedA = a.toLowerCase().toCharArray();
        Arrays.sort(sortedA);     // Sort a alphabetically

        char[] sortedB = b.toLowerCase().toCharArray();
        Arrays.sort(sortedB);     // Sort b alphabetically

        if(Arrays.equals(sortedA, sortedB)) {   // If a equals b : return true
            return true;
        }
        else {                                  // Else : return false
            return false;
        }
    }
}
