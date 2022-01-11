package day11_Swatch_Scanner;

public class SelfStudyOperator {
    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '$';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
        if (valid){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                case'/':
                    System.out.println(n1/n2);
                    break;
            }

        }else
        {
            System.out.println("Invalid entry ");
        }

    }
}