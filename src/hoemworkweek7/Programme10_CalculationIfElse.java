package hoemworkweek7;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Objects;
import java.util.Scanner;

public class Programme10_CalculationIfElse {

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter Operation (+, -, *, /): ");
        String operation = sc.next();

        operations(firstNumber, operation, secondNumber); // calling a method for calculation
        sc.close(); // closing the scanner object
    }

    //method to do the calculation as per the selection
    public static void operations(int a, String op, int b){
        if (Objects.equals(op, "+")){
            System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        } else if (Objects.equals(op, "-")) {
            System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
        } else if (Objects.equals(op, "*")) {
            System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        } else if (Objects.equals(op, "/")) {
            System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
