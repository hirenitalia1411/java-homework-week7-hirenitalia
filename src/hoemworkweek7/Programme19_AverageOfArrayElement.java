package hoemworkweek7;
/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Programme19_AverageOfArrayElement {

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9}; // declaration and initialisation of array
        int sum = 0;
        int aveg = 0;
        // for loop to find the sum of array elements
        for (int value : array) {
            sum += value;
        }
        aveg = sum/array.length; // finding the average from sum
        System.out.println("Average of array elements is: " + aveg);
    }
}
