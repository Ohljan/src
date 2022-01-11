package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="bdca";
        // write a program that can check if str1 & str2 are build out same characters

    char[] str3=str1.toCharArray();
    char[] str4=str2.toCharArray();

        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(str4));
        Arrays.sort(str3);
        Arrays.sort(str4);
        boolean r1=Arrays.equals(str3,str4);
        if (r1==true){
            System.out.println("it s an Anagram");
        }









    }
}
