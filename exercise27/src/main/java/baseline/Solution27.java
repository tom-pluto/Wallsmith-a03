/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Exercise 27 - Validating Inputs

Large functions are not very usable or maintainable. It makes a lot of sense to break down the logic of a program into
smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid
according to these rules:
- The first name must be filled in.
- The last name must be filled in.
- The first and last names must be at least two characters long.
- An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
- The ZIP code must be a number.

Display appropriate error messages on incorrect data.

Constraints
- Create a function for each validation rule. Then create a <validateInput> function that takes in all the input
  data and invokes the specific validation functions.
- Use a single output statement to display the outputs.

Example Output 1
>   Enter the first name: J
>   Enter the last name:
>   Enter the ZIP code: ABCDE
>   Enter the employee ID: A12-1234
>   The first name must be at least 2 characters long.
>   The last name must be at least 2 characters long.
>   The last name must be filled in.
>   The employee ID must be in the format of AA-1234.
>   The zipcode must be a 5-digit number.

Example Output 2
>   Enter the first name: John
>   Enter the last name: Johnson
>   Enter the ZIP code: 55555
>   Enter the employee ID: TK-4321
>   There were no errors found.
 */

package baseline;

import java.util.Scanner;
import static java.lang.Character.isAlphabetic;

public class Solution27 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Prompt and read firstName
        System.out.printf("%s", "Enter the first name: ");
        String firstName = sc.next();
        //Prompt and read lastName
        System.out.printf("%s", "Enter the last name: ");
        String lastName = sc.next();
        //Prompt and read zipCode
        System.out.printf("%s", "Enter the ZIP code: ");
        String zipCode = sc.next();
        //Prompt and read employeeID
        System.out.printf("%s", "Enter the employee ID: ");
        String employeeID = sc.next();
        //Print output of validateInput()
        System.out.printf("%s", validateInput(firstName, lastName, zipCode, employeeID));

    }
    public static String validateInput(String firstName, String lastName, String zipCode, String employeeID) {

        /*
        Builds an output string containing the any missed criteria.
        Passes relevant strings to the associate validation method.
         */

        String output;
        output = validateFirstName(firstName);                  //Validate firstName + add to output string
        output += validateLastName(lastName);                   //Validate last name + add to output string
        output += validateEmployeeID(employeeID);               //Validate employee ID + add to output string
        output += validateZipcode(zipCode);                     //Validate zipCode + add to output string

        if(output.isEmpty()){                                   //Checks to see if output string is empty
            output = "There were no errors found.\n";               //If so, make the output say there were no errors
        }

        return output;                                          //Return output string

    }

    private static String validateFirstName(String firstName) {

        /*
        Determines if the passed string if the "first name" string passed to it is valid.
        Valid "first name" strings are at least 2 characters long and not blank (pretty redundant if you ask me...)
        Separate output messages are given based on if the string met all, some, or none of the criteria.
         */

        if(firstName.length() < 2) {
            if(firstName.length() == 0) {
                return "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
            }
            return "The first name must be at least 2 characters long.\n";
        }
        else {
            return "";
        }

    }
    private static String validateLastName(String lastName) {

        /*
        Determines if the passed string if the "last name" string passed to it is valid.
        Valid "last name" strings are at least 2 characters long and not blank (pretty redundant if you ask me...)
        Separate output messages are given based on if the string met all, some, or none of the criteria.
         */

        String output = "";

        if(lastName.length() < 2) {
            output = "The last name must be at least 2 characters long.\n";

            if(lastName.length() == 0) {
                output += "The last name must be filled in.\n";
            }
        }

        return output;
    }
    private static String validateEmployeeID(String employeeID) {

        /*
        This is so ugly and I'm sorry.

        Determines if the passed string (employeeID) is valid.
        A valid string is one that is longer than 7 characters, and meets the format <AA-1234>
        Returns an output string that is either blank (valid) or with an error message (invalid)
         */

        String errMsg = "The employee ID must be in the format of AA-1234.\n";


        if(employeeID.length() != 7){                   //Is employeeID less than 7 characters long?
            return errMsg;                                  //Yes : return error message
        }

        char[] array = employeeID.toCharArray();        //Convert string to character array

        //Does employeeID match the format? (done by testing each element of array individually
        if(!isAlphabetic(array[0]) || !isAlphabetic(array[1]) || array[2] != '-' || !Character.isDigit(array[3]) ||
                !Character.isDigit(array[4]) || !Character.isDigit(array[5]) || !Character.isDigit(array[6]))
            return errMsg;

        return "";
    }
    private static String validateZipcode(String zipCode) {

        /*
        Determines if the string zipCode is a valid zipcode or not.
        A valid zipcode is any zipcode that is both a number and at least 5 digits.
         */

        try{                                                        //Attempt integer conversion of zipCode
            Integer.parseInt(zipCode);
        }
        catch (NumberFormatException e){                            //Catch exception (if any) and return err string
            return "The zipcode must be a 5 digit number.\n";
        }

        if(zipCode.length() != 5) {                                 //Check zipCode is less than 5 characters
            return "The zipcode must be a 5 digit number.\n";           //If yes, return err string
        }
        else{
            return "";                                                  //Otherwise, returns nothing.
        }
    }
}