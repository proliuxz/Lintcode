package S001TO200;

import java.util.Collections;
import java.util.List;

public class S046 {
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        Collections.sort(nums);
        return nums.get(nums.size()>>1);
    }
}
