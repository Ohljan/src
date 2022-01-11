package day18_NestedLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
       for (int j= 1; j <10 ; j++) {
            for (int i = 0; i <j; i++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
        System.out.println("-------------------");
        for (int i = 1; i <=7 ; i++) {//height
            for (int j = 1; j <=14; j++) {//length
                System.out.print("* ");
            }
            System.out.println();
        }







    }
}
