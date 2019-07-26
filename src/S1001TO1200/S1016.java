package S1001TO1200;

public class S1016 {
    public int minSwap(int[] A, int[] B) {
        if (A == null || A.length == 0 || B == null || B.length == 0 || A.length != B.length)
            return 0;

        int len = A.length;
        int keep = 0;
        int swap = 1;
        for(int i = 1; i < len; i++){
            if(A[i - 1] >= B[i] || B[i - 1] >= A[i])
                swap++;
            else if(A[i - 1] >= A[i] || B[i - 1] >= B[i]){
                int tmp = keep;
                keep = swap;
                swap = tmp + 1;
            }
            else {
                int tmp = Math.min(keep, swap);
                keep = tmp;
                swap = tmp + 1;
            }
        }
        return Math.min(keep, swap);
    }
}
