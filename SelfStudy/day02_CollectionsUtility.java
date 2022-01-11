package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class day02_CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,7,7,8,9));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        Collections.swap(numbers,4,1);
      int max=  Collections.max(numbers);
      int min=Collections.min(numbers);
      Collections.replaceAll(numbers,7,21);
        System.out.println(numbers);
        int frequencyOf=Collections.frequency(numbers,21);
        System.out.println("frequency of 21 is: "+frequencyOf);
        numbers.addAll(Arrays.asList(23,21,42,45));

        numbers.removeAll(Arrays.asList(21));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(23,42,45,9,8,5));
        System.out.println(numbers);
        boolean r1=numbers.containsAll(Arrays.asList(1,3,7,10));
        System.out.println(r1);
        numbers.removeIf(p->p<10);
        System.out.println(numbers);





    }
}
