package hoemworkweek7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * Sales amount >= 20,000 10%
 * Sales amount >= 10,000 5%
 * Sales amount < 10,000 2%
 */

import java.util.Scanner;

public class Programme07_Commission {

    //taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales ID: ");
        int salesID = sc.nextInt();
        System.out.print("Enter Seller's Name: ");
        String sellerName = sc.next();
        System.out.print("Enter Sales Amount: ");
        float salesAmount = sc.nextFloat();
        System.out.print("Enter Basic Salary: ");
        float basicSalary = sc.nextFloat();

        float commission = commissionCal(salesAmount); // calling a method to calculate commission percentage
        System.out.print("Commission: " + commission);
        sc.close(); // closing the scanner object
    }

    // method to calculate the commission
    public static float commissionCal(float salesAmount){
        float commission = 0;
        if(salesAmount>=50_000){
            commission = ((float) 35 /100)*salesAmount;
        } else if (salesAmount>=30_000 && salesAmount<=49_999) {
            commission = ((float) 20 /100)*salesAmount;
        } else if (salesAmount>=20_000 && salesAmount<=29_999) {
            commission = ((float) 10 /100)*salesAmount;
        }else if (salesAmount>=10_000 && salesAmount<=19_999) {
            commission = ((float) 5 /100)*salesAmount;
        }else if (salesAmount>=0 && salesAmount<=9_999) {
            commission = ((float) 2 /100)*salesAmount;
        } else
            System.out.println("No Commission");

        return commission;
    }
}
