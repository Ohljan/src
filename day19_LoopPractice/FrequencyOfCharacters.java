package day19_LoopPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        // ex: str="aabcccd"  output = a2b1c3d1
        String str="aabcccd";
        String result="";
        for (int j = 0; j <str.length() ; j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {// inner loop to find the frequency of each character
                char each = str.charAt(i);// each character of the str.
                if (ch == each) {
                    count++;
                }
            }if (result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;
        }
        System.out.println(result);









    }
}
