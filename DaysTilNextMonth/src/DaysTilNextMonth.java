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
        LocalDate orderDate;

        final int WEEKS_FOR_DELIVERY = 2;
        System.out.print("Enter order month ");
        int mo = input.nextInt();
        System.out.print("Enter order day ");
        int day = input.nextInt();
        System.out.print("Enter order year ");
        int year = input.nextInt();
        orderDate = LocalDate.of(year, mo, day);
        System.out.println("Order date is " + orderDate);
        System.out.println("Delivery date is " +
                orderDate.plusWeeks(WEEKS_FOR_DELIVERY));
    }
}