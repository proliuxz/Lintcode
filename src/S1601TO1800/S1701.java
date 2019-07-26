package S1601TO1800;

public class S1701 {
    public boolean validMountainArray(int[] A) {
        // Write your code here.
        if (A == null || A.length < 3) {
            return false;
        }

        int i = 0;
        while(i + 1 <= A.length - 1 && A[i] < A[i + 1])
            i++;
        if(i == A.length - 1 || i == 0){
            return false;
        }
        while(i + 1 <= A.length - 1 && A[i] > A[i + 1])
            i++;
        if(i == A.length - 1){
            return true;
        }
        return false;
    }
}
