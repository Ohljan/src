package day16_ForLoopsStringPractice;

public class FindUniqueCharacters {
    public static void main(String[] args) {
       String str="aaabccc";
       String result="";

          //              0===2 both are the index of 'a'

        for (int i = 0; i <str.length() ; i++) {//i: is the index number of str(starting from zero)
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){//if the first and last index number are same , it will be unique
                result+=ch;

        }

       }

        System.out.print(result);// will print only "b" which is only unique character








// if index && lastIndex  are equal that means that letter is unique











    }











}
