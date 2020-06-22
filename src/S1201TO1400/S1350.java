package S1201TO1400;

public class S1350 {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            n--;
            str.append((char) ((n % 26) + 'A'));
            n /= 26;
        }
        return str.reverse().toString();
    }
}
