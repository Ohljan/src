package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);//autoboxing, index :0
        numbers.add(20);//index 1
        numbers.add(30);// index 2
        numbers.add(40);// index 3
        numbers.add(50);  // index 4
        numbers.add(2,25);// 25 will be index  2 , original index 2 will go to 3
        numbers.add(5,45);// 45 will  be index 5; the reset index will shift to right
        System.out.println(numbers);
        System.out.println(numbers.size());// get the total length of array list
        int lastIndex=numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        int num=numbers.get(3);// int or Integer has no difference
        System.out.println("num = " + num);
        System.out.println("------------------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));// it will get each number of the array list
        }
        System.out.println("----------------------");
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript");// Index 2 is JAVA  WILL BE replace by javascript
        list.set(3,"C++");// index 3 is "Java"so it will replaced by "C++"
        System.out.println(list);


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);


        System.out.println(employees);

        employees.remove( employees.size() -1 );

        System.out.println(employees);

        employees.remove("Hulya");//remove element by object
        // as
        System.out.println(employees);


        boolean r = employees.remove("Neira");

        System.out.println(employees);


        System.out.println("r = " + r);

    }
}
