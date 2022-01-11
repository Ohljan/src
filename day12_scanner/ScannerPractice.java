package day12_scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int num=scan.nextInt();
        String result="";//temperary value , so it will be replaced later
        if (num>=1 && num<=7){
            result=(num==1)?"monday":(num==2)?"Tuesday":(num==3)?"Wednesday"
                    :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"sturday":
                    "sunday";
        }else{
            result="Invalid number";
        }
        System.out.println(result);
        System.out.println("result = " + result);




    }






}

