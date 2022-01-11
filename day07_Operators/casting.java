package day07_Operators;

public class casting {
    public static void main(String[] args) {
        float averageSCore=20.0F;
     byte num1=(byte)averageSCore;// explicit casting
        System.out.println("num1="+num1);

        short num2= (short) averageSCore;
     int num3= (int) averageSCore;
     long num4= (long) averageSCore;
     float num5=averageSCore;// no casting float to float
     double num6=averageSCore;
     long num7= (long) averageSCore;
        System.out.println("num2 ="+num2);
        System.out.println("num3 ="+num3);
        System.out.println("num4 =" +num4);
        System.out.println("num 5=" +num5);
        System.out.println("num 6=" +num6);
        System.out.println("num 7="+ num7);











    }












}
