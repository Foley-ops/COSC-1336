import java.util.Scanner;
/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/01/2023
 Lab 5
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
public class CellPhoneService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Talk minutes used: ");
        double talkMinutes = scanner.nextDouble();

        System.out.print("Text messages sent: ");
        int textMessages = scanner.nextInt();

        System.out.print("Data used (Gigabytes): ");
        double dataUsage = scanner.nextDouble();

        String recommendedPlan = (recommendedPlan(talkMinutes, textMessages, dataUsage));

        System.out.println("We recommend " + recommendedPlan + " a month.");
    }

    public static String recommendedPlan(double talkMinutes, int textMessages, double dataUsage) {

        if (talkMinutes < 500 && textMessages == 0 && dataUsage == 0)
            return("Plan A for $49");

        else if (talkMinutes < 500 &&  0 <= textMessages && dataUsage == 0)
            return("Plan B for $55");

        else if (500 <= talkMinutes && 0 <= textMessages && textMessages < 100 && dataUsage == 0)
            return("Plan C for $61");

        else if (talkMinutes >= 500 && textMessages >= 100 && dataUsage == 0)
            return("Plan D for $70");

        else if (0 < dataUsage && dataUsage < 2 )
            return("Plan E for $79");

        else if (2 < dataUsage )
            return("Plan F for $87");

        else
            return("an extended service plan for an undefined amount");
    }
}