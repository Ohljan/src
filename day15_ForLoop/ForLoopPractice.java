package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i=15; i<=45; i++){//i++ mean increasing each time by one
            System.out.print(i+" ");// everything here will be repeated
        }//here is print NOT println otherwise every number will be in a new line
        System.out.println();// to print the hello from the new line
        System.out.println("Hello ");
        System.out.println();
         for (int i=100; i>=50; i--){//decreasing 100 by 1 till 50
             System.out.print(i+" ");}// loop closed here so even if we use the i later again
        //will be fine
        // >= ;<=,>,< most used relation signs
        System.out.println();// to start a new line
        // print all the even number between 1-55;
        for (int i=1; i<=55;i++){// if condition should be given with the loop
         if (i % 2==0){
             System.out.print(i+" ");
         }
        }
        System.out.println("   ");
        for (int i=2;i<=54; i+=2){// mei ci jia 2
            System.out.print(i+" ");
        }






    }






}
