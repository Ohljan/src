package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));// for array must use toString method
        System.out.println("------------------");
        int[]scores={95,100,55,65,85,78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("min score: "+scores[0]);
        System.out.println("max score: "+scores[scores.length-1]);

String [] names={"Gunay","Anna","Zuhal","Ahmet","Maria","Sinema"};
       Arrays.sort(names);
        System.out.println(Arrays.toString(names));
// if the first character is same , it will compare the second charcater

        String []word={"Anna","ANNA"};
        System.out.println(Arrays.toString(word));

        System.out.println("---------------");
        int[] arr1={1,3,2};
        int[] arr2={1,2,3};
       boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);// false
        Arrays.sort(arr1);// after this it will be 1 2 3
        Arrays.sort(arr2);
         boolean r2= Arrays.equals(arr1,arr2);
        System.out.println(r2);// after sorts this will be true

        System.out.println("-------------------");
    char[] ch1={'a','c','b'};
    char[]ch2={'b','a','c'};
        Arrays.sort(ch1);//{ a b  c}
        Arrays.sort(ch2);//{a b c}
         boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);


    }
}
