package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("-------------Push upstart--------");

        for (int i = 1; i <=30; i++) {
            System.out.println("\rPush up "+i);
            sleep(1.5);
        }
        System.out.println("--------Push ups completed");
        System.out.println("---------Pull uup started-------------------");
        for (int i = 1; i <=20; i++) {
            System.out.println("\rPull up "+i);
           sleep(1.5);
        }
        System.out.println("--------------Pull Up completed");


    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
