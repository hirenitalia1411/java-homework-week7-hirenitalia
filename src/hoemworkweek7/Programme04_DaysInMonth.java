package hoemworkweek7;
/**
 * find a days in a month by considering leap year or not.
 */

import java.util.Scanner;

public class Programme04_DaysInMonth {

    // method to find the leap year
    public static boolean isLeapYear(int year) {
        System.out.println("In-side isLeapYear Method");
        if ((year >= 1 && year <= 9999)) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }else {
            System.out.println("false");
            return false;
        }
    }

    // method to get the days of the month of entered year and month
    public static int getDaysInMonth(int m, int y){
        System.out.println("In-side getDaysInMonth Method");
        /**
         * call a leap year method, if entered number is leap year then execute true block (if statements) in if statement
         * if entered number is not a leap year then execute false block (else statement) in if statement
         */
        boolean leapYear = isLeapYear(y);
        if ((m>=1 && m<=12) && (y>=1 && y<=9999)) {
            if (leapYear) {
                switch (m) {
                    case 1:
                    case 3:
                    case 7:
                    case 5:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 29;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 1;
                }
            } else {
                switch (m) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 28;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 1;
                }
            }
        }else{
            return 1;
        }
    }

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = sc.nextInt();
        System.out.print("Please enter a month: ");
        int month = sc.nextInt();

        boolean a = isLeapYear(year); // calling a leap year method
        int days = getDaysInMonth(month,year); // calling a days in a month method
        System.out.println(days);
        sc.close(); // closing of the scanner object
    }
}
