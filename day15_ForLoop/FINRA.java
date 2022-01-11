package day15_ForLoop;

public class FINRA {
    public static void main(String[] args) {
        /*
        print the number 1 to 100 ,number*3 && *5print "finra"

         */
  for (int i=1;i<=100;i++){
      if (i % 15==0){// 15 30 45 60 75 90
          System.out.print("FINRA");
      }else if (i % 3==0){ //3 6 9 12 15.....99
          System.out.print("FIN");}
      else if (i % 5==0){//5 10 15 20 25 30....100
          System.out.print("RA");}
  else{
          System.out.print(i+" ");
      }

  }

        }







    }







