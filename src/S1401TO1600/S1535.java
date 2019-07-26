package S1401TO1600;

public class S1535 {
    public String toLowerCase(String str) {
        // Write your code here
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if ('A' <= a[i] && a[i] <= 'Z') {
                a[i] = (char) (a[i] - 'A' + 'a');
            }
        }
        return new String(a);
    }
}
