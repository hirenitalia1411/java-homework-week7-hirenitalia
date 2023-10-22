package hoemworkweek7;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;

public class Programme02_LeapYear {

    //taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        isLeapYear(year); // static --> static direct calling
        sc.close(); // closing the scanner object
    }

    /**
     *Leap years are those years with 366 days instead of 365. A leap year must satisfy any one of the following two
     * Leap Year = (It should be divisible by 4 ) or (not by 100) && (It should be divisible by 400)
     * A century year should be divisible by 4 and 100 both.
     * A non-century year should be divisible only by 4
     */
    //method for finding leap year or not
    public static void isLeapYear(int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
