package hoemworkweek7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class Programme16_PositiveNegativeZero {

    // method where actual logic is written
    static void checkNumber(int num) {
        if (num > 0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if (num < 0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        checkNumber(num); // calling a method to check, whether entered number is positive, negative or zero
        sc.close(); // cosing the scanner object
    }
}
