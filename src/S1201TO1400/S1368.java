package S1201TO1400;

import java.util.HashMap;
import java.util.Map;

public class S1368 {
    public String sameNumber(int[] nums, int k) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val) && (i - map.get(val) < k))
                return "YES";
            map.put(val, i);
        }
        return "NO";
    }

    public static void main(String[] args)
    {
        S1368 s = new S1368();
        int[] nums = {1,2,3,4,5,6,7,7};
        int k = 1;
        System.out.println(s.sameNumber(nums, k));
    }
}
