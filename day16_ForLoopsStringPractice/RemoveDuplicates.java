package day16_ForLoopsStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";//final result should be "abc"
        String result = "";// need to contain only "abc"
        for (int i = 0; i <= str.length() - 1; i++) {// also can use i<str.length()
            String ch = "" + str.charAt(i); // represents each character of str
            if (!result.contains(ch))//if the character is not contained in the result
                // change the char to string : add a empty string""
            {
                result += ch;//"+"is the concatenation . means put the letters together
            }

        }
        System.out.print(result);// print statement outside of loop
        




    }
}