package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str="Cat Cat Dog Dog Dog";
        int frequency=0;
        for (int i = 0;  i<=str.length()-4 ; i++) {
            String eachSub=str.substring(i,i+3);
            if (eachSub.equalsIgnoreCase("cat")){
                frequency++;
            }

        }
        System.out.println(frequency);


    }
}