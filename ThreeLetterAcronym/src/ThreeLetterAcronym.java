
/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/10/2023
 Lab 7
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three words to turn into an acronym: ");

        String userInput = scanner.nextLine();
        // Calls method and capitalizes result
        System.out.println("The acronym is: " + getAcronym(userInput).toUpperCase());

        scanner.close();
    }

    public static String getAcronym(String userInput) {
        // Error handling for extra spaces
        String[] words = userInput.split("\\s+");

        // Method return value created
        String acronym = "";

        /*
        Loop through array for first 3 words
        add error handling if user inputs more than three words
        */
        for (int i = 0; i < 3 && i < words.length; i++) {
            acronym += words[i].charAt(0);
        }

        return acronym;
    }
}