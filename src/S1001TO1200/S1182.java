package S1001TO1200;

public class S1182 {
    public String reverseStringII(String s, int k) {
        // Write your code here.
        String res = new String("");
        int l = s.length();
        int i, j;
        for (i = 0;i < l;i += 2 * k) {
            for (j = Math.min(l - 1, i + k - 1);j >= i;j--)
                res = res + s.charAt(j);
            for (j = i + k;j < Math.min(i + 2 * k, l);j++)
                res = res + s.charAt(j);
        }
        return res;
    }
}
