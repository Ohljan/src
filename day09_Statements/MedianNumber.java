package day09_Statements;

public class MedianNumber {
    public static void main(String[] args) {
   /*
   2. Create a class called MedianNumber. write a program that can find the median number
   between three DIFFERENT given integers
 Ex: a = 10, b= 15, c = 20;
Output: 15 is the median shi zhongwei shu  number
  */

        int a=10,
        b=20,
        c=30;
        //a=15, b=10; c=20  || a=15, c=10, b=20
        boolean aIsMedian=(a>b && a<c) || (a>c && a<b);

        //b=15,a=20, c=10;  ||b=15,a=10, c=20
        boolean bIsMedian=(b>c && b<a)  ||(b>a && b<c);

        boolean cIsMedian=!aIsMedian && bIsMedian;
        if (aIsMedian){// if a is the median number
            System.out.println(a+" is median number");
        }
        if (bIsMedian){
            System.out.println(b+" is median number");
        }
        if (cIsMedian){
            System.out.println(c+ " is median number");
        }







    }





    }





