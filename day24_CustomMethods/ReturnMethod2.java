package day24_CustomMethods;


public class ReturnMethod2 {
    public static void main(String[] args) {

    }
    public static void nameOfMonth(int number){
        String name="";
        if (number<1 || number>12){
            System.out.println("invalid");
            return;// exits nameof month method, remaining code fragments of the method never gets executed
        }
        if (number>=1 && number<=12){
            name=(number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April":(number==5)?"May"
                    :(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":
                    (number==10)?"October":(number==11)?"November":"December";
        }
        System.out.println("Name of the month = " + name);
    }
}