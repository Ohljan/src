package day15_ForLoop;


public class ReverseString {
    public static void main(String[] args) {

//input: Wooden Spoon, reverse the string
         String str="Wooden Spoon";   // to find the index

   String result="";// contain the reversed version of str
        // reslut+=str.charAt(str.length()-1);// get 'n"after this
        result+=str.charAt(11);// get  n
        result+=str.charAt(10);//get o can go all the way to get index zero
        for (int i = str.length()-1; i >=0; i--) {// in this case does not matter if the word has 100 letters
            // i : index number of str(staring last index to index 0)
            result+=str.charAt(i);// this is the result we get after reduce it one by one
         //"+" here means adding each character to result . concatenation.

        }
        System.out.println(result);// this  must be outside of loop

// here we created the formula to get the reverse of a string; does not matter  how long it is













    }









}
