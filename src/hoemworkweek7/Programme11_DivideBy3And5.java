package hoemworkweek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Programme11_DivideBy3And5 {

    // calling both the methods in to main method for execution
    public static void main(String[] args) {
        divideBy3();
        divideBy5();
    }

    // method to find numbers, which are divisible by 3 from 1 to 100
    public static void divideBy3(){
        System.out.println("Numbers divide by 3 between 1 to 100");
        for(int i=1; i<=100; i++){
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
        System.out.println("/n");
    }

    // method to find numbers, which are divisible by 5 from 1 to 100
    public static void divideBy5(){
        System.out.println("Numbers divide by 5 between 1 to 100");
        for(int i=1; i<=100; i++){
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println("/n");
    }
}
