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
        System.out.print("Enter skill level: ");
        int skillLevel = scanner.nextInt();

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        double actualPay = getActualPay(getHourlyPay(skillLevel), hoursWorked);
        double overtime =getOvertime(getHourlyPay(skillLevel), hoursWorked);
        double totalDeductions = getDeductions(skillLevel, hoursWorked);
        double netPay = ((actualPay + overtime) - totalDeductions);

        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly pay: " + getHourlyPay(skillLevel));
        System.out.println("Normal pay: " + getHourlyPay(skillLevel) * 40);
        System.out.println("Overtime pay: " + overtime);
        System.out.println("Total pay: " + (actualPay + overtime));
        System.out.println("Total deductions: " + totalDeductions);
        if (netPay >= 0)
            System.out.println("Net pay: " + netPay);
        else
            System.out.println("Error!  You don't have enough money!");


    }
    private static double getActualPay(double hourlyRate, int hoursWorked) {
        double actualPay = hourlyRate * hoursWorked;
        return actualPay;
    }
    private static double getHourlyPay(int skillLevel) {
        double hourlyRate;

        if (skillLevel == 1)
            hourlyRate = 17.00;

        else if (skillLevel == 2)
            hourlyRate =  20.00;

        else if (skillLevel == 3)
            hourlyRate =  22.00;

        else
            return 0;

        return hourlyRate;
    }

    private static double getOvertime(double hourlyRate, int hoursWorked) {

        if (hoursWorked > 40) {
            return (((hoursWorked - 40) * hourlyRate) * 1.5);
        }
        else
            return 0;


    }

    private static double getDeductions(int skillLevel, int hoursWorked) {
        Scanner scanner = new Scanner(System.in);
        double overtime = getOvertime(getHourlyPay(skillLevel), hoursWorked);
        double totalPay = ((getHourlyPay(skillLevel) * 40) + overtime);
        boolean medicalBoolean;
        boolean dentalBoolean;
        boolean disabilityBoolean;
        boolean retirementBoolean;
        double totalDeduction = 0;

        if (skillLevel == 2 || skillLevel == 3) {
            System.out.println("""
                    INSURANCE OPTIONS
                    ~~~~~~~~~~~~~~~~~
                    Medical insurance $ 32.50
                    Dental insurance $ 20.00
                    Long-term disability insurance $ 10.00""");
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
        else
            medicalBoolean = false;

        System.out.print("Would you like Dental insurance?(y/n)");
        String dentalInsurance = scanner.nextLine().toLowerCase();
        if (dentalInsurance.equals("y")) {
            dentalBoolean = true;
            totalDeduction += 20.00;
        }
        else
            dentalBoolean = false;

        System.out.print("Would you like Long-term disability insurance?(y/n)");
        String disabilityInsurance = scanner.nextLine().toLowerCase();
        if (disabilityInsurance.equals("y")) {
            disabilityBoolean = true;
            totalDeduction += 10.00;
        }
        else
            disabilityBoolean = false;

        if (skillLevel == 3) {
            System.out.println("Would you like to put money into retirement?(y/n)");
            String retirementPlan = scanner.nextLine().toLowerCase();
            if (retirementPlan.equals("y")) {
                retirementBoolean = true;
                totalDeduction += (totalPay * .03);
            }
            else
                retirementBoolean = false;

        }
        else
            retirementBoolean = false;

        totalDeductions(medicalBoolean, dentalBoolean, disabilityBoolean, retirementBoolean);

        return totalDeduction;
    }

    private static void totalDeductions(boolean medical, boolean dental, boolean disability, boolean retirement) {
        String listOfDeductions = "";

        if (medical)
            listOfDeductions += "Medical Insurance ";
        else
            listOfDeductions += "";

        if (dental)
            listOfDeductions += "Dental Insurance ";
        else
            listOfDeductions += "";

        if (disability)
            listOfDeductions += "Disability Insurance ";
        else
            listOfDeductions += "";

        if (retirement)
            listOfDeductions += "Retirement Plan";
        else
            listOfDeductions += "";

        System.out.println("Elections made:");
        System.out.println(listOfDeductions);;

    }
}