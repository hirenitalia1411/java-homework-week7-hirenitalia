package hoemworkweek7;
/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17_SortingArray {

    // method to sort the integer array
    public static void intArray(){
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 }; // declaration and initialisation of array
        System.out.println("The original INTEGER array is: ");
        // for loop to print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr); // in-built function of Array class to sort the array
        System.out.println("\nThe sorted INTEGER array is: ");
        // for loop to print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // method to sort the character array
    public static void stringArray(){
        String[] arr = { "Java", "C++", "Python", "Analysis", "Manual", "Automation" }; // declaration and initialisation of array
        System.out.println("\nThe original STRING array is: ");
        // for loop to print the array
        for (String num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr); // in-built function of Array class to sort the array
        System.out.println("\nThe sorted STRING array is: ");
        // for loop to print the sorted array
        for (String num : arr) {
            System.out.print(num + " ");
        }
    }

    // main method where both the methods are called
    public static void main(String args[])
    {
        intArray();
        stringArray();
    }
}
