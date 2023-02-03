/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/03/2023
 Lab 6
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
import java.text.NumberFormat;
import java.util.Scanner;

public class RetirementGoal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        // Takes input for years until retirement
        System.out.print("How many years until you retire? ");
        int years = scanner.nextInt();
        // Error handling for years variable
        while (years <= 0) {
            System.out.println("Please enter a positive integer.\n");
            System.out.print("How many years until you retire? ");
            years = scanner.nextInt();
        }

        // Takes input for how much money can be saved annually
        System.out.print("How much money can you save annually? ");
        double annualSavings = scanner.nextDouble();

        while (annualSavings <= 0) {
            System.out.println("Please enter a positive integer.\n");
            System.out.print("How much money can you save annually? ");
            annualSavings = scanner.nextInt();
        }

        String retirementSavings = defaultFormat.format(years * annualSavings);

        System.out.println("After " +  years + " years you will have " + retirementSavings + ".");
    }
}
