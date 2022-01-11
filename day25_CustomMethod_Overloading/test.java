package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("--------------");
        String s1="Wooden Spoon";
       String reverse= StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("----------------");
     String word="java";
     boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("--------------------");
        String[] names={"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count=0;
        for (String each:names){
            if (StringUtility.isPalindrome(each)){
                count++;// can find out how many palindrome we have in this array
            }
        }
        System.out.println(count);
        String s2="aaaaabbbbcccccddd";
       String nonDup= StringUtility.removeDuplicates(s2);
        System.out.println("nonDup = " + nonDup);

    
    }
}
