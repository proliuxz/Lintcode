public class SS1689 {
    public int getAns(int[] a, int k, int target) {
        // write your code here
        int len = a.length;
        int [][][] dp = new int[len+1][k+1][target+1];

        if(target < 0)
            return 0;

        for(int i = 0; i <= len; ++i)
            for(int j = 0; j <= k; ++j)
                for(int p = 0; p <= target; ++p)
                {
                    if(j == 0 && p == 0)
                        dp[i][j][p] = 1;
                    else if(i != 0 && j != 0 && p!= 0)
                    {
                        dp[i][j][p] = dp[i-1][j][p];
                        if(p >= a[i-1])
                            dp[i][j][p] += dp[i-1][j-1][p-a[i-1]];
                    }

                }

        return dp[len][k][target];
    }

    public static void main(String[] args)
    {
        SS1689 s = new SS1689();
        int[] a = new int[] {10,3,1,1};
        int k = 3;
        int target = 5;
        int res = s.getAns(a, k, target);
        System.out.println(res);
    }
}
