package day15_ForLoop;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        //print: A-Z; a-z; Z-A;z-a
   for (char letter=65;letter<=90;letter++){// = char letter='A'
       System.out.print(letter+"  ");
   }//A-Z
        System.out.println();
for(char letter=97;letter<=122;letter++){
    System.out.print(letter+" ");
}//a-z
        System.out.println();
for (char letter=90;letter>=65;letter--)
{
    System.out.print(letter+" ");
}// da xie A-A
        System.out.println();
for (char letter=122;letter>=97;letter--){
    System.out.print(letter+" ");
}
        System.out.println();
for(char i = 1; i<=40000; i++){
    System.out.print(i+" ");
}



    }










}
