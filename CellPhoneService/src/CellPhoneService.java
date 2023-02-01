import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Talk minutes used: ");
        double talkMinutes = scanner.nextDouble();

        System.out.print("Text messages sent: ");
        int textMessages = scanner.nextInt();

        System.out.print("Data used (Gigabytes): ");
        double dataUsage = scanner.nextDouble();

        String response = (recommendedPlan(talkMinutes, textMessages, dataUsage));

        System.out.println("We recommend " + response + " a month.");
    }

    public static String recommendedPlan(double talkMinutes, int textMessages, double dataUsage) {

        String purpose;

        if (talkMinutes < 500 && textMessages == 0 && dataUsage == 0)
            purpose = ("Plan A for $49");

        else if (talkMinutes < 500 &&  0 <= textMessages && dataUsage == 0)
            purpose = ("Plan B for $55");

        else if (500 <= talkMinutes && 0 <= textMessages && textMessages < 100 && dataUsage == 0)
            purpose = ("Plan C for $61");

        else if (talkMinutes >= 500 && textMessages >= 100 && dataUsage == 0)
            purpose = ("Plan D for $70");

        else if (0 < dataUsage && dataUsage < 2 )
            purpose = ("Plan E for $79");

        else if (2 < dataUsage )
            purpose = ("Plan F for $87");

        else
            purpose = ("an extended service plan for an undefined amount");

        return purpose;
    }
}