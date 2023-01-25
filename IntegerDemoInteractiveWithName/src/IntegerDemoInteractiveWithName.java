import java.util.Scanner;

/******************************************************************************
 Programmer: Nicholas Foley
 Date: 01/17/2023
 Lab 2
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview

 *******************************************************************************/
public class IntegerDemoInteractiveWithName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner is reusable

        System.out.print("Please enter an integer: ");
        int myInt = scanner.nextInt();

        System.out.print("Please enter a byte: ");
        byte myByte = scanner.nextByte();

        System.out.print("Please enter a short: ");
        short myShort = scanner.nextShort();

        System.out.print("Please enter a long: ");
        long myLong = scanner.nextLong();

        scanner.nextLine();//Consumes enter keystroke

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        //Concatenation of string and number values
        System.out.println("Thank you " + name);
        System.out.println("Integer entered: " + myInt);
        System.out.println("Byte entered: " + myByte);
        System.out.println("Short entered: " + myShort);
        System.out.println("Long entered: " + myLong);

    }
}