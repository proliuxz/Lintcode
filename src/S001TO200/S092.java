package S001TO200;

public class S092 {
    public int backPack(int m, int[] A) {
        // write your code here
        int len = A.length;
        int[] backpack = new int[m + 1];
        for(int i = 0; i < len; i++) {
            for(int j = m; j >= 1; j--) {
                if(j >= A[i]) {
                    backpack[j] = Math.max(backpack[j],backpack[j-A[i]] + A[i]);
                }
            }
        }
        return backpack[m];
    }
}
