package replitTask;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortWord {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            // write your code below
            String[] arr = str.split(",");
            int shortLength = arr[0].length();
            for (String each : arr) {
                if (each.length() < shortLength) {
                    shortLength = each.length();
                }
            }
            String result = " ";
            for (String word : arr) {
                if (word.length() == shortLength) {
                    result += word + ",";
                }
            }
            String[] arr1 = result.split(",");
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));
        }
    }

