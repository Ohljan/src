package day17_While_DoWhile;


public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {
            if (i=='C'){
               continue;
            }
            System.out.println(i);

        }
        System.out.println("------------");
        for (int i = 0; i <=10 ; i++) {
            if (i%2!=0){
                continue;//skip the odd number so the result is even number
            }
            System.out.println(i);// even number

        }

        System.out.println("-------------");
        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
                continue;// skip the even number
            }
            System.out.println(i);//odd number
        }




    }
}
