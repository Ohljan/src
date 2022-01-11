package day29_ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {


    ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
        String r1=employees.remove(1);
        boolean r4=employees.remove("Ali");
        System.out.println(r4);
        System.out.println(r1);

        ArrayList<Integer> numbers = new ArrayList<>();
       numbers.addAll(Arrays.asList(100,200,300,400,500));
        System.out.println(numbers);
        int r2=numbers.remove(1);
        boolean r3=numbers.remove("400");
        System.out.println(r2);
        System.out.println(r3);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('A','B','C','C','D','D'));
        System.out.println(letters);
        Character r5=letters.remove(0);
        Boolean  r6=letters.remove("C");
        System.out.println();


}
}