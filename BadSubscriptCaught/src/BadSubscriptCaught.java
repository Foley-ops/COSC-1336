import java.util.Scanner;
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