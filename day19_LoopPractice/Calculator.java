package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num1=scan.nextInt();

        System.out.println("Enter a math operator :");
        char operator=scan.next().charAt(0);//if we expected char input from the user this is the way we should

if (!(operator=='+'||operator=='-')){
    System.err.println("Invalid Math operator :"+operator);// err system error
    System.exit(0);//terminates whole program we are running
}
        System.out.println("Enter a number:");

        int num2=scan.nextInt();



    }
}
