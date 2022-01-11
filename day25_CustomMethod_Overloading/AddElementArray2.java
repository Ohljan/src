package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementArray2 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};
       numbers= addelement(numbers,7);// the first one get executed
      char[] chars={'A','B','C','D'};
     chars= addelement(chars,'E');// to resigne it to a new one since the original one can not be changed  the size
       String [] names={"Ahmet","Oleksandr","Sinem","Cihan"};
      names=addElement(names,"Layan");
        System.out.println("numbers = " +  Arrays.toString(numbers));
        System.out.println("chars = " +Arrays.toString(chars));
        System.out.println("names = " +Arrays.toString(names) );


    }
    public static int[] addelement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] addelement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static char[] addelement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }




}
