import java.util.ArrayList;
import java.util.List;

public class listexample2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Iterating through list using an enhanced for loop(for-each loop)
        for(int num: numbers) {
            System.out.println(num);
        }


        // Iterating through the list using a for loop
        for(int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }




    }
}
