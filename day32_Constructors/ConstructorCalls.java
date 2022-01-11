package day32_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a ){
        this();// this is the way to call the first constructor not by name
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls object1=new ConstructorCalls();
        System.out.println("-------------------------------------");
        ConstructorCalls object2=new ConstructorCalls(10);
        System.out.println("--------------------------");
        ConstructorCalls object3=new ConstructorCalls("Java");
    }

}
