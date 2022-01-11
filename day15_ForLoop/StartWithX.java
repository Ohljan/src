package day15_ForLoop;


import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        System.out.println("enter a word");
      Scanner input=new Scanner(System.in);
        String word=new Scanner(System.in).next();
        if (word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
            System.out.println(word);
        }








    }






}
