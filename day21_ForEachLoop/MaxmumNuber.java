package day21_ForEachLoop;

import java.util.Arrays;

public class MaxmumNuber {
    public static void main(String[] args) {
       int []numbers={10,5,4,20,1,0};
       int max=numbers[0];
        for (int each : numbers) {
            if (each>max){
               max=each;}
        }
       // System.out.println(Arrays.toString(each));





    }
}
