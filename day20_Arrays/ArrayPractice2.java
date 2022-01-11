package day20_Arrays;



import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
       /*letters[0]='A';    everytime when it repeat the index number
        letters[1]='B';      and the character changing at the same time
        letters[2]='C'     so i && j repeating at the same time
        */
        char[]letters=new char[26];
        for (char i = 'A',j=0 ;i <='Z'&& j<letters.length ; i++,j++) {
            letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));// A-Z
        System.out.println("-----------------");
char ch='A';
        for (int i = 0; i <letters.length ; i++) {
            letters[i]=ch++;
        }


        System.out.println(Arrays.toString(letters));

        System.out.println("------------------");
        char[]letters2=new char[26];//Z-A
        char ch1='Z';
        for (char i ='Z' ;i>='A' ;i--) {
            letters2[i]=ch1++;
        }

        System.out.println(Arrays.toString(letters2));









    }
}
