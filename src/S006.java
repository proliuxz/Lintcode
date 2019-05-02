public class S006 {
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int m = A.length;
        int n = B.length;
        int res[] = new int[m+n];

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0)
        {
            if (j < 0 || (i >= 0 && A[i] > B[j]))
                res[k--] = A[i--];
            else
                res[k--] = B[j--];
        }
        return res;
    }
}
