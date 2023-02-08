import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three words to turn into an acronym: ");

        String userInput = scanner.nextLine();
        System.out.println(userInput);

        scanner.close();
    }
}