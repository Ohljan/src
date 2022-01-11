package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=scan.nextInt();//valid age is 1-120;
        while (!(age>=1 && age<=120)){
            System.err.println("Invalid entry, please re-enter ");
            System.err.println("Enter your age :");
        age=scan.nextInt();
        }



        System.out.println("Are you a US citizen? yes/no ");
        String answer=scan.next().toLowerCase(Locale.ROOT);
        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid text, please re-enter ");
            System.err.println("Are you a US citizen? yes/no");
            answer=scan.next().toLowerCase(Locale.ROOT);
        }







    }
}
