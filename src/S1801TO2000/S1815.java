package S1801TO2000;

public class S1815 {
    public long solve(int n, int k, int len, int[] num) {
        //
        long res = 0;
        long trigger = k;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < len)
                sum += num[i];
            else {
                sum += num[i];
                sum -= num[i-len];
            }
            if (i >= len-1 && (sum / len) > trigger)
                res++;
        }
        return res;
    }
}
