package day26_CustomMethodPractice;

import utilities.MathUtilityByMe;

public class testMath {
    public static void main(String[] args) {
        int num1=5;
        double num2=7.8;
        int num3=34;
        double num4=125.7;
        int cube1= MathUtilityByMe.cubeOfNumber(5);
        double cube2= MathUtilityByMe.cubeOfNumber(7.8);
     int max= MathUtilityByMe.maxNumber(num1,num3);
     int min= MathUtilityByMe.minNumber(num2,num4);
        System.out.println(max);
        System.out.println(min);
        System.out.println(cube1);
        System.out.println(cube2);
    }
}
