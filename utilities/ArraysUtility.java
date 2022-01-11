package utilities;
import java.util.Arrays;
public class ArraysUtility {

    //1. print each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.print(each + " ");
        }
    }
    // 2.print each double
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }
    //3. print each string
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.print(each + " ");
        }
    }
    //4. print each char
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.print(each + " ");
        }
    }


    //5. return the max number of an integer array
    public static int maxNum(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];// after sort it . last number will be the biggest one
    }
    //6. return the max number of a double array
    public static double maxNum(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];// after sort it . last number will be the biggest one
    }


    //7. return the min number of an integer array
    public static int minNum(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
    //8. return the min number of a double array
    public static double minNum(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //9. checks if the given integer is contained in the given array , return boolean contain(int[] , int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {// if any arrays element equals with each , that means the array contain the element
                result = true;
            }
        }
        return result;
    }
    //10. check if the given double is contain in the given double array
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }
    //11. check if the string is contains the string array
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equalsIgnoreCase(element)) {
                result = true;
            }
        }
        return result;
    }
    //12. check if the char is contains in the char array
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //13.find the frequency of an element in an integer array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    //14. find the frequecy of double in an double array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }
    //15.find the frequency of a char in an array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    //16. find the frequency of string in a string array
       public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


        //17.add an integer to an intege array
        public static int[] addElement ( int[] array, int element){
            int[] result = new int[array.length + 1];
            int i = 0;
            for (int each : array) {
                result[i++] = each;
            }
            result[i] = element;
            return result;
        }
        //18. add a double number in an double array
        public static double[] addElement ( double[] array, double element){
            double[] result = new double[array.length + 1];
            int i = 0;
            for (double each : array) {
                result[i++] = each;
            }
            result[i] = element;
            return result;
        }
        //19. add a cha in an char array
        public static char[] addElement ( char[] array, char element){
            char[] result = new char[array.length + 1];
            int i = 0;
            for (char each : array) {
                result[i++] = each;
            }
            result[i] = element;
            return result;
        }
        //20. add a string to a string array
        public static String[] addElement (String[]array, String element){
            String[] result = new String[array.length + 1];
            int i = 0;
            for (String each : array) {
                result[i++] = each;
            }
            result[i] = element;
            return result;
        }


        //21. return the unique element of the array as a new array
        public static int[] uniqueElements(int[] array){
        int[] result={};
        for (int each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }
        //22. return unique element of a double array
       public static double[] uniqueElements(double[] array){
        double[] result={};
        for (double each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }
       //23. return unique element of a char array
       public static char[] uniqueElements(char[] array){
        char[] result={};
        for (char each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }
        //24. return unique element of a string array
        public static String[] uniqueElements(String[] array){
        String[] result={};
        for (String each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){// if the frequency is 1 , the element is unique
                result=ArraysUtility.addElement(result,each);// return a new array by include the unique elements
            }
        }
        return result;
    }


    //25. remove the index from the integer array, return a new array without that index
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
    //26.remove the index from the double array, return a new array without that index
    public static double[] removeElement(double[] array, int index) {// need to exclude the index
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j=0;                            // j : is the index of array result
        for (int i=0 ; i< array.length;i++){
            if (i==index){                 // if the element of array is matching  with the element at given inde x then skip
                continue;                 // skip the element of index given
            }
            result[j++]=array[i];//after skip the index , result will be the total of each element .
        }return result;
    }
    //27.remove the index from the char array, return a new array without that index
    public static char[] removeElement(char[] array, int index) {// need to exclude the index
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j=0;                            // j : is the index of array result
        for (int i=0 ; i< array.length;i++){
            if (i==index){                 // if the element of array is matching  with the element at given inde x then skip
                continue;                 // skip the element of index given
            }
            result[j++]=array[i];//after skip the index , result will be the total of each element .
        }return result;
    }
    //28.remove the index from the String array, return a new array without that index
    public static String[] removeElement(String[] array, int index) {// need to exclude the index
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j=0;                            // j : is the index of array result
        for (int i=0 ; i< array.length;i++){
            if (i==index){                 // if the element of array is matching  with the element at given inde x then skip
                continue;                 // skip the element of index given
            }
            result[j++]=array[i];//after skip the index , result will be the total of each element .
        }return result;
    }


    // 29.merge  two  integer  arrays and returns the new  array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result=addElement(result,each);
        }
        for (int each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }
    //30.merge  two  double arrays and returns the new  array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result=addElement(result,each);
        }
        for (double each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }
    //31. merge  two  char  arrays and returns the new  array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result=addElement(result,each);
        }
        for (char each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }
    //32.merge  two  String  arrays and returns the new  array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result=addElement(result,each);
        }
        for (String each : arr2) {
            result=addElement(result,each);
        }
        return result;
    }//there is different  way for this


    //33 . reverser the given integer array, returns  new array
    public static int[] reverse(int[] array){
    int[] result={};
    for (int i = array.length - 1; i >= 0; i--) {
        result=ArraysUtility.addElement(result,array[i]);
    }
    return result;
}
    //34.reverser the given double array, returns  new array
    public static double[] reverse(double[] array){
        double[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }
    //35.reverser the given char array, returns  new array
    public static char[] reverse(char[] array){
        char[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }
    //36.reverser the given string  array, returns  new array
    public static String[] reverse(String[] array){
        String[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }


    //37. replace the element for integer array
    public static int[] replaceElement(int[] array, int index, int newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }
    //38.replace the element for double array
    public static double[] replaceElement(double[] array, int index, double newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }
    //39.replace the element for char array
    public static char[] replaceElement(char[] array, int index, char newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }
    //40.replace the element for string array
    public static String[] replaceElement(String[] array, int index, String newElemeent){
        if (index<0 || index>array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElemeent;
        return array;
    }


    // 41.replaces all  the matching old value with the new value. integer array
    public static int[] replaceAll(int[]array,int oldValue,int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    //42. replaces all  the matching old value with the new value. decimal array
    public static double[] replaceAll(double[]array,double oldValue,double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    //43. replaces all  the matching old value with the new value. char array
    public static char[] replaceAll(char[]array,char oldValue,char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    //44. replaces all  the matching old value with the new value. string array
    public static String[] replaceAll(String[]array,String oldValue,String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }


    //45. remove the duplicates from the given array,returns the new  integer array
    public static int[] removeDuplicates(int[] array){
        int[] result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    //46. remove the duplicates from the given array,returns the new double array
    public static double[] removeDuplicates(double[] array){
        double[] result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    //47.remove the duplicates from the given array,returns the new char array
    public static char[] removeDuplicates(char[] array){
        char[] result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }
    //48.remove the duplicates from the given array,returns the new string  array
    public static String[] removeDuplicates(String[] array){
        String[] result={};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;
    }





}























