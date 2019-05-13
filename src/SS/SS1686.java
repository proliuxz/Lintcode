package SS;

import java.util.Arrays;

public class SS1686 {
    public int getMinimumNumOfBoots(int n, int b, int[] f, int[] s, int[] d) {
        int dp[] = new int[n];
        dp[0] = 0;
        for(int i = 1; i < n; i++){
            dp[i] = n + 99999;
            for(int j = 0; j < i; j++){
                for(int k = dp[j] ; k < b ; k++){
                    if(k >= dp[i]) break;
                    if(i-j <=d [k] && f[i] <=s [k] && f[j] <= s[k]){
                        dp[i]=Math.min(dp[i],k);
                        break;
                    }
                }
            }
        }
        return dp[n-1];
    }
}
