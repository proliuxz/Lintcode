package S1601TO1800;

import java.util.HashMap;
import java.util.Map;

public class S1779 {
    public int getLength(int[] arr) {
        // Write your code here.
        if (arr == null || arr.length == 0)
            return -1;
        Map<Integer, Integer> numPos = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (numPos.containsKey(val))
            {
                int pos = numPos.get(val);
                res = Math.min(res, i - pos);
                numPos.put(val,i);
            }
            else
                numPos.put(val, i);
        }
        return arr.length == numPos.size() ? -1 : res + 1;
    }
}
