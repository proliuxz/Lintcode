package S1601TO1800;

public class S1067 {
    public int[][] splitLinkedListinParts(int[] root, int k) {
        int n = root.length;
        int sum = n % k;
        int start = 0;
        int[][] res = new int[k][];
        int sign;
        for (int i = 0; i < k; i++) {
            if (start >= n)
                res[i] = new int[0];
            else {
                if (sum > 0)
                    sign = n / k + 1;
                else
                    sign = n / k;
                res[i] = new int[sign];
                for (int j = 0; j < sign ; j++) {
                    res[i][j] = root[start];
                    start++;
                }
                if (sum > 0)
                    sum--;
            }
        }
        return res;
    }
}
