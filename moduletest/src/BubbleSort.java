import java.lang.reflect.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 6, 1, 8, 7, 9};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }


        for (
                int value : array) {
            System.out.println(array);
        }
    }
}