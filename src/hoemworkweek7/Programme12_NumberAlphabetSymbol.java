package hoemworkweek7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12_NumberAlphabetSymbol {

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = sc.next().charAt(0);
        checking(ch); // calling a method to check whether alphabet, number or symbol
        sc.close(); // closing the scanner object
    }

    // static method of actual logic
    public static void checking(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a symbol");
        }
    }
}
