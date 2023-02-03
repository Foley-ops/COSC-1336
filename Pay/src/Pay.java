import java.util.Scanner;

/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/01/2023
 Lab 5
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
public class Pay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input skill level
        System.out.print("Enter skill level: ");
        int skillLevel = scanner.nextInt();

        // Input hours worked
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        double hourlyRate = getHourlyPay(skillLevel);
        double actualPay = getActualPay(getHourlyPay(skillLevel), hoursWorked);
        double overtime =getOvertime(getHourlyPay(skillLevel), hoursWorked);
        double totalDeductions = getDeductions(skillLevel, hoursWorked);
        double netPay = ((actualPay + overtime) - totalDeductions);

        // Output hours worked, hourly pay, normal pay, overtime pay, total pay, total deductions, and net pay
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly pay: $" + hourlyRate);
        System.out.println("Normal pay: $" + hourlyRate * 40);
        System.out.println("Overtime pay: $" + overtime);
        System.out.println("Total pay: $" + (actualPay + overtime));
        System.out.println("Total deductions: $" + totalDeductions);
        if (netPay >= 0)
            System.out.println("Net pay: $" + netPay);
        else
            System.out.println("Error!  You don't have enough money!");


    }
    private static double getActualPay(double hourlyRate, int hoursWorked) {
        if (hoursWorked < 0) {
            return 0;
        }
        return (hourlyRate * hoursWorked);

    }
    private static double getHourlyPay(int skillLevel) {
        // Takes skillLevel and assigns the hourly rate
        if (skillLevel == 1) return 17.00;
        else if (skillLevel == 2) return 20.00;
        else if (skillLevel == 3) return 22.00;
        return 0;
    }
    private static double getOvertime(double hourlyRate, int hoursWorked) {
        // Takes inputs and calculates overtime without the normal pay
        if (hoursWorked <= 40) return 0;
        return (((hoursWorked - 40) * hourlyRate) * 1.5);
    }

    private static double getDeductions(int skillLevel, int hoursWorked) {
        Scanner scanner = new Scanner(System.in);
        double overtime = getOvertime(getHourlyPay(skillLevel), hoursWorked);
        double totalPay = ((getHourlyPay(skillLevel) * 40) + overtime);
        boolean medicalBoolean = false;
        boolean dentalBoolean = false;
        boolean disabilityBoolean = false;
        boolean retirementBoolean = false;
        double totalDeduction = 0;

        // Gives options for insurance, only allows skillLevel 2 and 3
        if (skillLevel == 2 || skillLevel == 3) {
            System.out.println("INSURANCE OPTIONS\n" +
                    "~~~~~~~~~~~~~~~~~\n" +
                    "Medical insurance $ 32.50\n" +
                    "Dental insurance $ 20.00\n" +
                    "Long-term disability insurance $ 10.00\n" +
                    "~~~~~~~~~~~~~~~~~\n");
        }
        else {
            return 0;
        }

        System.out.print("Would you like Medical insurance?(y/n)");
        String medicalInsurance = scanner.nextLine().toLowerCase();
        if (medicalInsurance.equals("y")) {
            medicalBoolean = true;
            totalDeduction += 32.50;
        }

        System.out.print("Would you like Dental insurance?(y/n)");
        String dentalInsurance = scanner.nextLine().toLowerCase();
        if (dentalInsurance.equals("y")) {
            dentalBoolean = true;
            totalDeduction += 20.00;
        }

        System.out.print("Would you like Long-term disability insurance?(y/n)");
        String disabilityInsurance = scanner.nextLine().toLowerCase();
        if (disabilityInsurance.equals("y")) {
            disabilityBoolean = true;
            totalDeduction += 10.00;
        }

        if (skillLevel == 3) {
            System.out.print("Would you like to put money into retirement?(y/n)");
            String retirementPlan = scanner.nextLine().toLowerCase();
            if (retirementPlan.equals("y")) {
                retirementBoolean = true;
                totalDeduction += (totalPay * .03);
            }
        }

        totalDeductions(medicalBoolean, dentalBoolean, disabilityBoolean, retirementBoolean);

        return totalDeduction;
    }

    private static void totalDeductions(boolean medical, boolean dental, boolean disability, boolean retirement) {
        // Method takes boolean values from getDeductions method and prints deductions
        String listOfDeductions = "";

        listOfDeductions += medical ? "Medical Insurance\n" : "";
        listOfDeductions += dental ? "Dental Insurance\n" : "";
        listOfDeductions += disability ? "Disability Insurance\n" : "";
        listOfDeductions += retirement ? "Retirement Plan\n" : "";

        System.out.println("Elections made:");
        System.out.println(listOfDeductions);
        System.out.println("~~~~~~~~~~~~~~~~~");

    }
}