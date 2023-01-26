/******************************************************************************
 Programmer: Nicholas Foley
 Date: 01/25/2023
 Lab 3
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview

 *******************************************************************************/
public class NumbersDemo {
    public static void main(String[] args) {

        int varOne = 1;
        int varTwo = 2;

        System.out.println("----Original Numbers----");
        System.out.println(varOne + "\n" + varTwo);

        displayTwiceTheNumber(varOne, varTwo);
        displayNumberPlusFive(varOne, varTwo);
        displayNumberSquared(varOne, varTwo);
    }

    public static Integer displayTwiceTheNumber(int varOne, int varTwo) {
        int doubleOne = varOne * 2;
        int doubleTwo = varTwo * 2;

        System.out.println("----Twice the Number----");
        System.out.println(doubleOne + "\n" + doubleTwo);

        return null;
    }

    public static Integer displayNumberPlusFive(int varOne, int varTwo) {
        int onePlusFive = varOne + 5;
        int twoPlusFive = varTwo + 5;

        System.out.println("----Plus Five----");
        System.out.println(onePlusFive + "\n" + twoPlusFive);

        return null;
    }

    public static Integer displayNumberSquared(int varOne, int varTwo) {
        int oneSquared = varOne * varOne;
        int twoSquared = varTwo * varTwo;

        System.out.println("----Squared----");
        System.out.println(oneSquared + "\n" + twoSquared);

        return null;
    }
}