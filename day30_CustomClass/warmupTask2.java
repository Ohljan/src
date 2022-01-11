package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmupTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list);
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);
        System.out.println("following part is the task 2 ::::::::");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list1);
        int size=list1.size();//orignal size
        list1.removeAll(Arrays.asList(0));
        System.out.println(list1);
         int newSize=list1.size();// new size . so "0"=size-newsize
         int totalNumberOfZero=size-newSize;
        System.out.println("totalNumberOfZero = " + totalNumberOfZero);
        for (int i = 0; i <totalNumberOfZero ; i++) {
            list1.add(0);
        }
        System.out.println(list1);
        System.out.println("task 2 in different way:");
        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer>result=new ArrayList<>();
        for (Integer each : list2) {
            if(each != 0){// first add all the !=0 numbers to result
                result.add(each);
            }
        }

        for (Integer each : list2) {// secondly add the all the "0 " to the result
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result);




    }
        }


/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
8*/


