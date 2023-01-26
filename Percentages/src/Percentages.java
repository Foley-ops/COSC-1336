/******************************************************************************
 Programmer: Nicholas Foley
 Date: 01/25/2023
 Lab 3
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview

 *******************************************************************************/
public class Percentages {
    public static void main(String[] args) {

        double variableOne = 2.0;
        double variableTwo = 5.0;

        System.out.println(computerPercent(variableOne, variableTwo));
        System.out.println(computerPercent(variableTwo, variableOne));
    }

    public static String computerPercent(double firstNumber, double secondNumber) {
        double firstThenLast = ((firstNumber / secondNumber) * 100);

        return firstNumber + " is " + (int)firstThenLast + " percent of " + secondNumber;

    }

}
