package hoemworkweek7;
/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Programme13_DaysUsingNumber {

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid day number (1 to 7): ");
        int day = sc.nextInt();
        dayPrint(day); // calling a method to find the month name correspond to the number
        sc.close(); // closing the scanner object
    }

    // method where actual logic is written to find the month name from number entered
    public static void dayPrint(int day){
        switch (day){
            case 1:
                System.out.println("Day " + day + " is a Monday");
                break;
            case 2:
                System.out.println("Day " + day + " is a Tuesday");
                break;
            case 3:
                System.out.println("Day " + day + " is a Wednesday");
                break;
            case 4:
                System.out.println("Day " + day + " is a Thursday");
                break;
            case 5:
                System.out.println("Day " + day + " is a Friday");
                break;
            case 6:
                System.out.println("Day " + day + " is a Saturday");
                break;
            case 7:
                System.out.println("Day " + day + " is a Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
