import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class RoundList {
    public static void main(String[] args) {


        List<Double> number = new ArrayList<>();
        number.add(0.33333333);
        number.add(0.1222222);
        number.add(0.5);

        DecimalFormat df = new DecimalFormat("0.000000");

        for(double num: number) {
            System.out.println(df.format(num));
        }



    }
}