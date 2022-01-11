package SelfStudy;

import java.util.ArrayList;

public class day02_practice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(0,50);
        System.out.println(numbers.set(0,800));
    //   numbers.remove(2);
        numbers1.add(100);
        numbers1.add(200);
        numbers1.add(300);
        numbers1.add(400);
        numbers1.add(500);
        numbers1.add(600);
        numbers1.add(700);
   //  numbers.clear();

    System.out.println(numbers.size());
       System.out.println(numbers.get(1));
       numbers.indexOf(200);
        numbers.lastIndexOf(500);
        boolean r1=numbers.contains(500);
       System.out.println(r1);
       boolean r2= numbers.equals(numbers1);
        System.out.println("two arraylist is equal or no ? " +r2);

        int max= numbers.get(1);
        int min=numbers.get(2);
        double average=0;
        int sum=0;
        for (Integer number : numbers) {
            if (number>max){
             number=max;
            }
            if (number<min){
              number=min;
            }
          sum+= number;
            average=sum/numbers.size();
        }
        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);
        System.out.println("average number is "+average);
        int max1=numbers.get(1);
        int min1= numbers.get(0);
        int sum1=0;
    double average1=0;
        for (Integer integer : numbers1) {
            if (integer>max1){
                integer=max1;
            }
            if (integer<min){
                integer=min1;
            }
            sum+=integer;
            average1=sum/numbers.size();

        }
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);
        System.out.println(average1);
    }
}
