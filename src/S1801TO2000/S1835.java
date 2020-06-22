package S1801TO2000;

public class S1835 {
    int m = 1000000007;
    public int numWays(int steps, int arrLen) {
        return dfs(steps, 0, arrLen);
    }

    private int dfs(int left, int cur, int arrLen){
        if (cur >= arrLen || cur < 0)
            return 0;
        if (left == 0){
            if (cur == 0)
                return 1;
            return 0;
        }
        if (cur > left) return 0;
        return (dfs(left - 1, cur, arrLen) % m +
                dfs(left - 1, cur - 1, arrLen) % m +
                dfs(left - 1, cur + 1, arrLen)) % m;
    }
}
