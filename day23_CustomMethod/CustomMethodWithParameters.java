package day23_CustomMethod;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        oddOrEven(99);//need to put a integer number inside of parameter
        System.out.println("-----------");
        ageOfPerson(1982);
    }

public static void oddOrEven(int number) {
    if (number%2==0){
        System.out.println(number+"  is even number");
    }
    else {
        System.out.println(number+" is odd number");
    }
}
public static void ageOfPerson (int birthYear){
   int age=2021-birthYear;
    System.out.println("your age is :"+age);
}

public static void printNumber(int x, int y){
        
}
}
