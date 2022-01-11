package day08_IfStatement;


public class LogicalOperators {
    public static void main(String[] args) {
     String name="Steven";
        int age=18;
     String citizen="USA";

     Boolean IsEligible=age>=18 && citizen=="USA";
        System.out.println(name + " is eligible to vote:"+IsEligible);
     // 19>=18 && "UK=="USA"
// true && false===false


        String name2="Josh";
        int creditScore=720;
        int age2=23;
        int income=40000;

        boolean isEligible=creditScore>=700 && age2>=21 && income>=60000 ;
        System.out.println(name2+" is eligible for loan : "+isEligible);

 String name3="shay";
 char gender='F';
 int age3=21;
 boolean isEligible3=age3>=18 && (gender=='M' ||gender=='F');
        System.out.println(name3+"is eligible to register : "+isEligible3);

        String name4="James";
        String countryOfBirth="USA";
        Boolean marriedToUSCitizen=false;
        boolean isEligible4=countryOfBirth=="USA"||marriedToUSCitizen==true;
        System.out.println(name4+ "is eligible to apply for US citizenship: "+ isEligible4);

        String  student="Brenna";
        double gpa=2.5;
        int familyIncome=100000;
        boolean isEligible5=gpa>=3.5 || familyIncome<=60000;
        System.out.println(student+"is eligible for schoolship:"+isEligible5);

        boolean result2=true;
        System.out.println("results="+result2);
        boolean result3=!result2;
        System.out.println("result3="+result3);

        int score=85;
        boolean passed=score>=60;
        boolean failed=!passed;
        System.out.println("passed = "+passed);
        System.out.println("fail ="+failed);




    }







}
