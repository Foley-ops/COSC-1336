import java.util.Scanner;

/*Write an application named BadSubscriptCaught in which you declare an array of 10 first names.
Write a try block in which you prompt the user for an integer and display the name in the requested position.
Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown when the user
enters a number that is out of range. The catch block should also display an error message.
 */
/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/20/2023
 Lab 12
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
public class BadSubscriptCaught {
    public static void main(String[] args) {

        // Declaring array of 10 first names 
        String[] firstNames = { "Albert", "Billy", "Charles", "Daniel", "Elizabeth",
                "Francine", "George", "Henry", "Igor", "Jacen"};

        // Try block to prompt user for an integer and display name at requested position
        try {
             System.out. print("Enter an integer between 1 and 10: ");
             Scanner scanner = new Scanner(System.in); 
             int number = (scanner.nextInt()) - 1; 
             
             System.out.println("Name at position " + (number + 1) + " is "+ firstNames[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error! Number entered is out of range!"); 
        }
    }
}