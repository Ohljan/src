package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","David"));
        System.out.println(employees);
        employees.retainAll(Arrays.asList("Ahmed","David"));// will only keep these names and remove all the unmatched elements
        System.out.println(employees);
        System.out.println("----------------------------");
        String [] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
    ArrayList<String> list=new ArrayList<>(Arrays.asList(names));// converted to arrayslist
        System.out.println(list);
        list.removeIf(p->p.startsWith("M"));// p.charAt(0)=='M';
        System.out.println(list);
        String[] namesWithoutM=list.toArray(new String[0]);
        System.out.println(Arrays.toString (namesWithoutM));
    }
}
