package SelfStudy;

import java.util.Scanner;

public class qassesementScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] a=new int[size];
        int i=0;
        while(i<size){
            a[i++]=input.nextInt();

        }method8(a);

        double number=add(3.4);// 2.5
        number+=add("dual");//10{10,}
        number+=add(Integer.parseInt("100"));//{10,5}
        number+=add(11341l);
        number+=add(Float.parseFloat("50.8"));
        System.out.println(number);


        }
    //question 14   input: 5,7,3,8,20,14
    public static void method8(int []arr){
        for (int n:arr){
            if (n%4==0){
                continue;
            }
            System.out.println(n);
        }

    }


// quesiton 16 what is output
    public static int add(int n){
        return 5;
    }
    public static double add(double d){
        return 2.5;
    }public static long add(String s){
        return 10;
    }
}
