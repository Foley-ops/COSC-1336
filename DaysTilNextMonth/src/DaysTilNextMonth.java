import java.time.*;
import java.util.Scanner;

/******************************************************************************
 Programmer: Nicholas Foley
 Date: 01/26/2023
 Lab 4
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College

 *******************************************************************************/
public class DaysTilNextMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int tenThousand = 10_000;
        System.out.print("Enter birth month (MM): ");
        int mo = input.nextInt();
        System.out.print("Enter birth day (DD): ");
        int day = input.nextInt();
        System.out.print("Enter birth year (YYYY): ");
        int year = input.nextInt();

        LocalDate birthDay = LocalDate.of(year, mo, day);

        LocalDate dateAfterTenThousandDays = birthDay.plusDays(tenThousand);

        System.out.println("You were born on " + birthDay);
        System.out.println("You turned ten thousand days old on " + dateAfterTenThousandDays);
    }
}