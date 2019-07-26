package S1601TO1800;

public class S1698 {
    public int minDeletionSize(String[] A) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }
        int result = 0;
        for (int c = 0; c < A[0].length(); c++) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i].charAt(c) > A[i+1].charAt(c)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
