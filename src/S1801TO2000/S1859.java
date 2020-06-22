package S1801TO2000;

import java.util.Arrays;

public class S1859 {
    public int MinimumAmplitude(int[] A) {
        if (A.length < 4)
            return 0;
        Arrays.sort(A);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int tmp = A[A.length - 4 + i] - A[i];
            res = Math.min(tmp, res);
        }
        return res;
    }
}
