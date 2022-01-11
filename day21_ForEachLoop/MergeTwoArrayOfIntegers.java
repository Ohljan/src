package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrayOfIntegers {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Layan", "Aysenur"};//3 element
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; // 5 elements
        String[] students = new String[group1.length + group2.length];// 3+5=8 elements
        // make sure the third array students have enough space to put two arrays, need enough capacity
        int i = 0;
        for (String each : group1) {
            students[i++] = each;// need one indendent array for each
        }
        for (String each : group2) {
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));


        System.out.println("--------------------");
     char[] ch1={'A','B','C'};
     char[]ch2={'D','E','F','G','H'};
     char[] chars=new char[ch1.length+ch2.length];
     int j=0;
        for (char c : ch1) {
            chars[j]=c;
            j++;
        }
        for (char c : ch2) {
            chars[j]=c;
            j++;
        }
        System.out.println(Arrays.toString(chars));
    }
}