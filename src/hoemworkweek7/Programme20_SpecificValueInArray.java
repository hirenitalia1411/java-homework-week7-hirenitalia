package hoemworkweek7;
/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Programme20_SpecificValueInArray {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5}; // declaration and initialisation of array
        int toFind = 3;
        boolean found = false;
        // for loop to find the same element in the array
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        // printing the output according to the findings
        if(found)
            System.out.println(toFind + " is found");
        else
            System.out.println(toFind + " is not found");
    }
}
