package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class warmupTask1 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
       for(int i=0;i<str.length();i++){
           chars.add(str.charAt(i));
       }
       ArrayList<Character> letters = new ArrayList<>(chars);
       letters.removeIf(p->!Character.isLetter(p));//remove all the character that are not letters;==>only letters will left there
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);// add all the characters
      digits.removeIf(p->!Character.isDigit(p));// remove all that are not digits
        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacter = new ArrayList<>(chars);
      //  specialCharacter.removeAll(letters);//since we know what are letters and what
      //  specialCharacter.removeAll(digits);
        specialCharacter.removeIf(p->Character.isLetterOrDigit(p));

        System.out.println("specialCharacter = " + specialCharacter);



       /* my way works good too
        for (Character each : letters) {
            if (Character.isDigit(each)) {
                list1.add(each);
            }else if (Character.isLetter(each)){
                list2.add(each);
            }else{
                list3.add(each);
            }
        }
        System.out.println("digits are:  " + list1);
        System.out.println("letters are:" + list2);
        System.out.println("specail characters are:" + list3); */
    }
}
