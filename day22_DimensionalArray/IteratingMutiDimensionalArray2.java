package day22_DimensionalArray;

public class IteratingMutiDimensionalArray2 {
    public static void main(String[] args) {
        int [][] arr2D={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
        for (int i = arr2D.length - 1; i >= 0; i--) {//shortcut arr2D.forr
          //i : index of array  to reverse the arrays from last array to first one will index 2 to 0
            for (int j = 0; j < arr2D[i].length; j++) {//j : index of elements start from '0'
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();// to get the arrays in the different line need to give an empty print statement
        }
        System.out.println("--------------------------");
        for (int i = 0; i < arr2D.length; i++) {// keep the order of array
            for (int j = arr2D[i].length - 1; j >= 0; j--) {// reverse the order of element in the array
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }



    }
}
