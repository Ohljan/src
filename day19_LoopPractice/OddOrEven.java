package day19_LoopPractice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=scan.nextInt();

        if(num%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
        System.out.println("Would you like to enter another number?(yes/no)");
        String a=scan.next();

        if (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
            System.out.println("Invalid Entry");
            System.exit(0);// very careful when we use this . since it terminates everything
        }
        if (a.equalsIgnoreCase("no")){


        }
    }
}
