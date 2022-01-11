package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        arr=replaceElement(arr,2,30);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        String []arr2={"java","python","c++","ruby"};
        arr2=replaceElement(arr2,2,"C#");
        System.out.println(Arrays.toString(arr2));
    }
    // replace the element for integer array
    public static int[] replaceElement(int[] array, int index, int newElemeent){
       if (index<0 || index>array.length-1){
           System.err.println("Invalid index: "+index);
           System.exit(0);
       }
        array[index]=newElemeent;
        return array;
    }
    //replace the element for double array
    public static double[] replaceElement(double[] array, int index, double newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }
    //replace the element for char array
    public static char[] replaceElement(char[] array, int index, char newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }
    //replace the element for string array
    public static String[] replaceElement(String[] array, int index, String newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }
}
