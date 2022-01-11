package day24_CustomMethods;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
       String str="acccccdddaaaaaaaabbbbbbbbb";
       str=removeDublicates(str);  //this is return method we created so we can use it here again
        System.out.println(str);
    }
public static String  removeDublicates (String str){//" aaabbcc"==>"abc"
        String result="";
    for (int i = 0; i < str.length(); i++) {
        char each=str.charAt(i);
        if (!result.contains(each+"")){// each is a char but we need it as a string so add ""
            result+=each;
        }

    }
 return result;
}






}
