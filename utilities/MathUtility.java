package utilities;

public class MathUtility {
    //1. sum of two integer numbers
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    //2. sum of two decimal numbers
    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    //3. subtract  two integer numbers
    public static int subtract(int num1, int num2){
        return  num1 - num2;
    }

    //4. subtract  two decimal numbers
    public static double subtract(double num1, double num2){
        return  num1 - num2;
    }

    //5. multiply  two integer numbers
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

 //6. multiply  two decimal numbers
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    //7. devide  two decimal numbers
    public static double division(double num1, double num2){
        return  num1/ num2;
    }

//8 find out the odd number
    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
    }

//9. find out the even number
    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }

//10.find out the max number between 2  integer numbers
    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }

//11. find out the max number between 2 decimal numbers
    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }

//12.find out the minimum number between 2  integer numbers
    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }

    //13.find out the minimum number between 2  decimal numbers
    public static double min(double num1, double num2){
        return (num1<num2) ? num1 : num2;
    }

// 14. find out the square of a integer number
    public static int square(int num){
        return num * num;
    }

    // 15. find out the square of a decimal number
    public static double square(double num){
        return num * num;
    }

//16. find out the cube of a integer number
    public static int cube(int num){
        return num * num * num;
    }

    //17. find out the cube of a decimal number
    public static double cube(double num){
        return num * num * num;
    }




}
