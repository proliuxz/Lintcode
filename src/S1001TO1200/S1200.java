package S1001TO1200;

import java.util.Map;
import java.util.TreeMap;

public class S1200 {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>((o1, o2) -> o2-o1);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        String[] res = new String[nums.length];
        int i = 0;
        for (int key: map.keySet()
             ) {
            int v = map.get(key);
            if (i == 0)
                res[v] = "Gold Medal";
            else if (i == 1)
                res[v] = "Silver Medal";
            else if (i == 2)
                res[v] = "Bronze Medal";
            else
                res[v] = String.valueOf(i + 1);
            i++;
        }
        return res;
    }
}
