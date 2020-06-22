package S601TO800;

/*
    799. 背包问题VIII
    给一些不同价值和数量的硬币。找出这些硬币可以组合在1 ~ n范围内的值的数量

    样例
    样例 1:
        输入:
            n = 5
            value = [1,4]
            amount = [2,1]
        输出:  4

        解释:
        可以组合出1，2，4，5

    样例 2:
        输入:
            n = 10
            value = [1,2,4]
            amount = [2,1,1]
        输出:  8

        解释:
        可以组合出1-8所有数字。
     */
public class S799 {
    public int backPackVIII(int n, int[] value, int[] amount) {
        boolean[] dp = new boolean[n + 1];
        int len = value.length;
        int res = 0;
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            int[] cnt = new int[n + 1];
            for (int j = value[i]; j <= n; j++) {
                if (!dp[j] && dp[j - value[i]] && cnt[j - value[i]] < amount[i]) {
                    cnt[j] += cnt[j - value[i]] + 1;
                    dp[j] = true;
                    res++;
                }
            }

        }
        return res;
    }
}
