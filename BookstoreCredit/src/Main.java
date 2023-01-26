import java.util.Scanner;

/******************************************************************************
 Programmer: Nicholas Foley
 Date: 01/25/2023
 Lab 3
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview

 *******************************************************************************/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println(bookstoreCreditMessage(name, gpa));
    }

    public static String bookstoreCreditMessage(String name, double gpa) {
        if (gpa == 4)
            System.out.println("Great job on straight A's " + name + "!");

        else if (3 <= gpa && gpa < 4)
            System.out.println("Good job on all A's and B's " + name + "!");

        else
            System.out.println("Good job on your grades " + name);

        System.out.println("STUDENT: " + name + "\nGPA: " + gpa);
        System.out.println(name + ", you get $" + (int)(gpa * 10) + " bookstore credits.");

        return null;
    }
}