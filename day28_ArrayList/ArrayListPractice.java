package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);// i: is the index number .list.get==>return the specific element in the array list then *2
        }
        System.out.println(list);
        System.out.println("--------");
        ArrayList<String> employee=new ArrayList<>();
        employee.add("Suat");
        employee.add("Aygun");
        employee.add("Olga");
        employee.add("Neira");
        employee.add("Ali");
        employee.add("Hulya");
        employee.add("Kaloyan");
        System.out.println(employee);
        employee.remove(0);// remove the element at index 0
        System.out.println(employee);
        employee.remove(0);
        System.out.println(employee);
        employee.remove(0);
        System.out.println(employee);
        employee.remove(1);
        System.out.println(employee);
        employee.remove(employee.size()-1);// remove the last index number . size()-1
    boolean r1=employee.remove("Hulya");
        System.out.println(employee);
        boolean r2=employee.remove("Neira");
        System.out.println(employee);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);



    }
}
