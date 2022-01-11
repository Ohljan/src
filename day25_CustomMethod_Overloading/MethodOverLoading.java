package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverLoading {
    public static void main(String[] args) {
        int[]intArray={5,6,0,-13,4};
        Arrays.sort(intArray);
        double[] doublesArray={10.5,11.5,5,5,4.5};
        Arrays.sort(doublesArray);
        char[]charArray={'E','F','B','D','C','A'};
        Arrays.sort(charArray);
        System.out.println("-------------------------");
        sumOfNumbers(10,20);//sum of 2 numbers will be executed, all depand on the parameters . how many  numbers we give it inside()
    // after created the method for integer and double so we can enter till 4 numbers in both data type
       double sum2= sumOfNumbers(10,20,3.5);
        System.out.println(sum2);
        int sum3=sumOfNumbers(10,20,30,40);
        double sum4=sumOfNumbers(4.5,6.8,9.8,5.6);
        double sum5=sumOfNumbers(4.5,5.5,6.5);


        }







    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){
        return sumOfNumbers(num1,num2)+num3;
    }
    public static double sumOfNumbers(double num1,double num2,double num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1,int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers(double num1,double num2, double num3, double num4){
        return sumOfNumbers(num1,num2,num3)+num4;         }



}
