package day17_While_DoWhile;

public class FrequencyOfAWord {
    public static void main(String[] args) {
        String str="JavaJavaJavaJavaJavaJava;";
        int frequency=0;

        for (int i = 0; i <str.length()-3 ; i++) {// i: 0 1  2  3
            String eachSub=str.substring(i,i+4);
            //System.out.println(eachSub);
if (eachSub.equals("Java")){
   frequency++;
}
        }

        System.out.println(frequency);

    }
}
