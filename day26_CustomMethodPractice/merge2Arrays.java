package day26_CustomMethodPractice;

import java.util.Arrays;

public class merge2Arrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[]arr2={5,6,7,8};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
   public static int[] merge (int[]arr1,int[] arr2){
       int[] result=new int[arr1.length+arr2.length];
       int i=0; // this is the index of each element
       for (int each : arr1) {
           result[i++]=each;   // continuesly adding each element to the result for each index
       }
       for (int each : arr2) {
           result[i++]=each;
       }
       return result;
   }
}
