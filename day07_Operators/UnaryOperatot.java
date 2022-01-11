package day07_Operators;

import org.w3c.dom.ls.LSOutput;

public class UnaryOperatot {
    public static void main(String[] args) {
        int num1=25;
        int num2=-25;
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        int a=5;
        ++a;
        System.out.println(a);
        int b=100;
        System.out.println(++b);// pre increment: increase the value by 1 right away
        --b;
        System.out.println(b);
        int c=100;
        System.out.println(c++);
        //post increment : first it pass the current value then increase  the value by 1

        System.out.println(c);// 101
        int x=200;
        System.out.println(--x);//pre decrement =199
        int z=45;
        System.out.println(++z); //46  z=46
        System.out.println(z++);  //first is  46 then increase by 1 then z  become 47
        System.out.println(z); //47
        int q=30;
        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q);//28






























    }








}





























