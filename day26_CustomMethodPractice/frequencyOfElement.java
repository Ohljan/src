package day26_CustomMethodPractice;

public class frequencyOfElement {
    public static void main(String[] args) {

    }
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
}
