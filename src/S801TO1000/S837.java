package S801TO1000;

public class S837 {
    public int countPalindromicSubstrings(String str) {
        int n = str.length();
        int res = 0;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; ++j) {
                dp[j][i] = ( str.charAt (j) == str.charAt (i) && (i - j <= 2 || dp[j + 1][i - 1] == 1)) ? 1 : 0;
                res += dp[j][i];
            }
        return res;
    }
}
