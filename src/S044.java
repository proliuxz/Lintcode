import java.util.List;

public class S044 {
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0)
            return 0;
        int[] sum = new int[nums.size()];
        sum[0] = nums.get(0);
        for (int i = 1; i < nums.size() ; i++) {
            sum[i] = Math.min(nums.get(i), nums.get(i) + sum[i - 1]);
        }
        int result = Integer.MAX_VALUE;
        for (int s: sum
        ) {
            if (s < result)
                result = s;
        }
        return result;
    }
}
