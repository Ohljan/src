package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=2147483647;// this is maximum integer ;
        for (int i = 10; i <15 ; i++)// only means how many times we need to repeat
        {//use 0-5 ;20-25 no difference. means five times
            System.out.println("Enter a number: ");
            int num=input.nextInt();//user enter 1 , it smaller than the min
          if (num<min){min=num;// as soon as enter a smaller number the num will become that number

          }
            System.out.println("num = " + num);
        }

    }
}// all infos inside of loop will be repeated
