package hoemworkweek7;
/**
 *  * Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
 *  * any other alphabet should be invalid entry
 *
 */

import java.util.Scanner;

public class Programme09_CityNameSwitch {

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first letter of city: ");
        char firstLetter = sc.next().charAt(0); // taken first letter from the entered string
        switchStatement(firstLetter); // calling a method to find city name according to the character entered
        sc.close(); // closing the scanner object
    }

    // method to match the city name with entered character
    public static void switchStatement(char letter){
        switch (letter){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Calcutta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Etawa");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
