package SelfStudy;

import java.awt.font.FontRenderContext;

public class day1_practice {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("--------------------------------");
       String name="ohljan";
       char gender='F';
       String dateOfBirth="August 17th 1982";
       String adress="262 lafayette longueuil";
       long phoneNumber=5146529294l;
        int  SSN=315894991;

        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *\n* * * * * *\n* * * * * * *\n* * * * * * * *");

        System.out.println("     ˆ\n    / \\\n   /   \\\n  /     \\\n /        \\\n----------- ");
        System.out.println("----------------------");
        int a =2;
        int b=3;
        System.out.println(a++ - ++b- b++ + ++a -++b);
        System.out.println("--------------------------------");
        for (int i =1;i<=30;i++){
            System.out.println(i);
            if (i%15==0){
                System.out.print("FINRA ");
            }else if (i%3==0){
                System.out.print("FIN  ");
            }else if (i%5==0){
                System.out.print("RA  ");
            }else{
                System.out.print(i+" ");
            }String Fin="";
            for (int j=0; j<=30; j+=3){
                Fin+=j+" ";
            }
            System.out.println(Fin+" ");
            String RA="";
            for (int k=0; k<=30; k+=5){
                RA+=k+" ";
            }
            System.out.println("RA"+RA);
            String FINRA="";
            for (int l=0;l<=30; l+=15){
                FINRA+=l+" ";
            }
            System.out.println("FINRA"+FINRA);
        }



    }
}
