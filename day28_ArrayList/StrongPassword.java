package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {
       String password="OHLjan18!";
       boolean r1=password.length()>=8 && !password.contains(" ");
       boolean r2=false;// has upper case
       boolean r3=false;// has lower case
       boolean r4=false;//has special character
       boolean r5=false;// has digit
        char[] chars=password.toCharArray();// change the string to an array so can use the each loop
        for (char each : chars) {// each loop can check each element one by one
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else{// special char
                r4=true;
            }/*if (r2 && r3 && r4 && r5){
                break; */  // this is the case that the first 4 character already has upper lower case digit and spceical character

        }
      boolean isStrongPassword=r1 && r2 && r3 && r4 && r5;  // all the boolean should be true then will be strong password
        System.out.println("isStrongPassword = " + isStrongPassword);
    }
public static  boolean isStrongPassword(String password){
    boolean r1=password.length()>=8 && !password.contains(" ");
    boolean r2=false;// has upper case
    boolean r3=false;// has lower case
    boolean r4=false;//has special character
    boolean r5=false;// has digit
    char[] chars=password.toCharArray();// change the string to an array so can use the each loop
    for (char each : chars) {// each loop can check each element one by one
        if (Character.isUpperCase(each)){
            r2=true;
        }else if (Character.isLowerCase(each)){
            r3=true;
        }else if (Character.isDigit(each)){
            r5=true;
        }else{// special char
            r4=true;
        }
    }
    boolean isStrongPassword=r1 && r2 && r3 && r4 && r5;  // all the boolean should be true then will be strong password
   return true;
}
}






// alse use the for loop without change it to array ,
/*
1. MUST 8 characters long and no space;
2. at lease contain one upper case and one lower case letter .
3.contain one special character
4.at lease contain a didigit
 */