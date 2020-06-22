package S601TO800;

public class S678 {
    public String shortestPalindrome(String str) {
        int n = str.length();
        String rev = new StringBuilder(str).reverse().toString();
        String s = str + "#" + rev;
        int len = s.length();
        int[] f = new int[len];
        for (int i = 1; i < len; i++) {
            int t = f[i - 1];
            while (t > 0 && s.charAt(i) != s.charAt(t))
                t = f[t - 1];
            if (s.charAt(i) == s.charAt(t))
                ++t;
            f[i] = t;
        }
        return rev.substring(0, n - f[len - 1]) + str;
}
}
