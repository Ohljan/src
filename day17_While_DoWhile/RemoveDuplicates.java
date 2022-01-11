package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
    String str="AAABBCCC";
    String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i);// convert the char to string
            if (result.contains(ch)){
                continue;// if use break here will get only A then it will exit
            }
            result+=ch;
        }
        System.out.println(result);





    }
}
