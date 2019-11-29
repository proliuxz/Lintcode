package S401TO600;

public class S512 {
    public int numDecodings(String s) {
        // write your code here
        if (s == null || s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        int len = s.length();
        char[] sc = s.toCharArray();
        int[] dp = new int[len + 1];
        dp[0] = 1;

        for (int i = 1; i <= len; i++) {
            if (sc[i - 1] != '0')
                dp[i] += dp[i - 1];

            if (i >= 2) {
                int v = (sc[i - 2] - '0') * 10 + sc[i - 1] - '0';
                if (10 <= v && v <= 26)
                    dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }
}
