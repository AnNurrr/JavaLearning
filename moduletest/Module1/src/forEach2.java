public class forEach2 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int square = 0;
        int sum = 0;
        for(int number: numbers) {
            square = number* number;
            System.out.println(square);
        }


    }
}
