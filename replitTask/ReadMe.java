package replitTask;

import java.util.Scanner;

public class ReadMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }


        String result = " ";
        for (String each : arr) {
            result += each + " ";
            System.out.println(result);
        }

        System.out.println(result.substring(0, 3));
        System.out.println(result.substring(1, 4));
        System.out.println(result.substring(2, 5));
        System.out.println(result.substring(3, 6));

    }
}