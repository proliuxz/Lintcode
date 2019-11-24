package S1401TO1600;

public class S1480 {
    public int dotProduct(int[] A, int[] B) {
        // Write your code here
        if (A == null || B == null || A.length == 0 || B.length == 0 || A.length != B.length)
            return -1;
        long res = 0;
        for (int i = 0; i < A.length ; i++) {
            res += A[i] * B[i];
        }
        return (int) res;
    }
}
