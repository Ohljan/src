package day13_String;

public class StringMethod {

    public static void main(String[] args) {
    String word="Cydeo";
    char thirdChar=word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char tenChar=word.charAt(9);// out of rang will have error ,
        // for this word  rang should be till 4; so when we ask for 9 it will show error

        System.out.println("tenChar = " + tenChar);








    }







}
