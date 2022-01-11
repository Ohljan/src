package day22_DimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
      String[]  group1={"Joh","Joes","James"};
      String[] group2={"ohljan","zunun","sherin"};
      String[] group3={"zulpia","fatima","aygul"};
      String[][] groups=new String[3][];// here need to write the numbers of array
        // index number is ; 0, 1, 2 so group1 index is '0'  ; inedx of group 2 is '1'
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
       // System.out.println(Arrays.toString(groups)); this would not work for multi dimensional array
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------");
        int[]num1={1,2,3};
        int[]num2={4,5,6,7};
        int[]num3={8,9,10,11};
 //index of elements     0 1 2   0 1 2 3   0 1 2  3
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11}};
 //   index of array       0        1          2
// two different kinds of index number so : there are two [] []
// first[] is the index number of array; second []  is the index of elements

    //int[1] arr2D=[]num2;
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));// return a single dimensional array the num2


        System.out.println(arr2D[2][3]);// return the third array num3;then second[3]return the element '11'. in the third array


    }
}
