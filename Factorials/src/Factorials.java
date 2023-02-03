/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/03/2023
 Lab 6
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
public class Factorials {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long factorial = 1L;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + " = " + factorial);

        }
    }
}