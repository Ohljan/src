package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,5,6,7,7,7};
        int[]unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }
    // return the unique element of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result={};
        for (int each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
               result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }
    public static double[] uniqueElements(double[] array){
        double[] result={};
        for (double each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }
    public static char[] uniqueElements(char[] array){
        char[] result={};
        for (char each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }
    public static String[] uniqueElements(String[] array){
        String[] result={};
        for (String each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }





}
