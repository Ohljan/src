package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
     // all relational operators return boolean(true or false)
    // also the logical operators return to boolean too
        // could be number or string ;
        // >, >=; <; <=
        boolean result1=200 > 40;
        System.out.println("result1 = " + result1);
        boolean result2=300>=150;// answer is true since 300 is greater than 150
        System.out.println("result2 = " + result2);
        boolean result3=100>=100;
        boolean result4=300>=500;
        // credit score of 70
        int creditScore=745;
        boolean isEligibleForloan=creditScore>=720;//if the credit score is 720 or greater , then its eligible for the loan
        // if we use only > it will exclude 720
        boolean result5=100<120;// answer will be true
        System.out.println("result5 = " + result5);

int score=75;
boolean hasFailed=score<=59;
        System.out.println("hasFailed = " + hasFailed);
         boolean result7=45<=60;
        System.out.println("result7 = " + result7);

        //equal: "==" is for equal ; signle "=" is for assigned can use it for string too
        // not equal "!="is for  not equal
        int x =100;
        int y=200;
        boolean equal=x==y;
        System.out.println("equal = " + equal);
        boolean result8="Muhatar"=="Good Guy";
        System.out.println("result8 = " + result8);
        boolean result9='A'=='a';//check on the table the two letter stand for different numbers
        System.out.println("result9 = " + result9);
        boolean result10="Java"=="Java";// true
        boolean result11="java"=="Java";// false, because of lower case and upper case
        boolean result12="java"=="java    "; // false , since second one has more space

        // != NOT EQUAL
        boolean result13=100!=200;// true
        System.out.println("result13 = " + result13);

        boolean result14="Java"!="break";// true, since they are not EQUAL !=
        boolean result15=300!=300;// false since they are equal== so the result is false
        System.out.println("result15 = " + result15);















    }














}
