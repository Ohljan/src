package day26_CustomMethodPractice;

import java.util.Arrays;

public class removeElements1 {
    public static void main(String[] args) {
int[]numbers={100,200,300,400,500,600};
           numbers=removeElement(numbers,1);// this is without 200
        numbers=removeElement(numbers,1);//this is without 300
        System.out.println(Arrays.toString(numbers));//this is a new array without 200 alreay

    }
    // remove teh index from the array, return a new array withour that index
     public static int[] removeElement(int[] array, int index) {// need to exclude the index
    if (index<0 || index>array.length-1){
        System.err.println("Invalid Index: "+index);
        System.exit(0);
    }
        int[] result = new int[array.length - 1];
    int j=0;                            // j : is the index of array result
    for (int i=0 ; i< array.length;i++){
        if (i==index){                 // if the element of array is matching  with the element at given inde x then skip
            continue;                 // skip the element of index given
        }
            result[j++]=array[i];//after skip the index , result will be the total of each element .
    }return result;
}





}
