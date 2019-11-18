package S1601TO1800;

public class S1617 {
    public int getAnswer(int[] a) {
        // Write your code here
        int res = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (a[j] % 2 == 1) {
                        res = Math.max(res, a[i] - a[j]);
                    }
                }
            }
        }
        return res;

    }
}
