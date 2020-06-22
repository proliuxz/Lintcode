package S1001TO1200;

import java.util.TreeMap;

public class S1148 {
    public int findLHS(int[] nums) {
        TreeMap<Integer,Integer> vis = new TreeMap<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++)
            vis.put(nums[i], vis.getOrDefault(nums[i], 0) + 1);

        for(int i = 0; i < nums.length; i++)
            if(vis.getOrDefault(nums[i] - 1, 0) != 0)
                res = Math.max(res, vis.get(nums[i] - 1) + vis.get(nums[i]));
        return res;
    }
}
