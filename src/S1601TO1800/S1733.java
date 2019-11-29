package S1601TO1800;

public class S1733 {
    public int smallestRangeI(int[] A, int K) {
        // write your code here
        if (A == null || A.length == 0 || A.length == 1)
            return 0;
        int max = A[0];
        int min = A[0];
        for (int num: A) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.max(0, max - min - 2*K);
    }
}
