package day22_DimensionalArray;

import java.util.Arrays;

public class IteratingMutilDimensionalArray {
    public static void main(String[] args) {

// index of elements     0 1 2   0 1 2 3   0 1 2   3
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11}};
// index of arrays        0         1           2
        for (int i = 0; i <arr2D.length ; i++) {//i: index of single dimensional array
         //   System.out.println(Arrays.toString(arr2D[i]));//retrive the array
            for (int j = 0; j < arr2D.length; j++) {//j: index number of elements
                System.out.print(arr2D[i][j]+" ");// 2[] first for array, second for elements
            }
        }

//outer loop getting the single dimensional array , inner loop is running each element in each array

        System.out.println("----------------------------");





    }
}
