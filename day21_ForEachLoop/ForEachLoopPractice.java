package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String []words={"Jva Programing","Cydeo School","Wooden Spoon","Early Bird","Angry Bird"};
        for (String each:words){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
        // every char has a number so char + char=addition not concatenation
        // need to add "" to change it to string
        }







    }

}
