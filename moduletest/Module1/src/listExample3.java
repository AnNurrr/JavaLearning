import java.util.ArrayList;
import java.util.List;

public class listExample3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("red");

        System.out.println("Colors" + colors);

        //removing element by value
        colors.remove("blue");

        System.out.println(colors);

        //removing element by index
        colors.remove(2);
        System.out.println(colors);
    }
}
