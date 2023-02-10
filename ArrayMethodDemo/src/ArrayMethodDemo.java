import java.util.Random;
public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Numbers in array: ");
        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.println("\nNumbers reversed: ");
        reversed(array);

        System.out.println("\nSum of numbers: ");
        System.out.print(sum(array));

        System.out.println("\nNumbers less than fifty: ");
        lessThanFifty(array);

        System.out.println("\nNumbers above average: ");
        higherThanAverage(array, sum(array));
    }
    private static void reversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    private static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
    private static void lessThanFifty(int[] array) {
        for (int number : array) {
            if (number < 50) {
                System.out.print(number + " ");
            }
        }
    }
    private static void higherThanAverage(int[] array, int sum) {
        int average = sum / array.length;
        for (int number : array) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }
}