package day27_WrapperClasses;

import javax.lang.model.SourceVersion;
import java.util.concurrent.Callable;

public class WrapperClassMethod{
    public static void main(String[] args) {
        String str="123";
       int num= Integer.parseInt(str);// returns int;
        System.out.println(num+1);// so will be 123+1=124
        System.out.println(str+1);// will returns  1231;
   String str2="10.5";
   double num2=Double.parseDouble(str2);
        System.out.println(num2+1);//11.5
        System.out.println(str2+1);//10.51
       int max= Integer.MAX_VALUE; // to get the max number from the integer number
     int min=Integer.MIN_VALUE;// to get the minimum number from the integers
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);
        String s1="true";// if we put false it will print false . it s something else it will be false by default
       boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);
        String s2="123";
       Integer x= Integer.valueOf(s2);
       int y=Integer.valueOf(s2);//unBoxing
        System.out.println(x);
        System.out.println(y);
        String s3="1.5";
        double z=Double.valueOf(s3);
        System.out.println(z);
        //isDigit()
        char ch1='0';
        boolean r2=Character.isDigit(ch1);// if it s between 0--9 till return true
        System.out.println(r2);// it s not between 0 to 9 till return false
      char ch2='a';
      boolean r3=Character.isLetter(ch2);
        System.out.println(r3);
        //special char
      boolean r4=!Character.isLetterOrDigit(ch1);
      //uppercase
       boolean r5=Character.isUpperCase(ch1);
       //lowercase
        boolean r6=Character.isLowerCase(ch1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println("----------");
        String s="ab1cde2ef3hi4";
        int sum=0;
        for(char each:s.toCharArray()){
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
        };





