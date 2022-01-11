package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {//inside of main there is []means this is ARRAY
// create a variable that capable enough to contains five names

      String[] myGroup=new String[5];// same data type is mendatory
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";                          // System.out.println(myGroup);//will give a hashcode, worng way
        System.out.println(Arrays.toString(myGroup));//right way
        System.out.println("----------------");

        String[]days={"Monday", "Tuesday", "Wednesday", "Thursady","Friday","Saturday","Sunday"};
        //size assigned automatically here since we know how many data and what data we need to store
        System.out.println(Arrays.toString(days));
        int number=4;
        if (number<1 ||number>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


        System.out.println("-----------------");
String[]months={"January","February","March","April","May","June",
"July","August","September","October","November","December"};

        System.out.println(Arrays.toString(months));
        int num1=5;
        if (num1<1 || num1>12){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[num1-1]);

        System.out.println("----------------");


        for (int i = 0; i <months.length ; i++) {

            System.out.println(months[i]);
        }

        System.out.println("-----------------");
        for (int i = months.length-1; i >=0; i--) {
            System.out.println(months[i]);
        }










    }
}
