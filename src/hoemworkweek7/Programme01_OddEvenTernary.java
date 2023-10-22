package hoemworkweek7;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme01_OddEvenTernary {

    //taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isEvenOdd(num); // static --> static direct calling
        sc.close(); // closing the scanner object
    }

    //method for finding even or odd number using ternary operator
    public static void isEvenOdd(int num){
        boolean ans = (num%2==0 ? true : false);
        if (ans == true){
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
    }
}
