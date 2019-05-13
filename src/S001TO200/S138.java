package S001TO200;

import java.util.ArrayList;
import java.util.HashMap;


public class S138 {
    public ArrayList<Integer> subarraySum(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return result;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                result.add(map.get(sum) + 1);
                result.add(i);
                return result;
            }
            map.put(sum, i);
        }
        return result;
    }
}
