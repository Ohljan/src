package day35_Encapsulation.Encapsulation;
import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
      //  String[] candyList={"Nerds Candy","Jawbreakers candy","salt water taffy","jolly ranchers candy","smarties candy"};
        ArrayList<Candy> candies=new ArrayList<>();
        Candy candy1=new Candy("Nerds Candy",5,1.3,true);
        Candy candy2=new Candy("Jawbreakers Candy",3,2.3,false);
        Candy candy3=new Candy("salt water taffy",4,3.9,true);
        Candy candy4=new Candy("jolly rancher candy",19,0.8,false);
        Candy candy5=new Candy("smarites",12,1.8,true);
      candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        System.out.println(candies);
        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : $" + candy.getPrice());
        }

        }

    }


/*
  1.2 Create a class named CandyFactory
        Create an ArrayList of candies
       Add five objects of candies
    use for each loop to print the brand and price of each candy

 */
