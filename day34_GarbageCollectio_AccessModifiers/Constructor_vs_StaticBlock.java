package day34_GarbageCollectio_AccessModifiers;

public class Constructor_vs_StaticBlock {
    static{
        System.out.println("Static Block");
    }
    public Constructor_vs_StaticBlock(){// there is no object so will  not be executed, so need to creat an object
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new  Constructor_vs_StaticBlock();
        new  Constructor_vs_StaticBlock();
        new  Constructor_vs_StaticBlock();
        new  Constructor_vs_StaticBlock();
        new  Constructor_vs_StaticBlock();

    }

}
