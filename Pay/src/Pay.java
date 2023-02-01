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

        System.out.println("Hourly pay is $" + getHourlyPay(skillLevel));
        System.out.println(getInsuranceOptions(skillLevel));

    }
    private static double getHourlyPay(int skillLevel) {
        if (skillLevel == 1)
            return 17.00;

        else if (skillLevel == 2)
            return 20.00;

        else if (skillLevel == 3)
            return 22.00;

        else
            return 0;
    }
    private static double getInsuranceOptions(int skillLevel) {
        Scanner scanner = new Scanner(System.in);

        double totalInsuranceCost;
        if (skillLevel == 2 || skillLevel == 3) {
            System.out.println("""
                    INSURANCE OPTIONS
                    ~~~~~~~~~~~~~~~~~
                    1.) Medical insurance
                    2.) Dental insurance
                    3.) Long-term disability insurance""");
        }
        else
            return 0;

        System.out.print("Would you like Medical insurance?(y/n)");
        boolean medicalInsurance = scanner.nextBoolean();



    }

}