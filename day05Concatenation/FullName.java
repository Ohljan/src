package day05Concatenation;

public class FullName {
    public static void main(String[] args) {

   String firstName="Daniel";
   String lastName="Smith";
   int age=39;
   String jobTitle="SDET";
   String companyName="Appel Inc";
   String fullName=firstName+ "  " +lastName;
   double salary=100000.58;
        System.out.println(fullName);
//full name of the person is ______
        System.out.println("full name of the person is  "+ fullName);
// ____ is ____ years old
        System.out.println(fullName+" is "+age+" years old.");
// FullName is JobTitle + work at +companyName, and FullName's salray is
        System.out.println(fullName+" is "+ jobTitle+
                " work at "+companyName+" and "+fullName+" 's salary is $"+  salary);


    }









}
