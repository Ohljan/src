package day09_Statements;

public class PosNegZero {
    public static void main(String[] args) {
   int n=100;
   boolean positive=n>0;
   boolean negative=n<0;
   boolean zero=n==0;
   if (positive){
        System.out.println("Positive");}
   else if(negative){
        System.out.println("Negative");}
   else{
        System.out.println("Zero");}
//do not need the condition for the else,  else is last block
// this statement will be finished if we use the else.
// there are ONLY ONE IF & ONLY ONE ELSE & Several else if
/*
single if : only one condition;
if...else: when there are two condition  NEVER USE IT IF there are 3 or more
multi-branch : where there are three or more conditions
 */








    }







}
