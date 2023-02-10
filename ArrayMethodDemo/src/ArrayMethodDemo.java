/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/10/2023
 Lab 8
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
import java.util.Random;
public class ArrayMethodDemo {
    public static void main(String[] args) {
        // Creates array with ten random integers
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Displays all parameters in prompt
        System.out.println("Numbers in array: ");
        numbersInArray(array);

        System.out.println("\nNumbers reversed: ");
        reversed(array);

        System.out.println("\nSum of numbers: ");
        System.out.print(sum(array));

        System.out.println("\nNumbers less than fifty: ");
        lessThanFifty(array);

        System.out.println("\nNumbers above average: ");
        higherThanAverage(array, sum(array));
    }
    private static void numbersInArray(int[] array) {
        // Prints all numbers in array
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
    private static void reversed(int[] array) {
        // Reverses order of integers in array
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    private static int sum(int[] array) {
        // Calculates sum of array
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
    private static void lessThanFifty(int[] array) {
        // Prints integers in array under fifty
        for (int number : array) {
            if (number < 50) {
                System.out.print(number + " ");
            }
        }
    }
    private static void higherThanAverage(int[] array, int sum) {
        // Calculates average
        int average = sum / array.length;
        // Iterates through array looking for values above the average
        for (int number : array) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }
}