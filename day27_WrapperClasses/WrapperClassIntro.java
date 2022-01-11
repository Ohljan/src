package day27_WrapperClasses;
public class WrapperClassIntro {
    public static void main(String[] args) {


        int num1 = 200;// convert this to objext: autoboxing
        Integer n1 = num1;// then this can be used in collection & map
        Integer integerValue = 100;
        long longValue = integerValue;
        System.out.println("----------------------");
        int num3=200;
        Integer num4=num3;//autoBoxing
        byte b1=25;
        Byte a1=b1;
      short a2=b1;
        int  a3=b1;
        long a4=b1;
        System.out.println("-------------");
        int num5=200;
        Integer num6=num5;
        System.out.println("----------");
        Integer z=900;
        Integer y=z;
        System.out.println("---------------");

        int[] numbers1={1,2,3,4,5};
        Integer[]numbers2={1,2,3,4,5};
    }
}
