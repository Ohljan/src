package day34_GarbageCollectio_AccessModifiers;
import  static day34_GarbageCollectio_AccessModifiers.Circle.*;
import static  utilities. MathUtility.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);
        System.out.println("------------------");
      // find the sum of 10, 20 , all the method can be called directly, without using the class names
    int r1=  sum(10,20);
      // find the sum of 100, 200
      int r2= sum(100,200);
      int r3=subtract(100,40);
    int r4=multiplication(24,5);
     int r5=max(1000,2000);
    }
}
