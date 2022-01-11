package day23_CustomMethod;

import java.util.Scanner;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("--------------");
        helloCydeo5Times();
        System.out.println("---------------");
        evenNumber();

}






    public  static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World !");
        }
   }//==> it s been created next step is to call it when we need it
public static  void  helloCydeo5Times(){
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello Cydeo!");
    }
}

public static void evenNumber(){
    for (int i = 2; i <11 ; i+=2) {
        System.out.print(i+" ");
        }
    }








}
