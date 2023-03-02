/*Using a text editor, create a file that contains a list of at least 10 six-digit account numbers.
Read in each account number and display whether it is valid. An account number is valid only if the
last digit is equal to the sum of the first five digits divided by 10. For example, the number 223355
 is valid because the sum of the first five digits is 15, the remainder when 15 is divided by 10 is 5,
 and the last digit is 5. Write only valid account numbers to an output file, each on its own line. */
/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/28/2023
 Lab 13
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ValidateCheckDigits {
    
    public static boolean isValidAccountNumber(String accountNumber) {
        // check if the length of the string is exactly 6 characters
        if (accountNumber.length() != 6) {
            return false;
        }
        
        // get the first five digits and compute their sum
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            char digitChar = accountNumber.charAt(i);
            if (!Character.isDigit(digitChar)) {
                return false;
            }
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        
        // check if the last digit matches the remainder of sum divided by 10
        char lastDigitChar = accountNumber.charAt(5);
        if (!Character.isDigit(lastDigitChar)) {
            return false;
        }
        int lastDigit = Character.getNumericValue(lastDigitChar);
        return lastDigit == sum % 10;
    }

    public static void main(String[] args) {
        /*Be sure to add txt file to main folder and not SRC
        IE: "C:\Users\Nick\COSC-1336\ValidateCheckDigits\account_numbers.txt"*/

        try {
            // open the input and output files
            File inputFile = new File("account_numbers.txt");
            Scanner scanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter("valid_account_numbers.txt");
            
            // process each line in the input file
            while (scanner.hasNextLine()) {
                String accountNumber = scanner.nextLine();
                if (isValidAccountNumber(accountNumber)) {
                    writer.write(accountNumber + "\n");
                }
            }
            
            // close the input and output files
            scanner.close();
            writer.close();
            
            System.out.println("Done writing valid account numbers to file.");
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find input file: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error writing output file: " + e.getMessage());
        }
    }
}
