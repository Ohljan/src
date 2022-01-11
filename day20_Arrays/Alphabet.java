package day20_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
    char[] alphabets=new char[26];//front & end should be same char
       /*
        alphabets[0]='Z';//90
        alphabets[1]='Y';//89
        alphabets[2]='X';//88
        System.out.println(Arrays.toString(alphabets));// need to call tostring methond from array class
*/char ch='z';
        for (int i = 0; i <alphabets.length ; i++,ch--) {
            alphabets[i]=ch;
        }  System.out.println(Arrays.toString(alphabets));



        System.out.println("--------------------");

        for (char i = 0,j='Z'; i <alphabets.length ; i++,j--) {
            //i represent index number , j represent the character
            alphabets[i]=j;
        }

        System.out.println(Arrays.toString(alphabets));





    }
}
