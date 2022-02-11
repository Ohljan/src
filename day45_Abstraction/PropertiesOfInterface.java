package day45_Abstraction;

public interface PropertiesOfInterface {
    int a=100 ;// static & final by default
    static int b=200; // final  by default
 /*   public PropertiesOfInterface(int a){
        this .a=a;
    } interface can not have constructor , since constructor to creat un object*/
    /*static {

        b=100; ===> can not have static block
    }*/
   /* public void method1(){
        System.out.println("Instance method ");
    }  */
    public static void method2(){
        System.out.println("static method ");
    }
    public abstract void method3();
    public default void  drink (){ // since all the animals drink water so we can give the body here , do not need to be abstract
        System.out.println("default method");
    }
    public static void main (String[] args){
        new Test().method4();
    }
}
