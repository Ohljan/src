package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
     String str="Java";// THIS IS NOT ARRAY ==> toCharARRAY will become array
     // since if it s not array can not use the each loop so need to change it as array
     char[] chars=str.toCharArray();
        for (char each :str.toCharArray()){
         System.out.println(each);
     }

        System.out.println("--------------");
     String sentence="Wooden Spoon";
     String[] word=sentence.split(" ");

        System.out.println(Arrays.toString(word));
        System.out.println("----------------");
        String email="WoodenSpoon@cydeo.com";
        String[] arr= email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------");
String a ="Today is nice day. Today is monday. Today we are learning java";
        String [] sentence1=a.split("\\. ");
        System.out.println(Arrays.toString(sentence1));



    }
}
