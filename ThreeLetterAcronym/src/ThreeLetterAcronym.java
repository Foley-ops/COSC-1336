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
        int wordCount = 1;
        returnStatement += userInput.charAt(0);

        for (int i = 0; i < userInput.length(); i++) {
            if (wordCount < 4 && userInput.charAt(i) == ' ') {
                wordCount++;

            } else if (wordCount < 4 && userInput.charAt(i) != ' ') {
                returnStatement += userInput.charAt(i);
            }
            else
                System.out.println("ERROR");
        }
        return returnStatement;
    }
}