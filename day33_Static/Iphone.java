package day33_Static;

public class Iphone {
    public static String brand="Appel";// since it only one brand in this class so we assigne it right away
    public String model;
    public  double price;// every single  iphone has it own price so have to declare as instance
    public static  String OS="iOS";// for every single iphone 's operating system is IOS so can use static
    public String color;
    public  String size;
    public static String madeIn="China";
    public static boolean hasBatery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;
    public static void  printOperatingSystem(){
        System.out.println(OS);
    }
  //  public static void printModelAndPrice(){
  //      System.out.println(model+":"+price);
  //  }
    public void printModelAndPrice1(){
        System.out.println(model+":"+price);
        System.out.println(OS);
    }



}
