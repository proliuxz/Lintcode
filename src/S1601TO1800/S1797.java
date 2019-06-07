package S1601TO1800;

public class S1797 {
    public int[] optimalUtilization(int[] A, int[] B, int K) {
        // write your code here
        if (A == null || B == null)
            return new int[0];
        int aLen = A.length;
        int bLen = B.length;
        if (aLen == 0 || bLen == 0)
            return new int[0];
        int[] res = new int[2];
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < aLen; i++) {
            for (int j = 0; j < bLen ; j++) {
                int tmp = A[i] + B[j];
                if (tmp > K)
                    continue;
                if (tmp > sum)
                {
                    sum = tmp;
                    res = new int[] { i, j };
                }
            }
        }
        return res;
    }
}
