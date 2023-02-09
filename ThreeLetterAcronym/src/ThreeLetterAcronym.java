import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three words to turn into an acronym: ");

        String userInput = scanner.nextLine();
        System.out.println(getAcronym(userInput));

        scanner.close();
    }
    public static String getAcronym(String userInput) {
        String fullAcronym = "";
        boolean spaceFinder = true;

        for ( int i = 0; i < userInput.length(); i++ ) {
            if (userInput.charAt(i) == ' ')
                spaceFinder = true;

            else if (userInput.charAt(i) != ' ' && spaceFinder == true) {
                fullAcronym += (userInput.charAt(i));
                spaceFinder = false;
            }
        }
        return fullAcronym.toUpperCase();

    }
}