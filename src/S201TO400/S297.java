package S201TO400;

import java.util.Arrays;

public class S297 {
    public int[][] TowerPeaple(int[][] figures) {
        // write your code here
        Arrays.sort(figures, (int[] a, int[] b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int max = Integer.MIN_VALUE;
        int[] dp = new int[figures.length];
        for(int i = 0; i < dp.length; i++){
            dp[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                if((figures[i][1] > figures[j][1]) ||
                        (figures[i][1] == figures[j][1] && figures[i][0] == figures[j][0])){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return null;
    }
}
