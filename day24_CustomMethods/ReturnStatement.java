package day24_CustomMethods;

public class ReturnStatement {
    public static void main(String[] args) {

    }
public static void nameOfDay ( int number ){
        String day="";
        if (number<1|| number>7){
            return;
        }
        if (number>=1 && number<=7){
            day=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday"
                    :(number==6)?"Saturday":"Sunday";
        }
        System.out.println("the name of the day is : " + day);

    }

}










