package day28_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;

public class duplicated {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        System.out.println(list);
        int count=0;
int duplicatedNum=0;
        for (Integer each : list) {

          if(each==list.get(each)){
             count++;
          }if (count==2){
              duplicatedNum=each;
            }
        }
        System.out.println("duplicatedNum = " + duplicatedNum);
    }
/*

  for (int each : array) {
            if (each == element) {
                count++;
 */
    }

