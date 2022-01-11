package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabcccdeeefgggggggggggggiiiiiiiiiiiiijkkkkkkkkkkkkkl";
        String[]arr=str.split("");// convert the string to array
        ArrayList<String>list=new ArrayList<>(Arrays.asList( str.split("")));// array to arraylist
        System.out.println("list = " + list);
        String unique="";
        for (String each : list) {
            int frequency=Collections.frequency(list,each);
            if (frequency==1){
                unique+=each;// it s a string so can not use the list.add method here
            }
        }
        System.out.println("unique = " + unique);




    }
}
