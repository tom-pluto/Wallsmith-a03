/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Exercise 30 - Multiplication Table
-   Create a program that generates a multiplication table for the numbers 1 through 12 inclusive

Constraints
-   Use a nested loop to complete this program
-   Align each column within the table without using the tab character

Example Output
>   1    2    3    4    5    6    7    8    9   10   11   12
>   2    4    6    8   10   12   14   16   18   20   22   24
>   3    6    9   12   15   18   21   24   27   30   33   36
>   4    8   12   16   20   24   28   32   36   40   44   48
>   5   10   15   20   25   30   35   40   45   50   55   60
>   6   12   18   24   30   36   42   48   54   60   66   72
>   7   14   21   28   35   42   49   56   63   70   77   84
>   8   16   24   32   40   48   56   64   72   80   88   96
>   9   18   27   36   45   54   63   72   81   90   99  108
>  10   20   30   40   50   60   70   80   90  100  110  120
>  11   22   33   44   55   66   77   88   99  110  121  132
>  12   24   36   48   60   72   84   96  108  120  132  144
 */

package baseline;

public class Solution30 {
    public static void main(String[] args) {

        //Call getMultiplicationTable on new 2D array to populate the array with the data
        //Call getOutput to convert the 2D array into a string that resembles a table
        //Print output
    }
    public static int[][] getMultiplicationTable(){

        /*
        Generates a multiplication table for 1-12 inclusive.
        Does so by using a nested for loop that multiplies the row by the column at each element to get the value.
         */

        //Generates a 12x12 2D array
        //For i = 0; i < 12; i++
            //For j = 0; j < 12; j++
                //multiTable[i][j] = (i+1)*(j+1)
        //Return multiTable

        return null;
    }
    public static String getOutput(int[][] multiTable) {

        /*
        Generates a "table" from a passed 2D array, outputting as a string.
         */

        //Create blank output string
        //For i = 0; i < 12; i++
            //For j = 0; j < 12; j++
                //Add multiTable[i][j] to the output string + space
            //Add newline to the output string
        //Return output string

        return "";
    }
}
