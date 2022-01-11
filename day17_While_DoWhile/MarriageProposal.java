package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("will you marry me ? Yes/No");
        String answer=input.next().toLowerCase(Locale.ROOT);
        while(!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
            answer=input.next().toLowerCase(Locale.ROOT);

        }
        if (answer.equals("yes")){
            System.out.println("congrats");

        }else{
            System.out.println("Goodbye !");
        }

    }
}
// mistake , when run it why it prints 3 times re-enter ;