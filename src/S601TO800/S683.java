package S601TO800;

import java.util.*;

public class S683 {
    public int wordBreak3(String s, Set<String> dict) {
        s = s.toLowerCase();
        Set<String> lowerDict = new HashSet<>();
        for (String word : dict)
            lowerDict.add(word.toLowerCase());
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int l = 0; l < n; l++) {
            for (int r = l + 1; r <= n; r++) {
                if (lowerDict.contains(s.substring(l, r)))
                    dp[r] += dp[l];
            }
        }
        return dp[n];
    }
}
