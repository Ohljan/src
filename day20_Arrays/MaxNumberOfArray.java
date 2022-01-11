package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[]numbers={10,5,4,-4,0};
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){// if there is element in the array is greater than the current max number
                max=numbers[i];

            }
        }
                 System.out.println(max); // to find max number
        System.out.println("---------------------");



    }
}
