package day44_Abstraction.animalTask;

public interface Playable {
   boolean isFriendly=true;// it will be static by default
    public static void method1(){
        System.out.println(isFriendly);// this is only to prouve isFridendly is static variable
    }
    void play();//abstract by default
}
