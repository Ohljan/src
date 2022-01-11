package day12_scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
        System.out.println("Enter you full name:");
        String fullName=input.nextLine();

        System.out.println("Enter your Programming language");
        String programming=input.nextLine();

        System.out.println("Enter your age :");
        int age=input.nextInt();
        //String age=input.nextLine();// after enter the age will have an"enter"left in the scanner
        input.nextLine();// it will take off the enter key left in the scanner

        System.out.println("Enter your schoold name");
        String schoolName=input.nextLine();

        System.out.println("programming = " + programming);
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
input.close();


    }





}
