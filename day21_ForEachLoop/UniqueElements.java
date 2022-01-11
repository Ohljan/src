package day21_ForEachLoop;



public class UniqueElements {
    public static void main(String[] args) {
        String[] names = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Cihan", "Cihan", "Cydeo"};
        for (String each : names) {// each: element represent same
            int count = 1;
            for (String element : names) {
                if (element.equals("Layan")) {
                    count++;
                }
            }   //this is one with the for loop but it s better to each loop it s faster*/
            if (count == 1) {
                System.out.println(each);
            }


        }
    }
}// check the muhtars note on the github