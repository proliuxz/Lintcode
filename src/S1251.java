public class S1251 {
    public int splitArray(int[] nums, int m) {
        // write your code here
        int[][] dp = new int[m][nums.length];
        dp[0][0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[0][i] = dp[0][i - 1] + nums[i];
        }
        for(int i = 1; i < m; i++){
            for(int j = 0; j < nums.length; j++){
                dp[i][j]=Integer.MAX_VALUE;
                int sum = nums[j];
                for(int k = j - 1;k >= 0; k--){
                    dp[i][j]=Math.min(dp[i][j], Math.max(dp[i - 1][k],sum));
                    sum += nums[k];
                }
            }
        }
        return dp[m-1][nums.length-1];
    }
    public static void main(String[] args)
    {
        S1251 s = new S1251();
        int[] nums = {7,2,5,10,8};
        int m = 2;
        int res = s.splitArray(nums, m);
        System.out.println(res);
    }
}
