import java.util.ArrayList;
import java.util.List;

public class list4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(0);

        int biggest=0;
        int count=0;

        for(int num:numbers) {
            if(num>biggest) {
                biggest=num;
                count=1;
            }else if(num==biggest) {
                count++;
            }
        }
        System.out.println(count);

    }
}
