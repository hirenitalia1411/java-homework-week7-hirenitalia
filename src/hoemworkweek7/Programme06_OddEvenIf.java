package hoemworkweek7;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme06_OddEvenIf {

    //taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isEvenOdd(num); // static --> static direct calling
        sc.close(); // closing the scanner object
    }

    //method for finding even or odd number using if-else statements
    public static void isEvenOdd(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
    }
}
