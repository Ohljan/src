package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));
        ArrayList<Integer>gradeA=new ArrayList<>(scores);
        gradeA.removeIf(p->!(p>=90&&p<=100));
        System.out.println("gradeA = " + gradeA);
        ArrayList<Integer>gradeB=new ArrayList<>(scores);
        gradeB.removeIf(p->!(p>=80&&p<90));
        System.out.println("gradeB = " + gradeB);
        ArrayList<Integer>gradeC=new ArrayList<>(scores);
        gradeC.removeIf(p->!(p>=70&&p<80));
        System.out.println("gradeC = " + gradeC);
        ArrayList<Integer>gradeD=new ArrayList<>(scores);
        gradeD.removeIf(p->!(p>=60&&p<70));
        System.out.println("gradeD = " + gradeD);
        ArrayList<Integer>gradeF=new ArrayList<>(scores);
       // gradeF.removeIf(p->!(p<60));
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println("gradeF = " + gradeF);
        System.out.println("Total number of A: "+gradeA.size());
        System.out.println("Total number of B: "+gradeB.size());
        System.out.println("Total number of C: "+gradeC.size());
        System.out.println("Total number of D: "+gradeD.size());
        System.out.println("Total number of F: "+gradeF.size());






        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>();
        ArrayList<Integer> gradeOfF = new ArrayList<>();






    }
}
