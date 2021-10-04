/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String position;
    private final String separationDate;

    public Employee(String newFirstName, String newLastName, String newPosition, String newSeparationDate) {

        //create new employee with the passed parameters
        firstName = newFirstName;
        lastName = newLastName;
        position = newPosition;
        separationDate = newSeparationDate;

    }

    /* No pseudocode, this should be self-explanatory */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSeparationDate() {
        return separationDate;
    }

}
