import java.util.*;

/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 9
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/

public class SalespersonDatabase {
    private static final int MAX_FACULTIES = 20; 
    private static Salesperson[] recordArray = new Salesperson[MAX_FACULTIES];
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        createArray();
        boolean done = false;
        while (!done) {
            int choice = displayMenu();
            switch(choice) {
                case 1: //Add record
                    addRecord();
                    break;
                case 2: //Delete record
                    deleteRecord();
                    break;
                case 3: //Change record
                    changeRecord();
                    break;
                case 4: //Quit
                    done = true;
                    break;
            }
            System.out.println("The database has been updated:");
            displayRecords();
        }
    }

    public static void createArray() {
        int numObjects;
        do {
            System.out.print("Enter the number of Salesperson objects to add (up to 20): ");
            numObjects = scan.nextInt();
            if (numObjects < 1 || numObjects > MAX_FACULTIES) {
                System.out.println("Error: Invalid number of objects.");
            }
        } while (numObjects < 1 || numObjects > MAX_FACULTIES);

        recordArray = new Salesperson[numObjects];
    }





    public static void addRecord() {
        if (recordArray.length == MAX_FACULTIES) {
            System.out.println("Error: Database is full.");
            return;
        }

        // Prompt user for ID
        System.out.print("Enter an ID number: ");
        int id = scan.nextInt();

        // Check if ID exists
        for (int i = 0; i < recordArray.length; i++) {
            if (recordArray[i] != null && recordArray[i].getId() == id) {
                System.out.println("Error: ID already exists.");
                return;
            }
        }

        // Prompt user for sales value
        System.out.print("Enter a sales value:");
        double sales = scan.nextDouble();

        // Find the first null element in the array and add the new record
        for (int i = 0; i < recordArray.length; i++) {
            if (recordArray[i] == null) {
                recordArray[i] = new Salesperson(id, sales);
                break;
            }
        }
    }


    public static void deleteRecord() {
        if (recordArray.length == 0) {
            System.out.println("Error: Database is empty");
        } else {
            // prompt user for ID number
            System.out.println("Enter ID number of record to delete: ");
            int idNum = scan.nextInt();

            // search through array for ID number
            boolean idFound = false;
            int index = 0;
            while (!idFound && index < recordArray.length) {
                if (recordArray[index].getId() == idNum) {
                    idFound = true;
                } else {
                    index++;
                }
            }

            // remove record from array if found, otherwise display error message
            if (idFound) {
                for (int i = index; i < recordArray.length - 1; i++) {
                    recordArray[i] = recordArray[i + 1];
                }
                Salesperson[] tempArray = new Salesperson[recordArray.length - 1];
                System.arraycopy(recordArray, 0, tempArray, 0, tempArray.length);
                recordArray = tempArray;
            } else {
                System.out.println("Error: ID number not found");
            }
        }
    }

    
    
    public static void changeRecord() {
        if (recordArray.length == 0) {
            System.out.println("Error: Database is empty, cannot change a record");
            return;
        }
        
        Scanner scan = new Scanner(System.in);
        int idNumber;
        double newSalesValue;
        System.out.print("Enter the ID number to change the sales value: ");
        idNumber = scan.nextInt();
        
        int index = -1;
        for (int i = 0, length = recordArray.length; i < length; i++ ) {
            if (recordArray[i].getId() == idNumber) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Error: ID number does not exist in the database");
            return;
        }
        
        System.out.print("Enter new sales value: ");
        newSalesValue = scan.nextDouble();
        
        recordArray[index].setSales(newSalesValue);
        
    }


    public static void displayRecords() {
        // Check for null elements in the array
        boolean hasNull = false;
        for (int i = 0; i < recordArray.length; i++) {
            if (recordArray[i] == null) {
                hasNull = true;
                break;
            }
        }
        if (hasNull) {
            System.out.println("Error: Database contains null elements");
            return;
        }

        // Sort the Salesperson array in ascending order by ID
        Arrays.sort(recordArray, Comparator.comparingInt(Salesperson::getId));

        System.out.println("ID\tSales");
        for (int i = 0; i < recordArray.length; i++) {
            System.out.println(recordArray[i].getId() + "\t" + recordArray[i].getSales());
        }
    }

    public static int displayMenu() {
        System.out.println("Salesperson Database");
        System.out.println("--------------------");
        System.out.println("1. Add a record");
        System.out.println("2. Delete a record");
        System.out.println("3. Change a record");
        System.out.println("4. Quit");
        System.out.print("Enter a choice: ");
        int choice = scan.nextInt();
        return choice;
    }
}
