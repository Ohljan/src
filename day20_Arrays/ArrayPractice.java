package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
     int[] numbers={10,20,50,70};
        System.out.println(Arrays.toString(numbers));


        System.out.println("-------------");
        int[]score=new int[5];
        score[1]=85;
        score[score.length-1]=95;
        score[3]=75;
        score[2]=65;
        score[0]=55;
        System.out.println(Arrays.toString(score));

    }
}

