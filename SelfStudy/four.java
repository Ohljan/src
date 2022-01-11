package SelfStudy;

public class four {
    public static void main(String[] args) {
        method3(50);
        int result=method4('z',"zebra");
            System.out.println("result");
        System.out.println(method6("mark"));
        String str=method7("on the weekend",20);
        System.out.println(str);
        }

    public static String method3(int num){
        if (num<0){
            return "less then 0";
        }else if (num<50){
            return "Less than 50";
        }else if (num<100){
            return "Less than 100";
        }else{
            return "other";
        }

    }
    public static int method4(char c, String s){
        if (s.contains(""+c)){
            return 1;
        }else{
            return 0;
        }
    }
    //question 12
    public static int[] method6(String str){
        int [] arr=new int[str.length()];
        int n=10;
        for (int i=0;i<arr.length;i++){
            if (n==20|| n==50||n==70){
                continue;
            }arr[i]=n;
            n*=10;
        }return arr;
    }
    // question 13
    public static String method7(String str, int s){
        str=str.substring(6);
        if (s<10){
            str=str.substring(8);
        }else{
            if (str.length()>s){
                str="weekday";
            }else if(s>10|| s==-10){
                str=str.substring(5);
            }
        }return str;
    }
}
