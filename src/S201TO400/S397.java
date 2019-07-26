package S201TO400;

public class S397 {
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }

        int len = A.length;
        int res = 1;

        int length = 1; // just A[0] itself
        for (int i = 1; i < len; i++) {
            if (A[i] > A[i - 1]) {
                length++;
            } else {
                length = 1;
            }
            res = Math.max(res, length);
        }

        // from right to left
        length = 1;
        for (int i = len - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                length++;
            } else {
                length = 1;
            }
            res = Math.max(res, length);
        }

        return res;
    }
}
