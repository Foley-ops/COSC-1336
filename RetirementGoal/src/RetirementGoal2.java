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
        // Formatter to give correct output, defaultFormat is in US currency
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
        // Error handling for annualSavings
        while (annualSavings <= 0) {
            System.out.println("Please enter a positive integer.\n");
            System.out.print("How much money can you save annually? ");
            annualSavings = scanner.nextInt();
        }
        
        scanner.close();

        double savingsWithInterest = getInterest(years, annualSavings);

        // Formats double to string in currency format
        String retirementSavings = defaultFormat.format(savingsWithInterest);

        // Normal string concatenation
        System.out.println("After " +  years + " years you will have " + retirementSavings + ".");

    }
    private static double getInterest(int years, final double annualSavings) {
        double interest = .05;
        double totalSavingsWithInterest = annualSavings;

        // for each year inbetween "now" and retirement, calculate interest and add to annualSavings
        for (int currentYear = 1; currentYear < years; currentYear++){
            totalSavingsWithInterest += annualSavings + (totalSavingsWithInterest * interest);
            System.out.println(totalSavingsWithInterest);
            
        }
        // Returns calculated savings with interest
        return totalSavingsWithInterest;
    }
}
