package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[] result=reverseArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseArray(int[] array){
        int []result=new int[array.length];// make sure  the new array have enough capacity
// int j=0 then result[j++]=array[i] then remove the j from the loop . when i decreasing j is increasing
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {// j : index number of element
            result[j]=array[i];
        }return result;
    }
}
