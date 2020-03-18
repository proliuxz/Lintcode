package S1801TO2000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S1808 {
    Map<Integer, Set<Integer>> map = new HashMap<>();
    public int minDominoRotations(int[] A, int[] B) {
        int len = A.length;
        for (int i = 0; i < len; i++) {
            helper(i, A[i]);
            helper(i, B[i]);
        }
        int res = -1;
        for (int k : map.keySet()) {
            if (map.get(k).size() == len)
                res = k;
        }
        if (res == -1 )
            return res;
        int cntA = 0;
        int cntB = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] != res)
                cntA++;
            if (B[i] != res)
                cntB++;
        }
        return Math.min(cntA, cntB);
    }
    private void helper(int pos, int val) {
        Set set = map.getOrDefault(val, new HashSet<Integer>());
        set.add(pos);
        map.put(val, set);
    }
}
