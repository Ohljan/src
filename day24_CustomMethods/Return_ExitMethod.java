package day24_CustomMethods;

public class Return_ExitMethod {
    public static void main(String[] args) {
        // creat a function that can calculate the grade
        String str1=grade(96);
        if (str1.equalsIgnoreCase("a")){
            System.out.println("Execellent"); }else if (str1.equalsIgnoreCase("b")){
            System.out.println("Great");
        }else if (str1.equalsIgnoreCase("c")){
            System.out.println("Good");
        }else if (str1.equalsIgnoreCase("D")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
public static String grade(int score){// after changed the "void"to a data type here is "string" it can be used even outside of package
        String result="";
        if (score<0|| score>100){
            result="Invalid";
        }else{//valid
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
        return result;
}

}
