package day24_CustomMethods;
import java.util.Locale;
public class BreakfastTask {
    public static void main(String[] args) {
       initials("Ohljan","Zunong");
       System.out.println("--------------------------");
       domainOfEmail("zununohljan@gmail.com");
     String[] emails={"josh@gmail.com","jim@yahoo.com","eliminur@cydeo.com","gulsn@gmail.com"};
        for (String email : emails) {
            domainOfEmail(email);// this customMethod we created will be executed 4 emails
         nameOfMonth(9);
         nameOfday(6);
        }
    }
    // create a method that can display the initials of the person , inittials()
    public static void initials(String firstName, String lastName){
        String initials=firstName.charAt(0)+"."+lastName.charAt(0);
        initials=initials.toUpperCase(Locale.ROOT);
        System.out.println("initials = " + initials);
    }
// creat a method that can display the domain of the email
    public static void domainOfEmail(String email){//cydeo@gmail.com
        String domain=email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
        System.out.println("domain of this email adress is:  " + domain);
    }
public static void nameOfMonth(int number){
        String name="";
        if (number>=1 && number<=12){
            name=(number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April":(number==5)?"May"
                    :(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":
                    (number==10)?"October":(number==11)?"November":(number==12)?"December":"Invalid";
        }
    System.out.println("Name of the month = " + name);
}
public  static void nameOfday(int number){
        String day="";
        if (number>=1 && number<=7){
            day=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday"
                    :(number==6)?"Saturday":(number==7)?"Sunday":"Invalid number";
        }
    System.out.println("the name of the day is : " + day);
}


}
