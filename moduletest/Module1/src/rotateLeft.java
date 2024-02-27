import java.util.Arrays;

public class rotateLeft {
    public static void main(String[] args) {


        int [] array = {1, 2, 3, 4, 5};
        int f = array[0];

        for(int i=0; i<array.length-1; i++) {
            array[i] = array[i+1];

        }
        array[array.length-1] = f;

        for(int number: array) {
            System.out.print(number + " ");
        }

    }
}