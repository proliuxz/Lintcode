package S1601TO1800;

import java.util.List;

public class S1645 {
    public int LeastSubsequences(List<Integer> arrayIn) {
        // Write your code here.
        int n = arrayIn.size();
        int[] dp = new int[n];
        dp[0] = 1;
        int ans = 1;
        for(int i = 1; i < n ;i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arrayIn.get(i) >= arrayIn.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
