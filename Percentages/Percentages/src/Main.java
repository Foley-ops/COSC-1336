public class Main {
    public static void main(String[] args) {

        double variableOne = 2.0;
        double variableTwo = 5.0;

        System.out.println(computerPercent(variableOne, variableTwo));
    }

    public static String computerPercent(double firstNumber, double secondNumber) {
        double firstThenLast = ((firstNumber / secondNumber) * 100);

        return firstNumber + " is " + (int)firstThenLast + " percent of " + secondNumber;

    }

}
