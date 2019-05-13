package S001TO200;

public class S037 {
    public int reverseInteger(int number) {
        // write your code here
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.reverse();
        return Integer.valueOf(sb.toString());
    }
}
