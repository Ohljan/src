package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
       int[]number={10,20,30,40,50,60,70};
       // for this for loop have acccess to the index number
        for (int i = 0; i < number.length; i++) {//i: index of the array
           int eachElement=number[i];
            System.out.println(eachElement);
        }
        System.out.println("-------------------------");
        for (int each:number) {         // data type should be same in the array
            System.out.print(each+" ");
        }// the order and times are fixed can not change it , same with the array we gave before







    }
}
