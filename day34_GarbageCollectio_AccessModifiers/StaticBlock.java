package day34_GarbageCollectio_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main Method ");
    }
    static{//runs first before the main method and only runs once
        System.out.println("Static Block");
    }
    static{
        System.out.println("Static Block1");
    }
    static{
        System.out.println("Static Block2");
    }static{
        System.out.println("Static Block3");
    }
}
