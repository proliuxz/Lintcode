package S001TO200;

import java.util.Arrays;

public class S065 {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (findKth(A, B, l) + findKth(A, B, r)) / 2;
    }

    double findKth(int[] A, int[] B, int k) {
        int m = A.length;
        int n = B.length;
        if (m == 0)
            return B[k - 1];
        if (n == 0)
            return A[k - 1];
        if (k == 1)
            return Math.min(A[0], B[0]);
        int i = Math.min(m, k / 2);
        int j = Math.min(n, k / 2);
        if (A[i - 1] > B[j - 1])
            return findKth(A, Arrays.copyOfRange(B, j, n), k - j);
        else
            return findKth(Arrays.copyOfRange(A, i, m), B, k - i);
    }
}
