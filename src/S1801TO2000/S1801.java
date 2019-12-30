package S1801TO2000;

import java.util.Arrays;

public class S1801 {
    public int theSumofLegalSet(int[] a, int k) {
        int tmp[] = new int[10001];
        int mod = (int) 1e9 + 7;
        int i, j;
        int res;
        Arrays.sort(a);
        tmp[0] = 1;
        for (i = 1; i <= 10000; i++)
            tmp[i] = tmp[i - 1] * 2 % mod;
        j = -1;
        for (i = 0; i < a.length; i++)
            if (a[i] + a[0] <= k)
                j = i;
            else 
                break;
        if (j == -1) 
            return 0;
        res = tmp[j];
        for (i = 1; i < a.length; i++) {
            while (a[i] + a[j] > k && j > i) j--;
            if (a[i] + a[j] > k) return res;
            res = (res + tmp[(j - i)]) % mod;
        }
        return res;
    }
}
