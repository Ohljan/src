package day25_CustomMethod_Overloading;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int sum= sumOf2Number(10,20);// here we can use it directly, can resigne or print it directly
        System.out.println(sum);
        int sum2=sumOf3Numbers(10,20,30);
        System.out.println(sum2);
       int sum3=sumOf4Numbers(10,20,30,40);
        System.out.println(sum3);



    }
public static int sumOf2Number(int num1, int num2){
        return num1+num2;
}
public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
}
public static int sumOf4Numbers(int num1,int num2, int num3, int num4){
        return num1+num2+num3+num4;
}

}
