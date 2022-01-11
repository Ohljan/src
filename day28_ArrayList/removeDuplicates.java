package day28_ArrayList;

import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        System.out.println(list);
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer each : list) {
            if (result.contains(each)){//if the result already has the each will skip it
                continue;
            }
           result.add(each);
        }
        System.out.println(result);
    }
}
