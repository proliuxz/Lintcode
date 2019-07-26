package S1401TO1600;

import java.util.HashMap;
import java.util.Map;

public class S1443 {
    public int getAns(String S) {
        // Write your code here
        int len = S.length();
        int dp[] = new int[len + 1];
        dp[1] = (S.charAt(0) - 'A') == 1 ? 1 : -1;
        for (int i = 2; i <= len; i++) {
            dp[i] = (S.charAt(i - 1) - 'A') == 1 ? 1 : -1;
            dp[i] += dp[i - 1];
        }

        int max = 0, begin;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 1; i <= len; i++) {
            begin = m.getOrDefault(dp[i], 0);
            if (begin == 0 && dp[i] != 0) {
                m.put(dp[i], i);
            } else {
                if (i - begin > max) {
                    max = i - begin;
                }
            }
        }
        return max;
    }
}
