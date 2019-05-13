package S001TO200;

public class S111 {
    public int climbStairs(int n) {
        // write your code here
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int[] tmp = new int[n + 1];
        tmp[0] = 1;
        tmp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            tmp[i] = tmp[i - 1] + tmp[i - 2];
        }
        return tmp[n];
    }
}
