package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        /*
           int num=1;
           list.remove(num);
        System.out.println(list);
         */
      Integer num=2000;//2000 does not exist in the element so will return false
      // list.remove(200);
        boolean r=list.remove(num);// removed successfully it will return true
        System.out.println(list);
        System.out.println(r);
        System.out.println(list.size());// size is 7 . want to clear all of them at once
        // call the clear()
        list.clear();
        System.out.println(list);// after clear() nothing left
        System.out.println("----------------");
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        int a =characters.indexOf('A');// index is 0
        int b=characters.lastIndexOf('A');// returns index 4
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------------");
      boolean r2=characters.contains('A');
      boolean r3=characters.contains('Z');
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("-----------------------");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2);// return false , since used "new"twice so created twice so they are different
        System.out.println(list1.equals(list2));// true
        System.out.println("------------------");
        boolean r4=list.isEmpty();
        System.out.println("r4 = " + r4);
        System.out.println("----------------");
        ArrayList<Integer> numbers=new ArrayList<>();
        // BULK OPERATION: collectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);

    }
}
