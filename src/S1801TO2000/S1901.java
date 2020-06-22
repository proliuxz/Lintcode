package S1801TO2000;

import java.util.Arrays;

public class S1901 {
    public int[] SquareArray(int[] A) {
        for (int i = 0; i < A.length; i++)
            A[i] = (int) Math.pow(A[i], 2);
        Arrays.sort(A);
        return A;
    }
}
