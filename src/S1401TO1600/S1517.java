package S1401TO1600;

import java.util.Arrays;

public class S1517 {
    public int[] largestSubarray(int[] A, int K) {
        if (A == null || K > A.length)
            return null;
        if (K == A.length)
            return A;

        int[] res = Arrays.copyOfRange(A, 0, K);
        for (int i = 1; i <= A.length - K; i++) {
            int[] temp = Arrays.copyOfRange(A, i, i + K);
            res = helper(res, temp);
        }
        return res;
    }

    private int[] helper(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i])
                return arr1;
            else if (arr1[i] < arr2[i])
                return arr2;
        }
        return arr1;
    }
}
