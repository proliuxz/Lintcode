package S201TO400;

public class S272 {
    public int climbStairs2(int n) {
        // write your code here
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[] tmp = new int[n + 1];
        tmp[0] = 1;
        tmp[1] = 1;
        tmp[2] = 2;
        for (int i = 3; i < n + 1 ; i++) {
            tmp[i] = tmp[i - 1] + tmp[i - 2] + tmp[i - 3];
        }
        return tmp[n];
    }
}
