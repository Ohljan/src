package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,3,3,3,4,4,4,4};
        arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        String []arr1={"ohljan","ohljan","zunun","zunun"};
        arr1=removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("------------------------");
        int[] numbers={1,1,1,1,3,3,3,2,2,2,4,4,4};
        numbers=Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(numbers));
    }
    // remove the duplicates from the given array,returns the new  integer array
    public static int[] removeDuplicates(int[] array){
        int[] result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    // remove the duplicates from the given array,returns the new double array
    public static double[] removeDuplicates(double[] array){
        double[] result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    //remove the duplicates from the given array,returns the new char array
    public static char[] removeDuplicates(char[] array){
        char[] result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    //remove the duplicates from the given array,returns the new string  array
    public static String[] removeDuplicates(String[] array){
        String[] result={};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    
    
    
}
