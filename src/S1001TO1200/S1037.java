package S1001TO1200;

public class S1037 {
    public boolean isIdealPermutation(int[] A) {
        int max = 0;
        for(int i = 2; i < A.length; i++) {
            max = Math.max(max, A[i - 2]);
            if(A[i] < max)
                return false;
        }
        return true;
    }
}
