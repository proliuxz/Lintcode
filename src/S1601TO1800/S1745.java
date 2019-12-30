package S1601TO1800;

public class S1745 {
    public boolean isMonotonic(int[] A) {
        // Write your code here.
        boolean asc = true;
        boolean des = true;
        for (int i = 0; i < A.length - 1; i++) {
            asc &= A[i] <= A[i+1];
            des &= A[i] >= A[i+1];
        }
        return asc || des;
    }
}
