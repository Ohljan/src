package day15_ForLoop;

public class PalinDrome {
    public static void main(String[] args) {
   String word="racecar";// can try with any word: civic
   String reversed="";
        for (int i =word.length()-1; i >=0 ; i--) {
          reversed+=word.charAt(i);

        }
        boolean isPalinDrome=word.equalsIgnoreCase(reversed);// this case will not give the reverse word
        System.out.println("isPalinDrome = " + isPalinDrome);// only print the true or false ;










        // reverse version and original version are same = Palindrome
     // for example: Anna  level  Racecar  dad mom








    }






}
