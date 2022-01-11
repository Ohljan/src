package day24_CustomMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str="Java";
        reverse("study");
        String result=reverse(str);
        if (str.equalsIgnoreCase(result)){
            System.out.println(str+"is palindrome");}else {
            System.out.println(str+"is not a palindrom");
        }
    }
public static String reverse(String  str){
        String reverse="";
    for (int i = str.length()-1; i >=0 ; i--) {
        reverse+=str.charAt(i);
    }
   return reverse;// return a value . do not need to print it . can print it later on when we need it
}






}
