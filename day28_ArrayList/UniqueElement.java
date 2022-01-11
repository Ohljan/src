package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");//index 0
        list.add("Java");//index 1
        list.add("Java");//index 2
        list.add("Python");//index 3
        list.add("C#");//index 4
        list.add("C#");//index 5
        list.add("C#");//index 6
        list.add("Ruby");//index 7
        list.add("C++");//index 8
        list.add("C++");//index 9
        System.out.println(list);
        ArrayList<String> unique=new ArrayList<>();
        for (String each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);// which ever which is unique will add to unique
            }//add means+ can not use + here
        }
        System.out.println("unique = " + unique);
    }
}
