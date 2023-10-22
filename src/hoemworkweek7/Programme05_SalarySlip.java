package hoemworkweek7;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print the salary slip
 */

import java.util.Scanner;

public class Programme05_SalarySlip {

    // declaring the objects as static, because they are used while printing the mark sheet
    static int empID;
    static String empName;
    static float basicSalary;
    static float HRA;
    static float TA;
    static float DA;
    static float PF;
    static float grossSalary;

    //taking inputs from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        empName = sc.next();
        System.out.print("Enter Employee ID: ");
        empID = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextFloat();
        calculations(); //static --> static direct calling
        printing(); //static --> static direct calling
        sc.close(); // closing the scanner object
    }

    // method to calculate HAR, TA, DA, PF & Gross Salary from Basic Salary
    public static void calculations(){
        HRA = ((float) 10 /100)*basicSalary;
        DA = ((float) 8 /100)*basicSalary;
        TA = ((float) 9 /100)*basicSalary;
        PF = ((float) 20 /100)*basicSalary;
        grossSalary = basicSalary + HRA + TA + DA - PF;
    }

    // method to print the Salary Slip
    public static void printing(){
        System.out.println(" __________________________________ ");
        System.out.println("|            SALARY SLIP           |");
        System.out.println("|__________________________________|");
        System.out.println("|Employee Id    :   "+empID+"           |");
        System.out.println("|Employee Name  :   "+empName+"          |");
        System.out.println("|__________________________________|");
        System.out.println("|Basic Salary   :   "+basicSalary+"        |");
        System.out.println("|HRA 10%        :   "+HRA+"         |");
        System.out.println("|TA 8%          :   "+TA+"         |");
        System.out.println("|DA 9%          :   "+DA+"         |");
        System.out.println("|PF 20%         :   "+PF+"         |");
        System.out.println("|__________________________________|");
        System.out.println("|Gross Salary   :   "+grossSalary+"        |");
        System.out.println("|==================================|");
    }
}
