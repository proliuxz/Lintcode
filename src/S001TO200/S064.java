package S001TO200;

public class S064 {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        for (int i = m + n - 1, j = m - 1, k = n - 1;i > 0 ; i--) {
            if (j >= 0 && k >= 0)
            {
                if(A[m] > A[n])
                    A[i] = A[j--];
                else
                    A[i] = B[k--];
            }
            else if (j >= 0)
                A[i] = A[j--];
            else if (k >= 0)
                A[i] = B[k--];
        }
    }
}
