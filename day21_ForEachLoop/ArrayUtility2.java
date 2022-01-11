package day21_ForEachLoop;



import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {
        String [] students={"Elif","Sinem","Cihan","David","James","Aaron","Daniel"};
String []earlyBird= Arrays.copyOf(students,3);// the first 3 names been copied
        System.out.println(Arrays.toString(earlyBird));

int[]numbers={1,2,3,4,5,6,7,8,9,10};
numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------");
char[]ch1={'A','B','C','D','E','F','G','H','I'};
char[]ch2=Arrays.copyOfRange(ch1,2,7);

        System.out.println(Arrays.toString(ch2));
        System.out.println("--------------");
    int[]scores={10,20,30,40,50,60,70,80,90,100};
    int[] result=Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));




    }
}
