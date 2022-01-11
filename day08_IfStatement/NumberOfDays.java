package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
    int number=5;
    boolean has28days=number==2;
    boolean has30Days=number==4||number==6||number==9||number==11;
    boolean has31Days=!has28days && !has30Days;
    if(has28days){
        System.out.println(" is 28 days");}
    if(has30Days){
        System.out.println(" is 30 days");}
    if (has31Days){
        System.out.println("is 31 days");
    }

    }















    }
















