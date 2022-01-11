package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
       /* System.out.println(true==!false);//true
        System.out.println(!true!=false);//false
        System.out.println(!false==true);//true
        System.out.println(!!false);//false   */
        int score=85;//0 to 100

        boolean a=score>=90 && score<=100;
        boolean b=score>=80 && !a;//score>=89score<=89;
        boolean c=score>=70 && score<=79;
        //boolean c=!a && !b && score>=70
        boolean d=!a && !b && !c && score>=60;
        boolean f= score>=0 && score<=59;
        boolean g=!a &&!b && !c && !d && !f;

        if(a){// if the student made  an A
        System.out.println("excellent");}
if (b){
        System.out.println("Great");}
if(c){
        System.out.println("Good");}
if (d){
        System.out.println("Passed");}

if (f){
        System.out.println("failed");}






    }











}
