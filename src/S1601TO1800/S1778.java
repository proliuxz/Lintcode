package S1601TO1800;

import java.util.Map;
import java.util.TreeMap;

public class S1778 {
    public int oddEvenJumps(int[] A){
        int res = 1, lenA = A.length;
        boolean []higher = new boolean[lenA];
        boolean []lower = new boolean[lenA];
        higher[lenA - 1] = lower[lenA - 1] = true;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(A[lenA - 1], lenA - 1);
        for (int i = lenA - 2; i >= 0; i--) {
            Map.Entry high = treeMap.ceilingEntry(A[i]);
            Map.Entry low = treeMap.floorEntry(A[i]);
            if (high != null)
                higher[i] = lower[(int)high.getValue()];
            if (low != null)
                lower[i] = higher[(int)low.getValue()];
            if (higher[i])
                res ++;
            treeMap.put(A[i], i);
        }
        return res;
    }
}
