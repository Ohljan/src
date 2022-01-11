package day01_JavaIntro;

import day24_CustomMethods.ReturnMethodIntro;
import day24_CustomMethods.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {
        String str="aaaaaaaabbbbbbbbbddddddddddccccccc";
        str= ReturnMethodPractice4.removeDublicates(str);
        System.out.println(str);
        String name="Java Programming";
        String reverseName= ReturnMethodIntro.reverse(name);
        System.out.println(reverseName);
        System.out.println("------------------");




    }
}
