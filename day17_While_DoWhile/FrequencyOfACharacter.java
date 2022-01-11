package day17_While_DoWhile;

public class FrequencyOfACharacter {
    public static void main(String[] args) {
   String str="AAABBBCAAAAAaaaAAAAA";
   char ch='A';

   int frequency=0;
        for (int i = 0; i <str.length() ; i++) {//i : indexes of str
            char eachChar=str.charAt(i);//eachChar: each character of str.
        if (ch==eachChar){// if given ch is matching with the eachChar.then ch is appeared in the string
            frequency++;


        }

        }


        System.out.println(frequency);



// this is the formula to find the frequency of a char in a string , any char in any string




    }










}
