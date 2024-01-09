

public class reversestring {
    public static void main(String[] args) {
        String str = " you are amazing";
        String revstr = " ";

        StringBuilder

        for(int i=str.length(); i<0; i--) {
            revstr += str.charAt(i);
        }
        System.out.println(revstr);
    }
}
