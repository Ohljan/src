package day07_Operators;

public class shortHandOperators {
    public static void main(String[] args) {
     // assignment : =
     int number=100;
        System.out.println("number="+number);//100
        number=200;// since there is not int before , so it considered as the same variable.
        // we can use the only variable"number" in the different case
        System.out.println("number="+number);// 200
        // it will  remember the last one which is the line 8 not the line 6
        String  word="Java Programming";
        System.out.println("word="+word);
        word="wooden spoon";// so here "=" means assigned the word again to wooden spoon
        System.out.println("word="+word);// print wooden spoon
        word="Cydeo";
        System.out.println("word="+word);// here it will print cydeo
// variable always remember the last assignement , if we do not reassine it , it will always print cydeo
        // the first time when we assigne the word , data type was string , so we can not assigne it as integer
        //addition assignment :
        int x=100;
        System.out.println("x="+x);
        System.out.println(x+200);
        x=x+200;
        //x=x+200 ; x+  =200;
        System.out.println("x="+x);
        String str="wooden";
        str +="spoon";
        System.out.println("str="+str);
        double num1=2.5;
        System.out.println("num1="+num1);
        num1 +=5.5;
        System.out.println("num1="+num1);
        double avaiblabeBalance=1000.50;
        //deposit 300$
        avaiblabeBalance+=300;
        System.out.println("avaibleBallance ="+avaiblabeBalance);
        avaiblabeBalance -=500;// 1300.50-500
        System.out.println("avaibleBallance="+avaiblabeBalance);

//withdrawing 200 $ , then deposting 400
        avaiblabeBalance-=200;
        avaiblabeBalance +=400;
        System.out.println("availableBalance = "+avaiblabeBalance);


        //mutiplication
        double salary=60000.50;
        System.out.println("salary = " +salary);
        salary*=2;// dengyu : salaray= salary *2
        System.out.println("saraly ="+salary);
        double doge=0.00000001;
        doge*=1000000;
        System.out.println("dodge="+doge);

//division:
        double num2=25000;
        num2/=2;
        System.out.println("num2 ="+num2);

 // remainder assignment . want
 double num3=100;
 num3%=3;
        System.out.println("num3 = " + num3);
        System.out.println();

        int amount=127; //cents
        int quaters=127/25;
        int cents=127%25;
        System.out.println("quaters = " + quaters);
        System.out.println("cents = " + cents);


        int cents2=127;
        cents2 %=25;// zhe shi 127 chuyi 25 de yushu

        int y =300;
         y%=16;
        System.out.println("y="+y);

        int balance=3500;
        //insurance fee :153$
        balance %=153;
        System.out.println("balance = " + balance);











    }













}
