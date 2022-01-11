package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
    String firstname="cyDEo",
            lastName="SCHOOL";
   // firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase(Locale.ROOT);
       // System.out.println(firstname);

firstname=(""+firstname.charAt(0)).toUpperCase(Locale.ROOT)+firstname.substring(1).toLowerCase(Locale.ROOT);
// change the data type from char to string
lastName=lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1).toLowerCase(Locale.ROOT);

       String fullName=firstname+" "+lastName;
        System.out.println(fullName);
        //the format we prgarammed here should be good for any word user provides;
        







    }
}
