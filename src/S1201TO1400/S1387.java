package S1201TO1400;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S1387 {
    public int numFactoredBinaryTrees(int[] A) {
        //
        if (A == null || A.length == 0)
            return 0;

        long res = 0L;
        long mod = (long) Math.pow(10, 9) + 7;

        Arrays.sort(A);
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], 1L);
            for (int j = i; j >= 0; j--) {
                if ((A[i] % A[j] == 0) && map.containsKey(A[i] / A[j]))
                {
                    map.put(A[i], (map.get(A[i]) + map.get(A[j]) * map.get(A[i] / A[j])) % mod);
                }
            }
        }

        for (long v : map.values())
            res = (res + v) % mod;
        return (int) res;
    }
}
