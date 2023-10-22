package hoemworkweek7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme08_CityNameIfElse {

    //taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first letter of city: ");
        char firstLetter = sc.next().charAt(0); // taken first letter from the entered string
        ifStatement(firstLetter); // calling a method to find city name according to the character entered
        sc.close(); // closing the scanner object
    }

    // method to match the city name with entered character
    public static void ifStatement(char letter){
        if(letter == 'A'){
            System.out.println("Ahmedabad");
        } else if (letter == 'B') {
            System.out.println("Bombay");
        }else if (letter == 'C') {
            System.out.println("Calcutta");
        }else if (letter == 'D') {
            System.out.println("Delhi");
        }else if (letter == 'E') {
            System.out.println("Etawa");
        }else if (letter == 'F') {
            System.out.println("Faridabad");
        } else{
            System.out.println("Invalid Entry");
        }
    }
}
