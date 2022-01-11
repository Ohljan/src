package day19_LoopPractice;

public class FindUniqueCharacter {
    public static void main(String[] args) {
     // ex: str="aabccdeef"; output=bdf; without using the index of
     String str="aabccdeef";
     String result="";// unique charaters will be :bdf

        for (int j = 0; j <str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;// represent the frequency of the variable of the ch
            for (int i = 0; i <str.length() ; i++) {// compare teh character that outer loop pick , with each character of the string
                char each=str.charAt(i);// each character of str
                if (ch==each){
                    count++;
                }
            }
           if (count==1){// this is the frequency and if it s 1 then the character is unique
               result+=ch;// this if condition is outside of inner loop and inside of outer loop
           }
            /*if (count!=1){
                continue;
            }*/

        }
        System.out.println(result);














    }
}
