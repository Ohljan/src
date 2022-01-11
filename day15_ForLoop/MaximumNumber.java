package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-2147483648;//this smallest integer
        // any user entered number will be greater than this number
        for (int i =0; i <5 ; i++) {//5 means five times that is not mean number less 5
            System.out.println("Enter a number ");
            int num= input.nextInt();
            if(num>max){// if the user entered number is greater than current maximum number
                      max=num;}
            // continously assigne the num to max number
            //do not put for statement into another for statement




        }
        System.out.println("max = " + max);
        
        
        
        

        
        
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
