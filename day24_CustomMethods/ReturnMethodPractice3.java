package day24_CustomMethods;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
       String str="aabccdee";
        for (int i = 0; i < str.length(); i++) {
            int frequence=freququency(str,'a');
            if (frequence==1){
                System.out.println(str.charAt(i));//did it with custom method
            }
        }


    }
public static int freququency(String str, char ch){
      int count=0;
    for (char each: str.toCharArray()) {
        if (each==ch){
            count++;

        }
    } return count;// should be outside of loop
}






}
