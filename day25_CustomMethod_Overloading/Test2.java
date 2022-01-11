package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
     int[] numbers={1,2,3,4,5};
        ArraysUtility.printEachElement(numbers);
        System.out.println("---------");
     double[] num2={3.5,4.8,5.5,7.9};
     ArraysUtility.printEachElement(num2);
        System.out.println("----------------------");
     String[] names={"Ohljan","zunun","sherzat","fatima","nurziya"};
      ArraysUtility.printEachElement(names);
        System.out.println("-------------");
     char[] letters={'A','B','C','D','E'};
     ArraysUtility.printEachElement(letters);
        System.out.println("-------------");
       int[]n1={1,2,3,4,5,6};
 int max1=ArraysUtility.maxNum(n1);
        System.out.println("max1 = " + max1);
        System.out.println("------------------");
        double[] n2={2.3,4.5,6.6,7.8,20.5};
        double max2=ArraysUtility.maxNum(n2);
        System.out.println("max2 = " + max2);
         int min1=ArraysUtility.minNum(n1);
       double min2=ArraysUtility.minNum(n2);
        System.out.println("minimum number is  = " + min1);
        System.out.println("--------------------");
        System.out.println("minimum number is  = " + min2);
        System.out.println("-----------");
    int[] a1={1,2,3,4,5,6,7};
    boolean isContains=ArraysUtility.contains(a1,10);
        System.out.println("isContains = " + isContains);
        System.out.println("----------------");

    }
}
