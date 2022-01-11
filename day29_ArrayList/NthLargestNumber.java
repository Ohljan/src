package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8));
        System.out.println(list);
        int n=3;// means need to find the 3rd max number
        for (int i = 1; i < n; i++) {
            list.removeIf(p->Collections.max(list)==p);
        }
       // list.removeIf(p->Collections.max(list)==p);===>remove the first max number
       // list.removeIf(p->Collections.max(list)==p);==> remove the second max number
       int max= Collections.max(list);
        System.out.println(max);





    }
}
