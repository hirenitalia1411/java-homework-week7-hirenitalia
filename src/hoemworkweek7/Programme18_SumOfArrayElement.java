package hoemworkweek7;
/**
 * Write a Java program to sum values of an array.
 */

public class Programme18_SumOfArrayElement {

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9}; // declaration and initialisation of array
        int sum = 0;
        // for loop to find the sum of array elements
        for (int value : array) {
            sum += value;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
