import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three words to turn into an acronym: ");

        String userInput = scanner.nextLine().toUpperCase();

        System.out.println(getAcronym(userInput));

        scanner.close();

    }

    public static String getAcronym(String userInput) {
        String returnStatement = "";
        returnStatement += userInput.charAt(0);

        for (int i = 0; i < userInput.length(); i++) {
            if (i < 3 && userInput.charAt(i) == ' ') {

            } else if (i < 3 && userInput.charAt(i) != ' ') {
                returnStatement += userInput.charAt(i);
                i++;
            }
        }
        return returnStatement;
    }
}