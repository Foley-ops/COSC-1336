/*	In Chapter 8, you created a Salesperson class with fields for an ID number and sales values.
Now, create an application that allows you to store an array that acts as a database of any number
of Salesperson objects up to 20. While the user decides to continue, offer three options: to add a
record to the database, to delete a record from the database, or to change a record in the database.
Then proceed as follows:

If the user selects the add option, issue an error message if the database is full. Otherwise, prompt
 the user for an ID number. If the ID number already exists in the database, issue an error message.
 Otherwise, prompt the user for a sales value and add the new record to the database.

If the user selects the delete option, issue an error message if the database is empty.
Otherwise, prompt the user for an ID number. If the ID number does not exist, issue an error message.
Otherwise, do not access the record for any future processing.

If the user selects the change option, issue an error message if the database is empty.
Otherwise, prompt the user for an ID number. If the requested record does not exist, issue an error
message. Otherwise, prompt the user for a new sales value and change the sales value for the record.
After each option executes, display the updated database in ascending order by Salesperson ID number
and prompt the user to select the next action. Save the application as SalespersonDatabase.java.
*/

import java.util.Scanner;

/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 9
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/
public class SalespersonDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean addData = true;

        System.out.print("How many salespeople would you like to enter? (max 20): ");
        int amountSalespeople = scanner.nextInt();



        while (addData) {

            Salesperson[] salespersonsArray = new Salesperson[amountSalespeople];
            System.out.print("Would you like to ADD, DELETE, or CHANGE a record?  Type YES or NO.");
            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals("NO"))
                addData = false;
            else {
                System.out.print("Would you like to ADD, DELETE, or CHANGE a record?");
                String answer2 = scanner.nextLine().toUpperCase();

                if (answer2.equals("ADD") && salespersonsArray.length >= 20) {
                    System.out.println("Error: database is full");
                    addData = false;
                } else if (answer2.equals("ADD")) {
                    System.out.print("Please enter an ID number: ");
                    int salesIDNumber = scanner.nextInt();
                    for (int i = 0; i < salespersonsArray.length; i++) {
                        if (i == salespersonsArray[i].getId()) {
                            System.out.println("Error: Sales ID already exists.");
                        } else {
                            System.out.print("Please enter sales value: ");
                            double salesValue = scanner.nextDouble();
                            new Salesperson(salesIDNumber, salesValue);
                        }
                    }

                }
                if (answer2.equals("DELETE") && salespersonsArray.length == 0) {
                    System.out.println("Error: Database is empty");
                    addData = false;
                } else {
                    System.out.print("Please enter Sales ID to delete: ");
                    int salesIDNumber = scanner.nextInt();
                    for (int i = 0; i < salespersonsArray.length; i++) {
                        if (i != salespersonsArray[i].getId()) {
                            System.out.println("Error: Sales ID does not exists.");
                            addData = false;
                        }
                    }
                }
                if (answer2.equals("CHANGE") && salespersonsArray.length == 0) {
                    System.out.println("Error: Database is empty");
                    addData = false;
                }
            }
        }
    }
}