package day29_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class BulkeOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,8,8,8));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));//remove all at once
        System.out.println(list);
        System.out.println("-------------------");
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));//these are elements we want to keep it in the arayslist
        System.out.println(numbers);
        System.out.println("------------------");
        ArrayList<String>jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developper","QA","SDET","Scrum Master","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));// will keep all mathing ""QA","SDET"
        System.out.println(jobTitles);
        System.out.println("-------------------------");
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1=nums.contains(10);// only allows to check one by one
        boolean r2=nums.contains(2) && nums.contains(5) && nums.contains(10);// instead of use it several times can use containsAll method
        boolean r3=nums.containsAll(Arrays.asList(2,5,10));// r2 and r3 means same thing , just easier to check several element at the same time
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("-------------------------------------");
        String [] names={"Josh","Jack","Daniel","Shay","Breanna"};
       /* ArrayList<String> namesList=new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);*/
        ArrayList<String>namesList=new ArrayList<>(Arrays.asList(names));// this is can be used only when the array type is non primitive
        System.out.println(namesList);
        System.out.println("--------------------");
        Integer []arr={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);
        System.out.println("----------------");
        int[] arr2={1,2,3,4,5,6,7,8,10};
        ArrayList<Integer>list3=new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);
    }
    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }

}
