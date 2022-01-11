package SelfStudy;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class day2_uniqueElement {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Ohljan","sherzat","Gulistan","Ohljan","Ohljan","Gulistan","Ali"));

        System.out.println(list);
        for (String each : list) {
            int frequency=0;
            for (String name:list){
            if (name.equals(each)){
                frequency++;
            }

            }if (frequency==1){
                System.out.println(each);
            }
            System.out.println("----------------------------");
            ArrayList<String> list1=new ArrayList<>();
            list1.addAll(Arrays.asList("Ohljan","sherzat","Gulistan","Gulistan","Ali","Ali","Ali","sherzat"));
            System.out.println(list1);
            for (String each1 : list1) {
                int frequency1=0;
                for (String name1: list1)
                    if (each1.equals(name1)){
                        frequency1++;
                    }if (frequency1==1){
                    System.out.println(each1);
                }

            }

        }








    }
}
/*
write a program that can return the first unique elements from an arraylist
do not use indexOf & lastIndexOf method
 */