package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        String [] cities={"Boston","houston","Austin","lincoln","Tulsa"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(cities));
        int a =list.size();
        for (String str : list) {
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
            list.set(--a,rev);
        }
        System.out.println(list);
    }

}
