package day12_scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        input.nextLine();// to clear the scanner

        System.out.println("Enter your fullname:");
        String fullName=input.nextLine();

        System.out.println("Enter your GPA :");
        double gpa=input.nextDouble();//3.5 enter
        input.nextLine();// to clear the scanner

        System.out.println("Ente your school name: ");
       String schoolName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);


input.close();






    }
/*
1 ask the user to enter the age(nextInt)
2 ask the user to enter the full name (nextLine)
 */



}
