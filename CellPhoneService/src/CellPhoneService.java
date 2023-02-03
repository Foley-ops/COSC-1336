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

        // prompt user for talk minutes used
        System.out.print("Talk minutes used: ");
        double talkMinutes = scanner.nextDouble();

        // prompt user for text messages sent
        System.out.print("Text messages sent: ");
        int textMessages = scanner.nextInt();

        // prompt user for data used (in gigabytes)
        System.out.print("Data used (Gigabytes): ");
        double dataUsage = scanner.nextDouble();

        // get the recommended plan based on user input
        String recommendedPlan = (getRecommendedPlan(talkMinutes, textMessages, dataUsage));

        // print the recommended plan
        System.out.println("We recommend " + recommendedPlan + " a month.");
    }

    /**
     * Returns the recommended phone plan for a customer based on their monthly usage
     *
     * @param talkMinutes the number of talk minutes used by the customer
     * @param textMessages the number of text messages sent by the customer
     * @param dataUsage the amount of data used by the customer (in gigabytes)
     * @return the recommended phone plan for the customer
     */

    private static String getRecommendedPlan(double talkMinutes, int textMessages, double dataUsage) {

        // if the customer needs fewer than 500 talk minutes and no text or data, return Plan A
        if (talkMinutes < 500 && textMessages == 0 && dataUsage == 0)
            return("Plan A for $49");

        // if the customer needs fewer than 500 talk minutes and any text messages, return Plan B
        else if (talkMinutes < 500 &&  0 <= textMessages && dataUsage == 0)
            return("Plan B for $55");

        // if the customer needs 500 or more talk minutes and no data, return Plan C if they need fewer than 100 text messages
        else if (500 <= talkMinutes && 0 <= textMessages && textMessages < 100 && dataUsage == 0)
            return("Plan C for $61");

        // if the customer needs 500 or more talk minutes and no data, return Plan D if they need 100 or more text messages
        else if (talkMinutes >= 500 && textMessages >= 100 && dataUsage == 0)
            return("Plan D for $70");

        // if the customer needs any data, return Plan E if they need less than 2 gigabytes
        else if (0 < dataUsage && dataUsage < 2 )
            return("Plan E for $79");

        // if the customer needs any data, return Plan F if they need 2 or more gigabytes
        else if (2 < dataUsage )
            return("Plan F for $87");

        // if the customer's usage is undefined
        else
            return("an extended service plan for an undefined amount");
    }
}