package day12_scanner;

import javax.lang.model.SourceVersion;
import javax.script.ScriptContext;
import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your full name: ");
         String fullName=input.nextLine();

        System.out.println("Enter your Building number:");
        String buildingNumber= input.next();
        input.nextLine();

        System.out.println("enter your street name:");
        String streetName= input.nextLine();

        System.out.println("enter your city:");
        String city= input.nextLine();
        System.out.println("enter your sate:");
        String state=input.next();
        input.nextLine();
        System.out.println("enter your zip code:");
        String zipCode= input.next();
        input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        
        input.close();






    }








}
