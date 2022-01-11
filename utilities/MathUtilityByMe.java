package utilities;

public class MathUtilityByMe {

    //1.calculate result for two integer numbers
    public static int calculateTwoIntegers(int num1, int num2, char operator) {
int result=0;
if (operator=='+'){
    result=num1+num2;
}else if (operator=='-'){
    result=num1-num2;
}else if (operator=='*'){
    result=num1*num2;
}else if (operator=='/'){
    result=num1/num2;
}else {
    System.out.println("Invaide operator");
}
return result;
    }
    //2. calculate result for two decimal numbers
    public static double calculateTwoDecimals(double num1, double num2, char operator) {
    double result=0;
    if (operator=='+'){
        result=num1+num2;
    }else if (operator=='-'){
        result=num1-num2;
    }else if (operator=='*'){
        result=num1*num2;
    }else if (operator=='/'){
        result=num1/num2;
    }else {
        System.out.println("Invaide operator");
    }
    return result;
}
   //3. check if the number is odd or Even number
    public static int oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is Even number");
        }else {
            System.out.println(number+" is Odd number");
        }return oddOrEven(number);
    }
   //4.check out the max number between two  integers
    public static int maxNumber(int num1,int num2){
        if (num1>num2) {
            System.out.println("max number is: "+num1);
        }else{
            System.out.println("max number is: "+num2);
        }
        return maxNumber(num1,num2);
    }
    //5.check out the max number between two decimals
    public static double maxNumber(double num1,double num2){
        if (num1>num2) {
            System.out.println("max number is: "+num1);
        }else{
            System.out.println("max number is: "+num2);
        }
        return maxNumber(num1,num2);
    }
    //7.check out the minimum number between two integers
    public static int minNumber(int num1,int num2){
        if (num1<num2) {
            System.out.println("min number is: "+num1);
        }else{
            System.out.println("min number is: "+num2);
        }
        return minNumber(num1,num2);
    }
    //8.check out the minimum number between two decimals
    public static int minNumber(double num1,double num2){
        if (num1<num2) {
            System.out.println("min number is: "+num1);
        }else{
            System.out.println("min number is: "+num2);
        }
        return minNumber(num1,num2);
    }
   // 9 check out the square of integer number
    public static int squareOfNumber(int num){
        int squareOfNumber=num*num;
        return squareOfNumber(num);
    }
   // 10. check out the square of decimal number
    public static double squareOfNumber(double num){
        double squareOfNumber=num*num;
        return squareOfNumber(num);
    }
// 11. check out the cube of integer number
    public static int cubeOfNumber(int num){
        int cubeOfNumber=num*num*num;
        return cubeOfNumber(num);
    }
    // 11. check out the cube of decimal number
    public static double cubeOfNumber(double num){
        double cubeOfNumber=num*num*num;
        return cubeOfNumber(num);
    }
}
