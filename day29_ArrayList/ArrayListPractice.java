package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        String[]countries={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};
        //conver array to arraylist:
        ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));
        System.out.println(list);
        System.out.println("--------------------------------------");
        list.removeIf(p->p.length()>=10);// length of the each element. size(): length of the arraylist//convert arraylist to array
        //converting arraylist to array
        countries=list.toArray(new String[0]);//can give any number here does not matter
        System.out.println(Arrays.toString(countries));
    }
}
