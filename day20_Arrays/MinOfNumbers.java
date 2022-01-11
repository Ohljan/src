package day20_Arrays;

public class MinOfNumbers {
    public static void main(String[] args) {
        int[]numbers={8,49,-34, 50,90};
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){// when the number is smaller than the min it will print it since the condition become true
                min=numbers[i];
            }
        }
        System.out.println(min);
    }
}// this approch works for all kind of array
