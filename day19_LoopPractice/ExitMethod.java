package day19_LoopPractice;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
          if (i==3){
             // break; terminates the loop
              //continue;
              System.exit(0);// terminates the program , inside or outside it exits everything
          }
            System.out.println(i);
        }
        System.out.println("wooden spoon");//since the break and continue are inside of loop so it will not change anying ourside of loop
    }//but with exit code , it will not print anything after it , will end all
}
