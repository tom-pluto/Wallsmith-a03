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
 */


package baseline;

public class Solution27 {

    public static void main(String[] args) {

        //Prompt and read firstName
        //Prompt and read lastName
        //Prompt and read employeeID
        //Prompt and read zipcode
        //Print output of validateInput()

    }

    public static String validateInput(String firstName, String lastName, String employeeID, String zipcode) {

        //Validate firstName + add to output string
        //Validate last name + add to output string
        //Validate employee ID + add to output string
        //Validate zipcode + add to output string
        //Return output string
        return "";
    }

    private static String validateFirstName(String firstName) {

        //If firstName is less than 2 characters long
            //Return "The first name must be at least 2 characters long."
        //Else
            //Return ""
        return "";
    }

    private static String validateLastName(String lastName) {

        //If lastName is less than 2 characters long
            //Return "The last name must be at least 2 characters long."
        //Else
            //Return ""
        return "";
    }

    private static String validateEmployeeID(String employeeID) {

        //If employeeID does not equal 7 characters
            //Return "The employee ID must be in the format of AA-1234."
        //Convert employeeID to character array
        //Determine if each element of the array is in the proper format (eg. employeeID[0] and [1] are letters)
            // If improper, return "The employee ID must be in the format of AA-1234."
            // Otherwise, return ""
        return "";
    }

    private static String validateZipcode(String zipcode) {

        //Convert zipcode to string
        //If the length of the string does not equal 5
            //Return "The zipcode must be a 5 digit number."
        //Else
            //Return ""
        return "";
    }
}